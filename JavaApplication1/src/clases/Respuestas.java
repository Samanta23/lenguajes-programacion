
package clases;
//llamamos a java util con StringTockenizer para unir las cadenas String
import java.util.StringTokenizer;
//definir la clase respuestas
public class Respuestas {
//crear el arreglo de respuestas para relacionarlo con cada pregunta LAS VERDADERAS
    String[] respuestas = {
      "Nicosia","Nairobi","Ankara","LaHabana","ElCairo", 
        "BuenosAire","NuevaDelhi","Brasilia","Washington","Oslo"
    };
    //declarar un string para los radioButton mandandole EL ARREGLO DE las respuestas
    String[] radioR = {
        "Nicosia,SantoDomingo,LaPaz,Montevideo",
        "DF,Paris,Nairobi,LaHabana",
        "Otawa,Verna,Estocolmo,Ankara",
        "Nicosia,Verna,LaHabana,Berlin", //
        "Berlin,Russeau,ElCairo,Nicosia",
        "Bruselas,Berna,Estocolmo,BuenosAire",
        "Andorra,NuevaDelhi,Paris,Londres",
        "Brasilia,RioJaneiro,Santiago,Bogota",
        "DF,Otawa,NewYork,Washington",
        "Helsinkin,Riga,Kiev,Oslo"
    };
    //retornar un valor de tipo int para recorrer las respuestas que corresponden a cada regunta
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    //para separar las cadenas DE LAS RESPUESTAS DE STRING radioR
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[15];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    //enviando por el metodo set las respuestas a los radio buttons
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
