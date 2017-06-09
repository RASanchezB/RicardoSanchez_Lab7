package lab7_ricardosanchez;

import java.util.ArrayList;

public class Doctores extends Personas{
    private ArrayList <String> Especialidades = new ArrayList();
    private ArrayList <Pacientes> Pacientes = new ArrayList();
    private int AñosComoDoc;
    private String Horario;
    private ArrayList <String> Dias_Trabajo = new ArrayList();

    public Doctores() {
        super();
    }

    public Doctores(int AñosComoDoc, String Horario, String Nombre, int Edad, String ID, double Altura, double Peso, String Sexo) {
        super(Nombre, Edad, ID, Altura, Peso, Sexo);
        this.AñosComoDoc = AñosComoDoc;
        this.Horario = Horario;
    }

    public ArrayList<String> getEspecialidades() {
        return Especialidades;
    }

    public void setEspecialidades(ArrayList<String> Especialidades) {
        this.Especialidades = Especialidades;
    }

    public ArrayList<Pacientes> getPacientes() {
        return Pacientes;
    }

    public void setPacientes(ArrayList<Pacientes> Pacientes) {
        this.Pacientes = Pacientes;
    }

    public int getAñosComoDoc() {
        return AñosComoDoc;
    }

    public void setAñosComoDoc(int AñosComoDoc) {
        this.AñosComoDoc = AñosComoDoc;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public ArrayList<String> getDias_Trabajo() {
        return Dias_Trabajo;
    }

    public void setDias_Trabajo(ArrayList<String> Dias_Trabajo) {
        this.Dias_Trabajo = Dias_Trabajo;
    }

    @Override
    public String toString() {
        return "Doctor: " + super.getNombre();
    }
    
    
}
