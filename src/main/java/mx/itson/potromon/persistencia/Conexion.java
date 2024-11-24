/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potromon.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author emili
 */
public class Conexion {
        public static Connection obtener(){
        Connection conexion =  null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/salchicha?user=root&password=admin");
        } catch(Exception ex){
        System.err.println("Ocurrio un error: " + ex.getMessage());
        
        }
        return conexion;
    }
}
