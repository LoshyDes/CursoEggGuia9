/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author LogiC
 *
 * - Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas
 * máxima. Con la palabra del usuario, pone la longitud de la palabra, como la
 * longitud del vector. Después ingresa la palabra en el vector, letra por
 * letra, quedando cada letra de la palabra en un índice del vector. Y también,
 * guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
 *
 * - Método longitud(): muestra la longitud de la palabra que se debe encontrar.
 * Nota: buscar como se usa el vector.length.
 *
 * - Método buscar(letra): este método recibe una letra dada por el usuario y
 * busca si la letra ingresada es parte de la palabra o no. También informará si
 * la letra estaba o no.
 *
 * - Método encontradas(letra): que reciba una letra ingresada por el usuario y
 * muestre cuantas letras han sido encontradas y cuántas le faltan. Este método
 * además deberá devolver true si la letra estaba y false si la letra no estaba,
 * ya que, cada vez que se busque una letra que no esté, se le restará uno a sus
 * oportunidades.
 *
 * - Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
 *
 * - Método juego(): el método juego se encargará de llamar todos los métodos
 * previamente mencionados e informará cuando el usuario descubra toda la
 * palabra o se quede sin intentos. Este método se llamará en el main.
 */
public class AhorcadoServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Ahorcado a = new Ahorcado();
    private String palabra;

    public void crearJuego() {
        System.out.print("Ingrese la palabra a adivinar: ");
        palabra = leer.next();

        System.out.println("");

        System.out.print("Ingrese la cantidad de jugadas máximas: ");
        int cantidadJugadasMaximas = leer.nextInt();
        int cantidadLetrasEncontradas = 0;

        int n = palabra.length();
        String[] vectorPalabra = new String[n];
        for (int i = 0; i < n; i++) {
            vectorPalabra[i] = palabra.substring(i, i + 1);
        }
        this.a.setPalabra(vectorPalabra);
        this.a.setCantidadJugadasMaximas(cantidadJugadasMaximas);
        this.a.setCantidadLetrasEncontradas(cantidadLetrasEncontradas);
    }

    public void longitud() {
        System.out.println("La longitud de la palabra es de " + a.getPalabra().length + " letras");
    }

    public boolean buscar(String letra) {
        String[] vectorPalabra = a.getPalabra();
        boolean buscar = false;
        for (int i = 0; i < vectorPalabra.length; i++) {
            if (letra.equals(vectorPalabra[i])) {
                buscar = true;
            }
        }
        if (buscar) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no pertenece a la palabra");
        }
        return buscar;
    }

    public boolean encontradas(String letra) {
        String[] vectorPalabra = a.getPalabra();
        boolean buscar2 = buscar(letra);
        int cantidadLetrasNoEncontradas = 0;
        boolean letraEsta = false;
        if (buscar2) {
            for (int i = 0; i < vectorPalabra.length; i++) {
                if (letra.equals(vectorPalabra[i])) {
                    this.a.setCantidadLetrasEncontradas(this.a.getCantidadLetrasEncontradas()+1);
                    letraEsta = true;
                }
            }
        } else {
            this.a.setCantidadJugadasMaximas(this.a.getCantidadJugadasMaximas()-1);
        }
        System.out.println("Número de letras (encontradas: "
                + this.a.getCantidadLetrasEncontradas() + ", faltantes: "
                + (this.a.getPalabra().length - this.a.getCantidadLetrasEncontradas()) + ")");
        return letraEsta;
    }

    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + this.a.getCantidadJugadasMaximas());
        System.out.println("----------------------------------------------");
    }

    public void juego() {
        crearJuego();
        do {

            longitud();

            System.out.print("Ingrese una letra a buscar en la palabra: ");
            String letra = leer.next();
            System.out.println("");

            encontradas(letra);

            intentos();
            boolean PalabrasEncontradas = false;
            boolean intentos = this.a.getCantidadJugadasMaximas() > 0;
            if (this.a.getPalabra().length == this.a.getCantidadLetrasEncontradas()) {
                PalabrasEncontradas = true;
                System.out.println("Usted ha encontrado la palabra: " + palabra);
                break;
            } else if (!intentos) {
                System.out.println("Perdió: Se quedó sin intentos");
                break;
            }
            
        } while (true);

    }

}
