package lab7_ricardosanchez;

    import java.io.EOFException;
    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileOutputStream;
    import java.io.ObjectInputStream;
    import java.io.ObjectOutputStream;
    import java.util.ArrayList;

public class Administrar_Binarios {
    private ArrayList <Personas> listaPersonas = new ArrayList();
    private File archivo;
    
    public Administrar_Binarios(String Path) {
        archivo = new File(Path);
    }

    public ArrayList<Personas> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Personas> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
     @Override
    public String toString() {
        return "AdminPersona{" + "listaPersonas=" + listaPersonas + ", archivo=" + archivo + '}';
    }
    public void setPersona(Personas P){
        this.listaPersonas.add(P);
    }
    public void cargarArchivo(){
        try {
            listaPersonas = new ArrayList();
            Personas temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Personas)objeto.readObject()) != null){
                        listaPersonas.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void escribitArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Personas t: listaPersonas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}

