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
 * @author Thinkpad
 */
public class Habilidades {
    
    private int idHabilidades;
    private String habilidadesUno;
    private String habilidadesDos;
    private String habilidadesTres;
    private String habilidadesCuatro;
    
     /**
     * Obtiene una lista con todas las habilidades almacenadas en la base de datos
     * 
     * @return Lista de objetos {@link Habilidades} con las habilidades encontradas
     */
        public static List<Habilidades> getList(int idPotromon){
       List<Habilidades> habilidades = new ArrayList<>(); 
      try {
           Connection conexion = Conexion.obtener();
           String consulta = "select idHablidades, habilidadUno, habilidadDos, habilidadTres, habilidadCuatro, idPotromon from habilidades where idPotromon = ?";
           PreparedStatement statement = conexion.prepareStatement(consulta);
           statement.setInt(1, idPotromon);
          
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Habilidades h = new Habilidades();
               h.setIdHabilidades(rs.getInt(1));
               h.setHabilidadesUno(rs.getString(2));
               h.setHabilidadesDos(rs.getString(3));
               h.setHabilidadesTres(rs.getString(4));
               h.setHabilidadesCuatro(rs.getString(5));
               habilidades.add(h);
           }
           
       } catch(Exception ex){
           System.err.println("Ocurrio un error: " + ex.getMessage());
       }   
      return habilidades;
}
         public static List<Habilidades> getAll(){
       List<Habilidades> habilidades = new ArrayList<>(); 
      try {
           Connection conexion = Conexion.obtener();
           Statement statement = conexion.createStatement();
           ResultSet rs = statement.executeQuery("Select idHabilidades, habilidadUno, habilidadDos, habilidadTres, habilidadCuatro FROM habilidades");
           while(rs.next()){
               Habilidades h = new Habilidades();
               h.setIdHabilidades(rs.getInt(1));
               h.setHabilidadesUno(rs.getString(2));
               h.setHabilidadesDos(rs.getString(3));
               h.setHabilidadesTres(rs.getString(4));    
               h.setHabilidadesCuatro(rs.getString(5));
               habilidades.add(h);
           }
           
       } catch(Exception ex){
           System.err.println("Ocurrio un error: " + ex.getMessage());
       }   
      return habilidades;
}
    /**
     * Obtiene una habilidad específica mediante su ID.
     * 
     * @param idHabilidades Identificador de la habilidad a buscar.
     * @return Un objeto {@link Habilidades} con la información de la habilidad encontrada o vacío si no existe.
     */
      public static Habilidades getById(int idHabilidades) {
        Habilidades h = new Habilidades();
        
        try {
           Connection conexion = Conexion.obtener();
           String query = "Select idHabilidades, habilidadUno, habilidadDos, habilidadTres, habilidadCuatro FROM habilidades WHERE idHabilidades = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1, idHabilidades);
           
            ResultSet rs = statement.executeQuery();
            
           while(rs.next()){
               h.setIdHabilidades(rs.getInt(1));
               h.setHabilidadesUno(rs.getString(2));
               h.setHabilidadesDos(rs.getString(3));
               h.setHabilidadesTres(rs.getString(4));   
               h.setHabilidadesCuatro(rs.getString(5));
           }
           
       } catch(Exception ex){
           System.err.println("Ocurrio un error: " + ex.getMessage());
       }   
      return h;
           
      }

    /**
     * Guarda una nueva habilidad en la base de datos
     * 
     * @param habilidadesUno Primera habilidad a registrar
     * @param habilidadesDos Segunda habilidad a registrar
     * @param habilidadesTres Tercera habilidad a registrar
     * @param habilidadesCuatro Cuarta habilidad a registrar
     * @return true si la operación fue exitosa, false en caso contrario
     */
      public static boolean save(String habilidadesUno, String habilidadesDos, String habilidadesTres, String habilidadesCuatro) {
       boolean resultado = false;
        try {
                Connection conexion = Conexion.obtener();
                String consulta = "INSERT INTO habilidades (habilidadesUno, habilidadesDos, habilidadesTres, habilidadesCuatro) VALUES (?,?,?,?)";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                statement.setString(1, habilidadesUno);
                statement.setString(2, habilidadesDos);
                statement.setString(3, habilidadesTres);
                statement.setString(4, habilidadesCuatro);
                
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
                
        }catch(Exception ex){
           System.err.println("Ocurrio un error: " + ex.getMessage());
        }
           return resultado;
    }

    /**
     * Elimina una habilidad específica de la base de datos mediante su ID
     * 
     * @param idHabilidades Identificador de la habilidad a eliminar
     * @return true si la operación fue exitosa, false en caso contrario
     */
       public static boolean delete(int idHabilidades) {
       boolean resultado = false;
       
        
        try {
                Connection conexion = Conexion.obtener();
                String consulta = "DELETE FROM habilidades WHERE idHabilidades = ?";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                statement.setInt(1, idHabilidades);
                
                statement.execute();
                resultado = statement.getUpdateCount() == 1;
                conexion.close();
                
        }catch(Exception ex){
           System.err.println("Ocurrio un error: " + ex.getMessage());
        }
           return resultado;
    }   
       
    /**
     * Edita una habilidad específica en la base de datos
     * 
     * @param idHabilidades Identificador de la habilidad a editar
     * @param habilidadesUno Nueva descripción para la primera habilidad
     * @param habilidadesDos Nueva descripción para la segunda habilidad
     * @param habilidadesTres Nueva descripción para la tercera habilidad
     * @param habilidadesCuatro Nueva descripción para la cuarta habilidad
     * @return true si la operación fue exitosa, false en caso contrario
     */
         
   public static boolean edit(int idHabilidades, String habilidadesUno, String habilidadesDos, String habilidadesTres, String habilidadesCuatro) {
    boolean resultado = false;
    try {
            Connection conexion = Conexion.obtener();
            String consulta = "UPDATE habilidades SET habilidadesUno = ?, habilidadesDos = ?, habilidadesTres = ?, habilidadesCuatro = ? WHERE idHabilidades = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, habilidadesUno);
            statement.setString(2, habilidadesDos);
            statement.setString(3, habilidadesTres);
            statement.setString(4, habilidadesCuatro);
            statement.setInt(5, idHabilidades);

            statement.execute();
            resultado = statement.getUpdateCount() == 1;
            conexion.close();
        
    } catch (Exception ex) {
        System.err.println("Ocurrió un error: " + ex.getMessage());
    }
    return resultado;
}    
 
        /**
     * @return the idHabilidades
     */
    public int getIdHabilidades() {
        return idHabilidades;
    }

    /**
     * @return the habilidadesUno
     */
    public String getHabilidadesUno() {
        return habilidadesUno;
    }

    /**
     * @return the habilidadesDos
     */
    public String getHabilidadesDos() {
        return habilidadesDos;
    }

    /**
     * @return the habilidadesTres
     */
    public String getHabilidadesTres() {
        return habilidadesTres;
    }

    /**
     * @return the habilidadesCuatro
     */
    public String getHabilidadesCuatro() {
        return habilidadesCuatro;
    }

    /**
     * @param idHabilidades the idHabilidades to set
     */
    public void setIdHabilidades(int idHabilidades) {
        this.idHabilidades = idHabilidades;
    }

    /**
     * @param habilidadesUno the habilidadesUno to set
     */
    public void setHabilidadesUno(String habilidadesUno) {
        this.habilidadesUno = habilidadesUno;
    }

    /**
     * @param habilidadesDos the habilidadesDos to set
     */
    public void setHabilidadesDos(String habilidadesDos) {
        this.habilidadesDos = habilidadesDos;
    }

    /**
     * @param habilidadesTres the habilidadesTres to set
     */
    public void setHabilidadesTres(String habilidadesTres) {
        this.habilidadesTres = habilidadesTres;
    }

    /**
     * @param habilidadesCuatro the habilidadesCuatro to set
     */
    public void setHabilidadesCuatro(String habilidadesCuatro) {
        this.habilidadesCuatro = habilidadesCuatro;
    }

    
    
}
