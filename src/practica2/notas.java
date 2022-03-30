/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.util.Scanner;

/**
 * 
 * Clase notas: representa las notas del alumno y dentro de ella se define la lógica de negocio
 * para el cálculo de las mismas
 *
 */
public class notas {
    //declaramos la variables que nos hacen falta

    double uf1, uf2, uf3;
    double acu1, acu2, acu3, def;
    
    //utilizamos Sccanner para poder introducir datos
    Scanner entrada = new Scanner(System.in);

    
    /**
     * 
     * Metodo menu para ingresar las notas para el calculo posterior
     *
     */
    public void IngresaNotas() {
        System.out.println("ingrese las notas del estudiante");

        System.out.print("ingrese nota 1: ");

        uf1 = entrada.nextDouble();

        System.out.print("ingrese nota 2: ");

        uf2 = entrada.nextDouble();
        System.out.print("ingrese nota 3: ");

        uf3 = entrada.nextDouble();

    }


    /**
     * 
     * Metodo para comprobar bien entroduccion de notas
     *
     */
    public void comprobarcion() {

        if (uf1 > 10) {
            System.out.println(" nota1 mal introducida");

        } else {
            System.out.println(" nota1 correcta");
        }

        if (uf2 > 10) {
            System.out.println(" nota2 mal introducida");

        } else {
            System.out.println(" nota2 correcta");
        }
        if (uf3 > 10) {
            System.out.println(" nota3 mal introducida");

        } else {
            System.out.println(" nota3 correcta");
        }
    }

    /**
     * 
     * Metodo para calcular nota
     *
     */
    public void Calculonotas() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;

        def = acu1 + acu2 + acu3;
    }

    /**
     * 
     * Metodo para mostrar la nota calculada previamente
     *
     */
    public void Mostrar() {
        System.out.println(" notas introducidas son:");
        System.out.println(" nota1 = " + uf1);
        System.out.println(" nota2 = " + uf2);
        System.out.println(" nota3 = " + uf3);

        System.out.println(" acumuado 1 = " + acu1);
        System.out.println(" acumuado 2 = " + acu2);
        System.out.println(" acumuado 3 = " + acu3);

        System.out.println(" nota definitiva es = " + def);
    }

    /**
     * 
     * Metodo para tener en cuenta las casuísticas de puntaje de las notas
     *
     */
    public void aprobado() {
        if (def < 5 && def >= 0) {
            System.out.println("suspendio");
        } else {
            if (def >= 5 && def <= 10) {
                System.out.println("aprobado");
            } else {
                System.out.println(" error en la notas");
            }
        }
    }

    /**
     * Es llamado desde Practica2
     * Metodo padre en donde hace el llamado de cada uno de los metodos de la clase notas
     * @param args
     */
    public void main(String[] args) {
        // creamos mecanimos para llamar a cualquier metodo fuero de la clase
        notas fc = new notas();

        fc.IngresaNotas();

        fc.comprobarcion();

        fc.Calculonotas();

        fc.Mostrar();

        fc.aprobado();
    }

}
