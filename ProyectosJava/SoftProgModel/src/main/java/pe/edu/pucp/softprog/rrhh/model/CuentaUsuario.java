/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.softprog.rrhh.model;

/**
 *
 * @author alons
 */
public class CuentaUsuario {
    private int idCuentaUsuario;
    private String username;
    private String password;
    private boolean activo;
    
    public CuentaUsuario(){
        
    }
    
    public CuentaUsuario(int idCuentaUsuario, String username, String password, 
            boolean activo){
        this.idCuentaUsuario=idCuentaUsuario;
        this.username=username;
        this.password=password;
        this.activo=activo;
    }
    
    public CuentaUsuario(CuentaUsuario cuenta){
        this.idCuentaUsuario=cuenta.idCuentaUsuario;
        this.username=cuenta.username;
        this.password=cuenta.password;
        this.activo=cuenta.activo;
    }

    public int getIdCuentaUsuario() {
        return idCuentaUsuario;
    }

    public void setIdCuentaUsuario(int idCuentaUsuario) {
        this.idCuentaUsuario = idCuentaUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
