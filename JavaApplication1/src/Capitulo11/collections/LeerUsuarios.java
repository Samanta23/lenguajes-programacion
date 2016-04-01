/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.collections;

/**
 *
 * @author T-101
 */
public class LeerUsuarios {
    public static void main(String[] args)throws Exception{
        //creamos un objeto de la clase persistencia usuario
        PersitenciaUsuario p=new PersitenciaUsuario();
        //invocamos el metodo buscarTodos
                           System.out.println(p.buscarTodos().size() );
                           
                           for(Usuario u:p.buscarTodos()){
                               System.out.println( "login: "+  u.getLogin()  + " password " +u.getPasword());
                       
                           }
                           
        
    }
}
