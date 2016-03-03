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

public class ValidarEdad {
    public static void checarEdadNegativa(int edad)throws ValorNoNegativoExcepcion{
        if(edad<0)throw  new ValorNoNegativoExcepcion();
    }
    //la palabra estatic se usa para crear una constante en vez de variable y ahorrar memoria
    public static void checarMenorEdad(int edad)throws ValorMenorDeEdadException{
    if(edad<18)throw new ValorMenorDeEdadException();
    }
}
