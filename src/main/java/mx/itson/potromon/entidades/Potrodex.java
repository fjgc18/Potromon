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
public class Potrodex {
    
    private int id_potromon;
    private String nombrePotromon;
    private String descripcion;
    private String poderes;
    private int puntaje;
    
    
        public static List<Potrodex> getAll(){
       List<Potrodex> potrodex = new ArrayList<>(); 
      try {
           Connection conexion = Conexion.obtener();
           Statement statement = conexion.createStatement();
           ResultSet rs = statement.executeQuery("Select id_potromon, nombre_potromon, descripcion, poderes, puntaje FROM potrodex");
           while(rs.next()){
               Potrodex p = new Potrodex();
               p.setId_potromon(rs.getInt(1));
               p.setNombrePotromon(rs.getString(2));
               p.setDescripcion(rs.getString(3));
               p.setPoderes(rs.getString(4));
               p.setPuntaje(rs.getInt(5));
               potrodex.add(p);
           }
           
       } catch(Exception ex){
           System.err.println("Ocurrio un error: " + ex.getMessage());
       }   
      return potrodex;
}
            public static Potrodex getById(int id_potromon) {
        Potrodex p = new Potrodex();
        
        try {
           Connection conexion = Conexion.obtener();
           String query = "Select id_potromon, nombre_potromon, descripcion, poderes, puntaje FROM potrodex WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1, id_potromon);
           
            ResultSet rs = statement.executeQuery();
            
           while(rs.next()){
               p.setId_potromon(rs.getInt(1));
               p.setNombrePotromon(rs.getString(2));
               p.setDescripcion(rs.getString(3));
               p.setPoderes(rs.getString(4));
               p.setPuntaje(rs.getInt(5));
           }
           
       } catch(Exception ex){
           System.err.println("Ocurrio un error: " + ex.getMessage());
       }   
      return p;
           
    }
            
    @Override
    public String toString(){
    return this.nombrePotromon;
    }
    
    /**
     * @return the id_potromon
     */
    public int getId_potromon() {
        return id_potromon;
    }

    /**
     * @param id_potromon the id_potromon to set
     */
    public void setId_potromon(int id_potromon) {
        this.id_potromon = id_potromon;
    }

    /**
     * @return the name
     */
    public String getNombrePotromon() {
        return nombrePotromon;
    }

    /**
     * @param name the name to set
     */
    public void setNombrePotromon(String name) {
        this.nombrePotromon = name;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the poderes
     */
    public String getPoderes() {
        return poderes;
    }

    /**
     * @param poderes the poderes to set
     */
    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
