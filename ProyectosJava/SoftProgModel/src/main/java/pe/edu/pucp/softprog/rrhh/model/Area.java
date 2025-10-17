/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.softprog.rrhh.model;

/**
 *
 * @author alons
 */
public class Area {
    private int idArea;
    private String nombre;
    private boolean activo;
    
    public Area(){
        
    }
    
    public Area(int idArea, String nombre, boolean activo){
        this.idArea=idArea;
        this.nombre=nombre;
        this.activo=activo;
    }
    
    public Area(String nombre){
        this.nombre=nombre;
    }
    
    public Area(Area area){
        this.idArea=area.idArea;
        this.nombre=area.nombre;
        this.activo=area.activo;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
