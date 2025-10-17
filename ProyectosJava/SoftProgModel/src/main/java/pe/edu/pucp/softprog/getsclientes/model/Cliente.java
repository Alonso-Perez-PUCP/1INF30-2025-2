/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.softprog.getsclientes.model;

import java.time.LocalDate;
import pe.edu.pucp.softprog.rrhh.model.Persona;

/**
 *
 * @author alons
 */
public class Cliente extends Persona{
    private double lineaCredito;
    private Categoria categoria;
    
    public Cliente(){
        
    }

    public Cliente(int idPersona, String Dni, String nombre, 
            String apellidoPaterno, char genero, LocalDate fechaNacimiento, 
            double lineaCredito, Categoria categoria) {
        super(idPersona, Dni, nombre, apellidoPaterno, genero, fechaNacimiento);
        this.lineaCredito = lineaCredito;
        this.categoria = categoria;
    }
    
    public Cliente(Cliente cliente){
        super(cliente);
        this.lineaCredito=cliente.lineaCredito;
        this.categoria=cliente.categoria;
    }

    public double getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(double lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}
