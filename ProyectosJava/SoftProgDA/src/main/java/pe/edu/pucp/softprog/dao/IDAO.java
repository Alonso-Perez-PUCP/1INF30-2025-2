/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.softprog.dao;

import java.util.List;

/**
 *
 * @author alons
 */
public interface IDAO<T> {
    int insertar(T objeto);
    int modificar(T objeto);
    int eliminar(int idObjeto);
    T buscarPorID(int idObjeto);
    List<T> listarTodas();
}
