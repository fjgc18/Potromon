/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.potromon.ui;
import mx.itson.potromon.entidades.Entrenador;
import mx.itson.potromon.entidades.Potrodex;
/**
 * Clase principal de la aplicación Potromon.
 * Esta clase contiene el método main que se utiliza para iniciar la aplicación.
 * 
 * @author Thinkpad
 */
public class Potromon {
    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     * Este método llama al método `getAll` de la clase `Entrenador` para obtener
     * una lista de todos los entrenadores disponibles.
     * 
     * @param args Los argumentos de línea de comandos (no se utilizan en esta implementación).
     */
   public static void main(String[] args) {
        Entrenador.getAll();}
}
