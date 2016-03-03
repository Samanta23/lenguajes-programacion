/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author T-101
 */
//crear una nueva clase qu se llame obtenerClientes cuyo tipo de retorno sea
//un arreglo de tipo cliente
public class GenerarClientes {
    
    public static Clientes[] obtenerCliente(){
    
        Clientes Clientes[]=new Clientes[3];
        
       
 
        Clientes[0]= new Clientes("ana","lopez",20,20000,new Direccion("sur 22", 20, "ecatepec")); 
        Clientes[1]=new Clientes("pedro","martinez",45, 14000,new Direccion("cinco", 3, "neza")); 
        Clientes[2]=new Clientes("laura","gomez",25, 34000,new Direccion("dos", 2, "coacalco")); 
        
       
                 
                 return Clientes;
        
        
    }
 
}
