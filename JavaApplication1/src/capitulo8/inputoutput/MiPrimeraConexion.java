/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.inputoutput;

/**
 *
 * @author T-101
 */

import java.net.*;
import java.io.*;

public class MiPrimeraConexion {
    public static void main(String[] args) throws Exception{
        //primero vamos a usar una clase que se llama URL
        URL url=new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
                HttpURLConnection con=(HttpURLConnection) url.openConnection();
                InputStream input=con.getInputStream();
                
                InputStreamReader isr=new InputStreamReader(input);
                BufferedReader reader=new BufferedReader(isr);
               String lineaActual="no ha leido nada";
               boolean encontrado=false;
               int miLinea=0;
                while((lineaActual=reader.readLine())!=null){
                    if(encontrado && miLinea<=0){
                      //vamos a despedazar la linea 
                        
                        int indice= lineaActual.indexOf(">");
                        int indice2= lineaActual.indexOf("</");
                        String tempActual=lineaActual.substring(indice+1, indice2);
                        
                        System.out.println(tempActual);
                        miLinea++;
                    } 
                    if(lineaActual.contains("Outside Temp")){
                             encontrado=true;
                             
                             
                             System.out.println("dato encontrado");
                             
                                                             }
                             
                                                             }                            
                                                           }
                
                
                    
                
                               }

                //System.out.println("Numero de renglones:" + renglones);
                
   
    

