/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.excepciones;

/**
 *
 * @author T-101
 */
// la palabra super es para activar el mensaje de el papa exception
// extends exception es para heredar la clase exception que ya esta creada por java
public class ValorMenorDeEdadException extends Exception {
    public ValorMenorDeEdadException(){
        super("no puedo dar de alta a un menor de 18 años");
    }
}
