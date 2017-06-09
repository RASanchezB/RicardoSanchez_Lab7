package lab7_ricardosanchez;

import java.util.ArrayList;
import java.util.Date;

public class Pacientes extends Personas{
    private ArrayList <String> Enfermedades = new ArrayList();
    private Date Fecha_Ingreso;
    private Date Fecha_Alta;
    private String Tipo_Sangre;
    private String Causa_Vistita;
    private ArrayList <String> Alergias = new ArrayList();
    private ArrayList <Organos> Organos_Evaluar = new ArrayList();

    public Pacientes() {
    super();
    }

    public Pacientes(Date Fecha_Ingreso, Date Fecha_Alta, String Tipo_Sangre, String Causa_Vistita, String Nombre, int Edad, String ID, double Altura, double Peso, String Sexo) {
        super(Nombre, Edad, ID, Altura, Peso, Sexo);
        this.Fecha_Ingreso = Fecha_Ingreso;
        this.Fecha_Alta = Fecha_Alta;
        this.Tipo_Sangre = Tipo_Sangre;
        this.Causa_Vistita = Causa_Vistita;
    }

    public ArrayList<String> getEnfermedades() {
        return Enfermedades;
    }

    public void setEnfermedades(ArrayList<String> Enfermedades) {
        this.Enfermedades = Enfermedades;
    }

    public Date getFecha_Ingreso() {
        return Fecha_Ingreso;
    }

    public void setFecha_Ingreso(Date Fecha_Ingreso) {
        this.Fecha_Ingreso = Fecha_Ingreso;
    }

    public Date getFecha_Alta() {
        return Fecha_Alta;
    }

    public void setFecha_Alta(Date Fecha_Alta) {
        this.Fecha_Alta = Fecha_Alta;
    }

    public String getTipo_Sangre() {
        return Tipo_Sangre;
    }

    public void setTipo_Sangre(String Tipo_Sangre) {
        this.Tipo_Sangre = Tipo_Sangre;
    }

    public String getCausa_Vistita() {
        return Causa_Vistita;
    }

    public void setCausa_Vistita(String Causa_Vistita) {
        this.Causa_Vistita = Causa_Vistita;
    }

    public ArrayList<String> getAlergias() {
        return Alergias;
    }

    public void setAlergias(ArrayList<String> Alergias) {
        this.Alergias = Alergias;
    }

    public ArrayList<Organos> getOrganos_Evaluar() {
        return Organos_Evaluar;
    }

    public void setOrganos_Evaluar(ArrayList<Organos> Organos_Evaluar) {
        this.Organos_Evaluar = Organos_Evaluar;
    }

    @Override
    public String toString() {
        return "Paciente: " + super.getNombre();
    }
    
}
