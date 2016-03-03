/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.threads;

/**
 *
 * @author T-101
 * Creacion de un thread heredando la clase Thread
 * 
 * o hilo,sirve para determinar que ejecuta primero el programa
 */
public class MiPrimerThread extends Thread{
    
    public void run(){
        
        //aqui va toda la ejecucion que queremos que hago el thread
    System.out.println("soy un thread y me llamo" + this.getName());
    
    
    }
}
