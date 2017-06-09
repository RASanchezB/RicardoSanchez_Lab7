package lab7_ricardosanchez;
public class Personas {
    private String Nombre;
    private int Edad;
    private String ID;
    private double Altura;
    private double Peso;
    private String Sexo;

    public Personas() {
    }

    public Personas(String Nombre, int Edad, String ID, double Altura, double Peso, String Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.ID = ID;
        this.Altura = Altura;
        this.Peso = Peso;
        this.Sexo = Sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
