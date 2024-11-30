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
 *Clase que representa un Potromon en el sistema
 * @author emili
 */
public class Potrodex {
    
    private int id_potromon;
    private String nombrePotromon;
    private String descripcion;
    private String poderes;
    private int puntaje;
    
    /**
     * Obtiene todos los Potromones de la base de datos
     * 
     * @return Una lista de objetos Potrodex que representan todos los Potromones
     */
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
    
    /**
     * Obtiene un Potromon por su ID
     * 
     * @param id_potrodex El ID del Potromon a buscar
     * @return Un objeto Potrodex que representa el Potromon encontrado o null si no se encuentra
     */
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
        
            
            
  /**
  * Guarda un registro de potrodex en la base de datos
  * @param nombrePotromon valor del nombre del potrodex
  * @param descripcion valor de la descripcion del potroex
  * @param poderes valor de los  poderes del potrodex
  * @param puntaje valor del puntaje del potrodex
  * @return true so se guardo exitosamente; de lo contrario, false.
  */          
  public static boolean save(String nombrePotromon, String descripcion, String poderes, int puntaje) {
       boolean resultado = false;
       
        
        try {
                Connection conexion = Conexion.obtener();
                String consulta = "INSERT INTO potrodex (nombrePotromon, descripcion, poderes, puntaje) VALUES (?,?,?,?)";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                statement.setString(1, nombrePotromon);
                statement.setString(2, descripcion);
                statement.setString(3, poderes);
                statement.setInt(4, puntaje);
                
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
                
        }catch(Exception ex){
           System.err.println("Ocurrio un error: " + ex.getMessage());
        }
           return resultado;
    }          
            
    /**
     * Elimina un potrodex de la base de datos.
     * @param id_potromon El ID del potrodex a eliminar.
     * @return true si el potrodex se eliminó correctamente, false en caso contrario.
     */
    public static boolean delete(int id_potromon) {
       boolean resultado = false;
       
        
        try {
                Connection conexion = Conexion.obtener();
                String consulta = "DELETE FROM potrodex WHERE id = ?";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                statement.setInt(1, id_potromon);
                
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
                
        }catch(Exception ex){
           System.err.println("Ocurrio un error: " + ex.getMessage());
        }
           return resultado;
    }    
          
    /**
     * Actualiza los datos de un potrodex en la base de datos.
     * @param id_potromon El ID del potrodex a actualizar.
     * @param nombrePotromon El nuevo nombre del Potrodex.
     * @param  descripcion la nueva descripcion del Potrodex
     * @param puntaje el nuevo puntaje del Potrodex
     * @return true si el responsable se actualizó correctamente, false en caso contrario.
     */
 public static boolean edit(int id_potromon, String nombrePotromon, String descripcion, int puntaje) {
    boolean resultado = false;
    try {
        Connection conexion = Conexion.obtener();
        String consulta = "UPDATE potrodex SET nombrePotromon = ?, descripcion = ?, poderes = ?, puntaje = ? WHERE id = ?";
        PreparedStatement statement = conexion.prepareStatement(consulta);
        statement.setString(1, nombrePotromon);
        statement.setString(2, descripcion);
        statement.setString(3, poderes);
        statement.setInt(4, puntaje);
        statement.setInt(5, id_potromon);
        
        statement.execute();
        resultado = statement.getUpdateCount() == 1;
        conexion.close();
        
    } catch (Exception ex) {
        System.err.println("Ocurrió un error: " + ex.getMessage());
    }
    return resultado;
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
