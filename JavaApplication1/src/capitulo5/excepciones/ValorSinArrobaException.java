/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.excepciones;

/**
 *
 * @author Samanta
 */
public class ValorSinArrobaException extends Exception{
    public ValorSinArrobaException(){
    super("no puedes meter un email sin arroba");
    
    }
}
