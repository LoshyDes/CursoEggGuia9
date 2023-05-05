/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class FechaService {
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaNacimiento() {
        
        System.out.println("Ingrese la fecha de nacimiento: ");
        
        System.out.print("Día: ");
        int dia = leer.nextInt();
        System.out.println("");
        
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.println("");
        
        System.out.print("Año: ");
        int anio = leer.nextInt();
        System.out.println("");
        
        return new Date(anio-1900, mes-1, dia);
    }
    
    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    } 
    
    public int diferencia(Date fechaNacimiento, Date fechaActual) {
        int diferencia = fechaActual.getYear() - fechaNacimiento.getYear();
        return diferencia;
    }
}
