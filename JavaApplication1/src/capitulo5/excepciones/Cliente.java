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
public class Cliente {
    private String email;
    private int edad;

    public Cliente(String email, int edad) {
        this.email = email;
        this.edad = edad;
    }

    public Cliente() {
    }
    

    /**
     * 
     * Este metodo nos regresa el email que ya previamente
     * se debio haber proporcionado por el metodo set correspondiente
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Este metodo necesita que proporciones un String 
     * que va a ser el email que le va a asignar al cliente
     * @param email Aqui debes de poner el String correspondiente al email
     */
    public void setEmail(String email) throws ValorSinArrobaException{
        this.email = email;
        ValidarArroba.checarArroba(email);
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) throws ValorNoNegativoExcepcion, ValorMenorDeEdadException {
        
       
        ValidarEdad.checarEdadNegativa(edad);
        ValidarEdad.checarMenorEdad(edad);
        
        this.edad = edad;
    }
    
}
