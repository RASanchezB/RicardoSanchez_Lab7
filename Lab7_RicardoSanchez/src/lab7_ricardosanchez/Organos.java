package lab7_ricardosanchez;

import java.awt.Color;
import java.util.ArrayList;

public class Organos {
    private String Nombre;
    private String color;
    private ArrayList <String> Caracteristicas = new ArrayList();
    private int Nivel_Efectividad;
    private int Nivel_Potenciado;
    private int Nivel_Prueba;

    public Organos() {
    }

    public Organos(String Nombre, String color, int Nivel_Efectividad, int Nivel_Potenciado, int Nivel_Prueba) {
        this.Nombre = Nombre;
        this.color = color;
        this.Nivel_Efectividad = Nivel_Efectividad;
        this.Nivel_Potenciado = Nivel_Potenciado;
        this.Nivel_Prueba = Nivel_Prueba;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<String> getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

    public int getNivel_Efectividad() {
        return Nivel_Efectividad;
    }

    public void setNivel_Efectividad(int Nivel_Efectividad) {
        this.Nivel_Efectividad = Nivel_Efectividad;
    }

    public int getNivel_Potenciado() {
        return Nivel_Potenciado;
    }

    public void setNivel_Potenciado(int Nivel_Potenciado) {
        this.Nivel_Potenciado = Nivel_Potenciado;
    }

    public int getNivel_Prueba() {
        return Nivel_Prueba;
    }

    public void setNivel_Prueba(int Nivel_Prueba) {
        this.Nivel_Prueba = Nivel_Prueba;
    }

    @Override
    public String toString() {
        return "Organos{" + "Nombre=" + Nombre + ", color=" + color + ", Caracteristicas=" + Caracteristicas + ", Nivel_Efectividad=" + Nivel_Efectividad + ", Nivel_Potenciado=" + Nivel_Potenciado + ", Nivel_Prueba=" + Nivel_Prueba + '}';
    }
    
}
