/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potromon.entidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.potromon.persistencia.Conexion;

/**
 *
 * @author emili
 */
public class Entrenador {
    
 public static List<Entrenador> getAll(){
       List<Entrenador> entrenadores = new ArrayList<>(); 
      try {
           Connection conexion = Conexion.obtener();
           Statement statement = conexion.createStatement();
           ResultSet rs = statement.executeQuery("Select idEntrenador, nombreEntrenador, aliasEntrenador, puebloOrigen FROM entrenador");
           while(rs.next()){
               Entrenador e = new Entrenador();
               e.setIdEntrenador(rs.getInt(1));
               e.setNombreEntrenador(rs.getString(2));
               e.setAliasEntrenador(rs.getString(3));
               e.setPuebloOrigen(rs.getString(4));
               entrenadores.add(e);
           }
           
       } catch(Exception ex){
           System.err.println("Ocurrio un error: " + ex.getMessage());
       }   
      return entrenadores;
}   
    
 public static Entrenador getById(int idEntrenador) {
        Entrenador e = new Entrenador();
        
        try {
           Connection conexion = Conexion.obtener();
           String query = "Select idEntrenador, nombreEntrenador, aliasEntrenador, puebloOrigen FROM entrenador WHERE idEntrenador = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1, idEntrenador);
           
            ResultSet rs = statement.executeQuery();
            
           while(rs.next()){
               e.setIdEntrenador(rs.getInt(1));
               e.setNombreEntrenador(rs.getString(2));
               e.setAliasEntrenador(rs.getString(3));
               e.setPuebloOrigen(rs.getString(4));
           }
           
       } catch(Exception ex){
           System.err.println("Ocurrio un error: " + ex.getMessage());
       }   
      return e;
           
    }   
    
    
  public static boolean save(String nombreEntrenador, String aliasEntrenador, String puebloOrigen) {
       boolean resultado = false;
       
        
        try {
                Connection conexion = Conexion.obtener();
                String consulta = "INSERT INTO entrenador (nombreEntrenador, aliasEntrenador, puebloOrigen) VALUES (?,?,?)";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                statement.setString(1, nombreEntrenador);
                statement.setString(2, aliasEntrenador);
                statement.setString(3, puebloOrigen);
                
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
                
        }catch(Exception ex){
           System.err.println("Ocurrio un error: " + ex.getMessage());
        }
           return resultado;
    }
    
    public static boolean delete(int idEntrenador) {
       boolean resultado = false;
       
        
        try {
                Connection conexion = Conexion.obtener();
                String consulta = "DELETE FROM entrenador WHERE idEntrenador = ?";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                statement.setInt(1, idEntrenador);
                
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
                
        }catch(Exception ex){
           System.err.println("Ocurrio un error: " + ex.getMessage());
        }
           return resultado;
    }
    
     public static boolean edit(int idEntrenador, String nombreEntrenador, String aliasEntrenador, String puebloOrigen) {
       boolean resultado = false;
       
        
        try {
                Connection conexion = Conexion.obtener();
                String consulta = "UPDATE entrenador SET nombreEntrenador = ?, aliasEntrenador = ?, puebloOrigen =? WHERE id = ?";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                statement.setString(1, nombreEntrenador);
                statement.setString(2, aliasEntrenador);
                statement.setString(3, puebloOrigen);
                statement.setInt(4, idEntrenador);
                
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
                
        }catch(Exception ex){
           System.err.println("Ocurrio un error: " + ex.getMessage());
        }
           return resultado;
    }      
    
    
    
    
    
    
    
    
    
    

    /**
     * @return the idEntrenador
     */
    public int getIdEntrenador() {
        return idEntrenador;
    }

    /**
     * @param idEntrenador the idEntrenador to set
     */
    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    /**
     * @return the nombreEntrenador
     */
    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    /**
     * @param nombreEntrenador the nombreEntrenador to set
     */
    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    /**
     * @return the aliasEntrenador
     */
    public String getAliasEntrenador() {
        return aliasEntrenador;
    }

    /**
     * @param aliasEntrenador the aliasEntrenador to set
     */
    public void setAliasEntrenador(String aliasEntrenador) {
        this.aliasEntrenador = aliasEntrenador;
    }

    /**
     * @return the puebloOrigen
     */
    public String getPuebloOrigen() {
        return puebloOrigen;
    }

    /**
     * @param puebloOrigen the puebloOrigen to set
     */
    public void setPuebloOrigen(String puebloOrigen) {
        this.puebloOrigen = puebloOrigen;
    }
    private int idEntrenador;
    private String nombreEntrenador;
    private String aliasEntrenador;
    private String puebloOrigen;
    
    
}
