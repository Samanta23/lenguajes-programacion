
package clases;


public class Preguntas {
    //AQUI SE PONE EL ARREGLO DE PREGUNTAS 
    String[] preguntas = {
        "¿Capital de Chipre?", "¿Capital de Kenia?", "¿Capital de Turquia?",
        "¿Capital de Cuba?", "¿Capital de Egipto?"
    };
    // SE DECLARA EN EL  METODO GET  QUE REGRESE EN EL RETORNO UN INT PARA AVANZAR LAS PREGUNTAS
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
