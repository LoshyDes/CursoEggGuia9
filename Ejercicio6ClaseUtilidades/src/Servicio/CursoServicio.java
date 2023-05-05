/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class CursoServicio {
     /**
     *
     * D) Método cargarAlumnos(): este método le permitirá al usuario ingresar
     * los alumnos que asisten a las clases. Nosotros nos encargaremos de
     * almacenar esta información en un arreglo e iterar con un bucle,
     * solicitando en cada repetición que se ingrese el nombre de cada alumno.
     *
     * E) Método crearCurso(): el método crear curso, le pide los valores de los
     * atributos al usuario y después se le asignan a sus respectivos atributos
     * para llenar el objeto Curso. En este método invocamos al método
     * cargarAlumnos() para asignarle valor al atributo alumnos
     *
     * F) Método calcularGananciaSemanal(): este método se encarga de calcular
     * la ganancia en una semana por curso. Para ello, se deben multiplicar la
     * cantidad de horas por día, el precio por hora, la cantidad de alumnos y
     * la cantidad de días a la semana que se repite el encuentro.
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alumnos[i] = leer.next();
            
        }
        return alumnos;
    }
    public Curso crearCurso() {
        System.out.println("Ingrese el nombre del curso: ");
        String nombreCurso = leer.next();
        System.out.println("Ingrese la cantidad de horas por día del curso: ");
        double cantidadHorasPorDia = leer.nextDouble();
        System.out.println("Ingrese la cantidad de días a la semana del curso: ");
        int CantidadDiasPorSemana = leer.nextInt();
        System.out.println("Ingrese el turno (Mañana o Tarde): ");
        String turno = leer.next();
        System.out.println("Ingrese el precio por hora del curso: ");
        double precioPorHora = leer.nextDouble();
        String[] alumnos = cargarAlumnos();
        return new Curso(nombreCurso, cantidadHorasPorDia, CantidadDiasPorSemana, turno, precioPorHora, alumnos);
    }
    
    public double calcularGananciaSemanal(Curso curso) {
        double gananciaSemanal = curso.getPrecioPorHora() * curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana() * 5;
        
        return gananciaSemanal;
    }
}
