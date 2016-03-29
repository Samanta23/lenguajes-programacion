/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.collections;

/**
 *
 * @author T-101
 */
import java.io.*;
import java.util.ArrayList;
public class PersitenciaUsuario {

    public PersitenciaUsuario() {
        usuarios=new ArrayList<Usuario>();
    }
    //declaramos el arraylist como atributo para usarlo en varias partes
    ArrayList<Usuario> usuarios;
    //persistenica: tiene que ver conbase de datos, es una clase logica que prepara un usuario para que pueda ser transferible y se pueda guardar en una bd
    //clases de aplicacion main, de entidad objetos, logica como la de persistencia
    //esta clase debe llevar 5 metodos
    
    //primero ponemos el metodo de buscar todos
        ArrayList<Usuario>buscarTodos() throws Exception{
            //paso 1 leemos el archivo donde estan guardado el arraylist
            File f=new File("archivaldo.raton");
            //ñeemos el contenido
            FileInputStream fis=new FileInputStream(f);
            //descomprimimos el contenido
            ObjectInputStream ois=new ObjectInputStream(fis);
            usuarios=(ArrayList<Usuario>) ois.readObject();
                  return usuarios;
        
        }
    
        public void guardar(Usuario u) throws Exception{
        File f=new File("archivaldo.raton");
        //para guardar nuevos registros y que no se birre lo anterior
        if(f.exists())usuarios=buscarTodos();
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
        }
    
}
