/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author T-101
 */
public class Clientes {
    private String normbre;
    private String aPaterno;
    private int edad;
    private float sueldo;
    private Direccion direccion;

    public Clientes(String normbre, String aPaterno, int edad, float sueldo, Direccion direccion) {
        this.normbre = normbre;
        this.aPaterno = aPaterno;
        this.edad = edad;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    /**
     * @return the normbre
     */
    public String getNormbre() {
        return normbre;
    }

    /**
     * @param normbre the normbre to set
     */
    public void setNormbre(String normbre) {
        this.normbre = normbre;
    }

    /**
     * @return the aPaterno
     */
    public String getaPaterno() {
        return aPaterno;
    }

    /**
     * @param aPaterno the aPaterno to set
     */
    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
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
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sueldo
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    

    
    
    
    
}
