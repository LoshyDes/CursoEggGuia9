/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class PersonaServicio {
    
    
    Persona per1 = new Persona();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    //Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
    //Retornar el objeto Persona creado.

    public Persona crearPersona() {

        System.out.print("Ingrese el nombre de la persona: ");
        per1.setNombre(leer.next());
        System.out.println("");
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
        
        Date n = new Date(anio, mes, dia);

        per1.setFechaN(n);
        return per1;
    }

    //Método calcularEdad que calcule la edad del usuario utilizando el atributo de
    //fecha de nacimiento y la fecha actual.
    public int calcularEdad(Persona per1) {
        Date fechaActual = new Date();
        fechaActual.setYear(fechaActual.getYear()+1900);
        int edad = fechaActual.getYear() - per1.getFechaN().getYear();
        return edad;
    }

    //Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona
    //es menor que la edad consultada o false en caso contrario.
    public boolean menorQue(Persona per1) {
        System.out.println("Ingrese una edad para comparar: ");
        int numConsultar = leer.nextInt();
        return calcularEdad(per1) < numConsultar;

    }

    //Método mostrarPersona que muestra la información de la persona deseada.
    public void mostrarPersona(Persona per1) {
        
        System.out.println("El nombre de las personas es: " + per1.getNombre());
        System.out.println("La fecha de nacimiento es: " + per1.getFechaN().getDate() + "/" + per1.getFechaN().getMonth() + "/" + per1.getFechaN().getYear());
        System.out.println("La edad de la persona es: "+calcularEdad(per1));
        String a = "";
        if (menorQue(per1) == true) {
            a = "Sí";
        } else {
            a = "No";
        }
        System.out.println("¿La persona es menor que la edad ingresada para comparar? " + a);
    }
}
