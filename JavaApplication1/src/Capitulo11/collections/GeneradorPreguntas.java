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
import javax.swing.JRadioButton;
//creamos arreglos de arreglos
public class GeneradorPreguntas {
    public static ArrayList<Pregunta>   obtenerTodasLasPreguntas(){
        //vamos a crear una sola pregunta con tres opciones
        Opcion op1=new Opcion("moscu", true);
        Opcion op2=new Opcion("Florencia", false);
        Opcion op3=new Opcion("paris", false);
        Opcion op4=new Opcion("londres",false);
        
        Opcion o1=new Opcion("Tokio", false);
        Opcion o2=new Opcion("Beijing", true);
        Opcion o3=new Opcion("Seul", false);
        Opcion o4=new Opcion("Pyonjiang", false);
        
//estos son arraylist genericos a una clase en particular cuando no le ponemos <Opcion>
        ArrayList<Opcion>opciones=new ArrayList<Opcion>();
        ArrayList<Opcion>opciones2=new ArrayList<Opcion>();
        
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        
        opciones2.add(o1);
        opciones2.add(o2);
        opciones2.add(o3);
        opciones2.add(o4);
        
        Pregunta p1=new Pregunta("Capital de Rusia", opciones);
        Pregunta p2=new Pregunta("Capital de China",opciones2);
        
        ArrayList<Pregunta>preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        preguntas.add(p2);
        //ArrayList<Pregunta>preguntas2=new ArrayList<Pregunta>();
        
        
        return preguntas;
        
    }
    
    public static boolean checarRespuesta(Pregunta p, JRadioButton[] radios){
    boolean respuesta=false;
    String seleccion="";
    for(JRadioButton radio:radios){
            if(radio.isSelected()){
                seleccion= radio.getText();
            }
    }
    
    for(Opcion o:p.getOpciones()){
    if(o.isEstatus()){
        if(o.getTitulo().equals(seleccion))respuesta=true;
    }
    
    }
    return respuesta;
    }
    
}
