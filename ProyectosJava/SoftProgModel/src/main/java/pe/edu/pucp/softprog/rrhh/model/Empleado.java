/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.softprog.rrhh.model;

import java.time.LocalDate;

/**
 *
 * @author alons
 */
public class Empleado extends Persona{
    private String cargo;
    private double sueldo;
    private boolean activo;

    public Empleado() {
    }

    public Empleado(int idPersona, String Dni, String nombre, 
            String apellidoPaterno, char genero, LocalDate fechaNacimiento, 
            String cargo, double sueldo, boolean activo) {
        super(idPersona, Dni, nombre, apellidoPaterno, genero, fechaNacimiento);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.activo = activo;
    }

    public Empleado(Empleado empleado) {
        super(empleado);
        this.cargo = empleado.cargo;
        this.sueldo = empleado.sueldo;
        this.activo = empleado.activo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}
