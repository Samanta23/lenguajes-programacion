/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author T-101
 */
/* 
Clase modelo Imc encapsulada y con dos constructores
1. Agregar a los atributos modificador de acceso private
2. por cada atributo implementar un metodo get (getters)
3. por cada atributo implementar un metodo set (setters)
**Solo se encapsulan las clases modelo
Las clases wrapper o envoltorias sirven para convertir un texto a un numero
por ejemplo 
String strNumero="14";
int num=Integer.parseInt(strNumero);
num=num+23;

*/
public class Imc {
    
     private float peso;
     private float altura;
     

    public String calcular(){
        float imc=peso/(altura*altura);
        return "Tu imc es:" + imc;
    }
     

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
