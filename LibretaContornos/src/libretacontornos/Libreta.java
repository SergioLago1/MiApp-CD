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
public class Libreta {

   
    public String nombre;
    private String email;

  
   /**
    * 
    * @param nombre 
    * @param email 
    * 
    */
    public Libreta(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    

    /**
     * Clase con otros parametros
     */
    public Libreta() {
    }

    /**
     *
     * Añadido contacto
     *
     */
    public void engadir() {
    }

    /**
     *
     * @return contacto libre
     */
    public int cualLibre(int lib) {
        return lib;
    }

    /**
     *Lista de  contactos 
     */
    public void listar() {
    }

    /**
     *Grupos de contactos 
     */
    public void engadirGrupo() {
    }

    /**
     *Borrar grupo
     */
    public void borrarGrupo() {
    }

    /**
     *Lista de grupos
     */
    public void listarGrupo() {
    }
}