package practica2;

/**
 * Clase "Main" usada únicamente para empezar la ejecución del programa
 * @author Gabriel
 */
public class Practica2 {

    /**
     * Metodo principal de la clase en donde instancia la clase notas para llamar a su propio main y
     * empezar la ejecución del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        notas notas = new notas();
        String[] argumentos = {"Argumentos"};
        notas.main(argumentos);
    }
    
}