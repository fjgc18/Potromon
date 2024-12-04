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

 
    private int idPotromon;
    private String nombrePotromon;
    private String descripcion;
    private int puntaje;
    private String rutaImagen;
    private Entrenador entrenador;
    private List<Habilidades> habilidades;
    
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
           ResultSet rs = statement.executeQuery("Select idPotromon, nombrePotromon, descripcion, puntaje, ruta_imagen, idEntrenador FROM potrodex");
           while(rs.next()){
               Potrodex p = new Potrodex();
               p.setIdPotromon(rs.getInt(1));
               p.setNombrePotromon(rs.getString(2));
               p.setDescripcion(rs.getString(3));
               p.setPuntaje(rs.getInt(4));
               p.setRutaImagen(rs.getString(5));
               Entrenador e = Entrenador.getById(rs.getInt(6));
               p.setEntrenador(e);
               //List<Habilidades> habilidades = Habilidades.getList(rs.getInt(8));
               //p.setHabilidades(habilidades);
               
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
        public static Potrodex getById(int idPotromon) {
        Potrodex p = new Potrodex();
    try {
        Connection conexion = Conexion.obtener();
        String query = "SELECT idPotromon, nombrePotromon, descripcion, puntaje, ruta_imagen, idEntrenador FROM potrodex WHERE idPotromon = ?";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setInt(1, idPotromon);
        ResultSet rs = statement.executeQuery();
        if (rs.next()) {
            p.setIdPotromon(rs.getInt("idPotromon"));
            p.setNombrePotromon(rs.getString("nombrePotromon"));
            p.setDescripcion(rs.getString("descripcion"));
            p.setPuntaje(rs.getInt("puntaje"));
            p.setRutaImagen(rs.getString("ruta_imagen"));
            int idEntrenador = rs.getInt("idEntrenador");
            Entrenador entrenador = Entrenador.getById(idEntrenador);
            p.setEntrenador(entrenador); 
        }
    } catch (Exception ex) {
        System.err.println("Ocurrió un error: " + ex.getMessage());
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
  public static boolean save(String nombrePotromon, String descripcion, int puntaje, String rutaImagen, Entrenador entrenador) {
       boolean resultado = false;
       
        
        try {
                Connection conexion = Conexion.obtener();
                String consulta = "INSERT INTO potrodex (nombrePotromon, descripcion, puntaje, ruta_imagen, idEntrenador) VALUES (?,?,?,?,?,?)";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                statement.setString(1, nombrePotromon);
                statement.setString(2, descripcion);
                statement.setInt(3, puntaje);
                statement.setString(4, rutaImagen);
                statement.setInt(5, entrenador.getIdEntrenador());
                
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
    public static boolean delete(int idPotromon) {
       boolean resultado = false;
       
        
        try {
                Connection conexion = Conexion.obtener();
                String consulta = "DELETE FROM potrodex WHERE idPotromon = ?";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                statement.setInt(1, idPotromon);
                
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
 public static boolean edit(int idPotromon, String nombrePotromon, String descripcion, int puntaje, String rutaImagen, Entrenador entrenador) {
    boolean resultado = false;
    try {
            Connection conexion = Conexion.obtener();
            String consulta = "UPDATE potrodex SET nombrePotromon = ?, descripcion = ?, puntaje = ?, ruta_imagen = ?, idEntrenador = ? WHERE idPotromon = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, nombrePotromon);
            statement.setString(2, descripcion);
            statement.setInt(3, puntaje);
            statement.setString(4, rutaImagen);
            statement.setInt(5, entrenador.getIdEntrenador());
            statement.setInt(6, idPotromon);
            statement.execute();
            resultado = statement.getUpdateCount() == 1;
            conexion.close();
        
            
    } catch (Exception ex) {
        System.err.println("Ocurrió un error: " + ex.getMessage());
    }
    return resultado;
}
    
     public static boolean actualizarPuntaje(int idPotromon, int puntaje) {
        boolean resultado = false;
        
        try{
                    
            Connection conexion = Conexion.obtener();
            String consulta = "UPDATE potrodex SET puntaje = ? WHERE idPotromon = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(7, idPotromon);
            statement.setInt(4, puntaje);
            
            statement.execute();
            resultado = statement.getUpdateCount() == 1;
            conexion.close();
            
                }catch(Exception ex) {
                    System.err.println("Ocurrio un error: " + ex.getMessage());
                }
                return resultado;
}
    
    /**
     * @return the idPotromon
     */
    public int getIdPotromon() {
        return idPotromon;
    }

    /**
     * @param idPotromon the idPotromon to set
     */
    public void setIdPotromon(int idPotromon) {
        this.idPotromon = idPotromon;
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
    
    /**
     * @return the rutaImagen
     */
    public String getRutaImagen() {
        return rutaImagen;
    }

    /**
     * @param rutaImagen the rutaImagen to set
     */
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }  

    /**
     * @return the entrenador
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * @param entrenador the entrenador to set
     */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * @return the habilidades
     */
    public List<Habilidades> getHabilidades() {
        return habilidades;
    }

    /**
     * @param habilidades the habilidades to set
     */
    public void setHabilidades(List<Habilidades> habilidades) {
        this.habilidades = habilidades;
    }
    
    @Override
    public String toString(){
    return this.nombrePotromon;
    }
    
}
