
package clases;


public class Preguntas {
    //AQUI SE PONE EL ARREGLO DE PREGUNTAS DONDE SE ESCRIBIRAN LAS PREGUNTAS DEL TEST 
    String[] preguntas = {
        "¿Capital de Chipre?", "¿Capital de Kenia?", "¿Capital de Turquia?",
        "¿Capital de Cuba?", "¿Capital de Egipto?", "¿Capital de Argentina?", 
        "¿Capital de India?", "¿Capital de Brasil?", "¿Capital de USA?", "¿Capital de Noruega?"
    };
    // SE DECLARA EN EL  METODO GET  QUE REGRESE EN EL RETORNO UN INT CON LA VARIABLE POSICION
    //PARA AVANZAR LAS PREGUNTAS
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
