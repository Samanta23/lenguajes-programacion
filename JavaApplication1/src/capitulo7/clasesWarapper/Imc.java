/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo7.clasesWarapper;

/**
 *
 * @author Samanta
 */
public class Imc {
     private float peso;
    private float estatura;
    
    public void setPeso(float peso){
        this.peso=peso;
    }
    
    public void setEstatura(float estatura){
        this.estatura=estatura;
    }


    public float calcular(){
        
        return peso/(estatura*estatura);
        
        
        
    }
}
