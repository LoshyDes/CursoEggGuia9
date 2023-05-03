/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class CadenaServicio {

    Cadena c = new Cadena();
    private final Scanner leer = new Scanner(System.in);

    public Cadena crearCadena() {
        System.out.print("Ingrese la frase: ");
        c.setFrase(leer.nextLine());
        System.out.println("");
        c.setLongitud(c.getFrase().length());
        return c;
    }
    //A)
    public void mostrarVocales() {
        int contadorVocal = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            switch (c.getFrase().substring(i, i+1)) {
                case "a":
                    contadorVocal++;
                    break;
                case "e":
                    contadorVocal++;
                    break;
                case "i":
                    contadorVocal++;
                    break;
                case "o":
                    contadorVocal++;
                    break;
                case "u":
                    contadorVocal++;
                    break;
            }

        }
        System.out.println("Cantidad de vocales: " + contadorVocal);
    }
    
    //B)
    public void invertirFrase() {
        System.out.print("Frase invertida: ");
        for (int i = c.getLongitud(); i > 0; i--) {
            System.out.print(c.getFrase().substring(i-1,i));
        }
        System.out.println("");
    }
    
    //C)
    public void vecesRepetido(String letra) {
        int contadorLetra = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().substring(i, i+1).equalsIgnoreCase(letra)) {
                contadorLetra++;
            }
        }
        System.out.println("La letra " + letra + " se repite: " + contadorLetra);
    }
    
    //D)
    public void compararLongitud(String frase) {
        if (frase.length() == c.getLongitud()) {
            System.out.println("Tienen la misma longitud");
        } else if (frase.length() > c.getLongitud()) {
            System.out.println("La frase " + frase + " es más larga que " + c.getFrase());
        } else {
            System.out.println("La frase " + c.getFrase() + " es más larga que " + frase);
        }
    }
    
}
