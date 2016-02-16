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
                int renglones=0;
                boolean encontrado=false;
                int etiquetaActual=0;
                while((reader.readLine()!=null)){
                   String renglonActual=reader.readLine();
                    if(renglonActual.contains("Outside Temp")){
                        encontrado=true;
                        System.out.println("Si existe el renglon");
                    
                }

                   // if(reader.readLine().contains("Current Conditions as of") || reader.readLine().contains("Outside Temp")){
                     //   System.out.println(reader.readLine());
                    
                    }
               
                    //  System.out.println(reader.readLine());
                    
                    String hola= "<td width= class summary_data>Outside Temp 21.3</td>";
                    int indice1= hola.indexOf("summary_data");
                    int indice2= hola.indexOf("</td>");
                    String nuevo=hola.substring(indice1+13, indice2);
                    System.out.println(nuevo);
                                           
    
    
    
    
    }
                
                
                    
                
                            }

                //System.out.println("Numero de renglones:" + renglones);
                
   
    

