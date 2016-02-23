/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.threads;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads {
    public static void main(String[] args) {
        //ciclo de vida del thread sin contar pausa
        // 1. creado
        MiPrimerThread t1=new MiPrimerThread();
        //opcionalmente lo bautizaamos
        t1.setName("Sam");
        //2 inicializado
        t1.start();
        //3 en ejecucion(cuando corras este programa!!! y se active su metodo run)
        
        //5 muerte: cuando complete la tarea que tiene el codigo del metodo run
        
        
    }
}
