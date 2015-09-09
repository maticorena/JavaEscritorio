/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Gabriel
 */
public class Datos {
    public boolean validarUsuario(String usuario,String clave){
        if(usuario.equals("zulu") && clave.equals("123")){
            return true;
        }else{
            return false;
        }
            
    }
}
