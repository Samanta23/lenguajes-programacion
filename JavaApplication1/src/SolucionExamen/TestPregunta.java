/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen;

/**
 *
 * @author T-101
 */
public class TestPregunta {
    public static void main(String[] args) throws Exception {
       Opcion op1=new Opcion("paris", false);
        Opcion op2=new Opcion("florencia", false);
         Opcion op3=new Opcion("londres", false);
          Opcion op4=new Opcion("moscu", true);
          Opcion opciones[]=new Opcion[4];
       opciones[0]=op1;
       opciones[1]=op2;
       opciones[2]=op3;
       opciones[3]=op4;
       ValidarOpcion validar=new ValidarOpcion();
       validar.validar(opciones);
        Pregunta p=new Pregunta("capital de rusia", opciones);
    }
}
