/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.FechaService;
import java.util.Date;

/**
 *
 * @author LogiC
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
         * FechaService, en paquete Servicios, que tenga los siguientes métodos:
         *
         * A) Método fechaNacimiento que pregunte al usuario día, mes y año de
         * su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
         * El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
         * new Date(anio, mes, dia);
         *
         * B) Método fechaActual que cree un objeto fecha con el día actual.
         * Para esto usaremos el constructor vacío de la clase Date. Ejemplo:
         * Date fechaActual = new Date();
         * 
         * El método debe retornar el objeto Date.
         *
         * C) Método diferencia que reciba las dos fechas por parámetro y
         * retorna la diferencia de años entre una y otra (edad del usuario).
         * 
         */
        FechaService FS = new FechaService();
        Date Fecha = FS.fechaNacimiento();
        Date FechaActual = FS.fechaActual();
        System.out.println("La edad de la persona es de " + FS.diferencia(Fecha, FechaActual) + " Años");

    }

}
