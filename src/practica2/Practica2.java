package practica2;

/**
 * Clase "Main" usada �nicamente para empezar la ejecuci�n del programa
 * @author Gabriel
 */
public class Practica2 {

    /**
     * Metodo principal de la clase en donde instancia la clase notas para llamar a su propio main y
     * empezar la ejecuci�n del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        notas notas = new notas();
        String[] argumentos = {"Argumentos"};
        notas.main(argumentos);
    }
    
}