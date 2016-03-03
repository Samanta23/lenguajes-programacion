/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.excepciones;
//import sirven para dar mensajes y errores
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarMiExcepcion {
    public static void main(String[] args) {
        // el try sirve para capturar un error que pudiera ocurrir
        try {
            Cliente c=new Cliente();
            c.setEdad(16);
            //ValidarEdad validar=new ValidarEdad();
            //validar.checarEdadNegativa(-19);
            //el catch se usa para dar tratamiento al error detectado por el try
        } catch (ValorNoNegativoExcepcion ex) {
            System.out.println(ex.getMessage());
        } catch (ValorMenorDeEdadException e){
            System.out.println(e.getMessage());
        }
        finally{
            //finally es un mensaje o instruccion que se ejecuta se lance o no la exc
            System.out.println("Este se ejecuta se lance o no la exc");
        }
        
    }
}
