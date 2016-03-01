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
public class GenerarClientes {
    
    public static Clientes[] obtenerCliente(){
    
        Clientes Clientes[]=new Clientes[3];
 
        Clientes[0]= new Clientes("ana","lopez",20,20000,new Direccion("sur 22", 20, "ecatepec")); 
        Clientes[1]=new Clientes("pedro","martinez",45, 14000,new Direccion("cinco", 3, "neza")); 
        Clientes[2]=new Clientes("laura","gomez",25, 34000,new Direccion("dos", 2, "coacalco")); 
        
        //ajustamos los nombres
        
        Clientes[0].setNormbre("ana");
        Clientes[1].setNormbre("pedro");
        Clientes[2].setNormbre("laura");
        
        Direccion d1=new Direccion();
                  d1.setCalle("sur 11");
                  d1.setNumero(20);
                  d1.setMunicipio("ecatepec");
                 Clientes[0].setDireccion(d1);
                 
                 // con constructores
                 
                 
        
        
    }
    
}
