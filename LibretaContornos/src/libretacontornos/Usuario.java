/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretacontornos;

/**
 *
 * @author Sergio
 */
public class Usuario {

    private String nombre;

    private String pass;

    private String id;

    /**
     *
     */
    public Usuario() {
    }
   /**
    * 
    * @param nombre nombre para crear un usuario en la libreta
    * @param pass Contraseña
    * @param id identificador.
    */
    public Usuario(String nombre, String pass, String id) {
        this.nombre = nombre;
        this.pass = pass;
        this.id = id;
    }
    
    

    /**
     *Contacto añadido a la libreta 
     */
    public void engadirLibreta() {
    }

    /**
     *Borrar contacto.
     */
    public void borrarlibreta() {
    }

    /**
     * hacer cambios en la libreta
     */
    public void editarLibreta() {
    }
}

