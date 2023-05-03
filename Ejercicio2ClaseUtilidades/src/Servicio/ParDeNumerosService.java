/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ParDeNumeros;

/**
 *
 * @author LogiC
 */
public class ParDeNumerosService {
    // Math.random()*(max - min)+ min ;
    public static void mostrarValores(ParDeNumeros numero) {
        System.out.println("Número 1: " + numero.getNumero1());
        System.out.println("Número 2: " + numero.getNumero2());
    }
    
    public static double devolverMayor(ParDeNumeros numero) {
        if (numero.getNumero1() > numero.getNumero2()) {
            return numero.getNumero1();
        } else {
            return numero.getNumero2();
        }
    }
    
    public static double devolverMenor(ParDeNumeros numero) {
        if (numero.getNumero1() < numero.getNumero2()) {
            return numero.getNumero1();
        } else {
            return numero.getNumero2();
        }
    }
    
    public static void calcularPotencia(ParDeNumeros numero) {
        double mayor = Math.round((devolverMayor(numero)*100)/100);
        double menor = Math.round((devolverMenor(numero)*100)/100);
        System.out.println("La potencia es: " + (Math.pow(mayor, menor)));
    }
    
    public static void calculaRaiz(ParDeNumeros numero) {
        
        System.out.println("La raíz es: " + Math.sqrt(devolverMenor(numero)));
    }
}
