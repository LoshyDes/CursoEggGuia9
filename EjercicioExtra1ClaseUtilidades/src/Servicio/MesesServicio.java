/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class MesesServicio {

    private Scanner leer = new Scanner(System.in);

    public Meses crearMeses() {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int random = (int) (Math.random() * 12);
        String mesSecreto = meses[random];
        return new Meses(meses, mesSecreto);
    }

    public void adivinanza(String mesSecreto) {
        System.out.println("Adivine el mes secreto");
        System.out.print("Introduzca el nombre del mes en minúsculas: ");
        String mes = leer.next();
        System.out.println("");
        boolean acertado = false;
        do {
            if (mes.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                acertado = true;
            } else {
                System.out.println("No ha acertado");
                System.out.print("Intente adivinarlo introduciendo otro mes: ");
                mes = leer.next();
            }
        } while (acertado == false);

    }
}
