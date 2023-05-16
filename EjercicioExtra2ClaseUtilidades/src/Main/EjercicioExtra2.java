/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.AhorcadoServicio;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual
         * deberá contener como atributos, un vector con la palabra a buscar, la
         * cantidad de letras encontradas y la cantidad jugadas máximas que
         * puede realizar el usuario. Definir los siguientes métodos en
         * AhorcadoService:
         */
        Scanner leer = new Scanner(System.in);
        AhorcadoServicio as = new AhorcadoServicio();
        as.juego();
    }

}
