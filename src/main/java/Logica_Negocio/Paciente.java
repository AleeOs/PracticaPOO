/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Alexis
 */
public class Paciente {
    
    public String Cedula;
    public  String Nombre;
    public String Telefono;

    public Paciente() {
    }

    public Paciente(String Cedula, String Nombre, String Telefono) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }
    
    
}
