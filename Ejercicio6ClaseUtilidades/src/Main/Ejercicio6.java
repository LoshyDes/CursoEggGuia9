/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Curso;
import Servicio.CursoServicio;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Un profesor particular está dando cursos para grupos de cinco alumnos
         * y necesita un programa para organizar la información de cada curso.
         * Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
         * serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno
         * (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
         * arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
         * nombres de cada alumno. A continuación, se implementarán los
         * siguientes métodos:
         */
        Scanner leer = new Scanner(System.in);
        CursoServicio cs = new CursoServicio();
        Curso c = cs.crearCurso();
        
        System.out.println("La ganancia semanal del curso es: " + cs.calcularGananciaSemanal(c));
    }

}
