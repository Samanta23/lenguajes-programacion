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
import java.util.*;
//creamos arreglos de arreglos
public class GeneradorPreguntas {
    public static ArrayList<Pregunta>   obtenerTodasLasPreguntas(){
        //vamos a crear una sola pregunta con tres opciones
        Opcion op1=new Opcion("moscu", true);
        Opcion op2=new Opcion("Florencia", false);
        Opcion op3=new Opcion("paris", false);
        //estos son arraylist genericos a una clase en particular cuando no le ponemos <Opcion>
        ArrayList<Opcion>opciones=new ArrayList<Opcion>();
        
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        
        Pregunta p1=new Pregunta("Capital de Rusia", opciones);
        
        ArrayList<Pregunta>preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        return preguntas;
        
    }
}
