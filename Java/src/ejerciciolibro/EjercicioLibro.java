/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolibro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author AlumnoTarde
 */
public class EjercicioLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String Titulo;
    String Autor;
    float Precio;
    int Stock;
    String Editorial;
    int AnoEdicion;
    int unidadesVendidas;

        // TODO code application logic here
        int n = 0; //Se inicializa la variable n, que hace de número
        boolean valido = false; //Se inicializa la variable valido, que permite realizar la verificación y se le da el valor de falso
        String linea; //Se inicializa la variable linea como String, que permite introducir cualquier caracter
        Libro objeto = new Libro(); //Se llama a la otra clase donde se encuentran los ejercicios
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        Scanner teclado3 = new Scanner(new InputStreamReader(System.in));
        Scanner teclado4 = new Scanner(new InputStreamReader(System.in));
        
        do {
            System.out.println("1.Crear un objeto de la clase libro.");
            System.out.println("2.Mostrar información completa de un libro (llamada al método correspondiente).");
            System.out.println("3.Mostrar sólo el título y el autor de un libro.");
            System.out.println("4.Asignar o cambiar el precio de un libro por otro que se reciba como parámetro.");
            System.out.println("5.Comprobar si un libro está editado o no por una cierta editorial recibida como parámetro.");
            System.out.println("6.Actualizar el stock de un libro tras la venta de un número de\n"
                    + "unidades que se recibe como parámetro, devolviendo la cantidad de libros restantes tras la venta o -1 si no había\n"
                    + "suficiente stock");
            System.out.println("7. Para salir.");
            //Se realiza un método de excepción para establecer un rango dentro de la variable
            do {

                try {
                    System.out.println("¿Qué tarea quieres realizar?");
                    linea = teclado.readLine(); //Se lee linea como String
                    n = Integer.parseInt(linea); //Transforma el string en int dentro de la variable n
                    if (n < 1 || n > 7) { //Si el número es menor que 1 o mayor que 11 se hace
                        throw new IllegalArgumentException(); //Una nueva excepción
                    }
                    valido = true; //Se termina con el método de excepción
                } catch (IOException e) {
                    System.out.println("Error al leer el teclado");

                } catch (NumberFormatException e) {
                    System.out.println("Error en la conversión");

                } catch (IllegalArgumentException e) {
                    System.out.println("Debe introducir un número entre 1 y 6 (o 7 en caso de querer terminar)");
                }
            } while (valido == false); //Mientras valido sea falso se seguirá realizando el método

            switch (n) { //Dependiendo de lo que hayas elegido dentro de la variable n se eligirá un ejercicio u otro
                case 1:
                    System.out.println("Introduce el título");
                    Titulo=teclado3.nextLine();
                    System.out.println("introduzca el autor");
                    Autor=teclado3.nextLine();
                    System.out.println("Introduzca la editorial");
                    Editorial=teclado3.nextLine();
                    System.out.println("Introduzca el stock");
                    Stock=teclado4.nextInt();
                    System.out.println("Introduzca el precio");
                    Precio=teclado4.nextFloat();
                    System.out.println("Introduzca el año");
                    AnoEdicion=teclado4.nextInt();
                    objeto = new Libro(Titulo, Autor, Precio, Stock, Editorial, AnoEdicion);
                    break;
                case 2:
                    objeto.MostrarDatos();
                    break;
                case 3:
                    objeto.MostrarAutoryTitulo();
                    break;
                case 4:
                    System.out.println("Introduzca el precio");
                    Precio=teclado4.nextFloat();
                    objeto.cambiarPrecio(Precio);
                    break;
                case 5:
                    System.out.println("Introduzca la editorial");
                    Editorial=teclado3.nextLine();
                    if(objeto.comprobarEditorial(Editorial))
                        System.out.println("El libro está editado por esa editorial");
                    else {
                        System.out.println("La editorial es distinta");
                    }
                    objeto.comprobarEditorial(Editorial);
                    break;
                case 6:
                    System.out.println("Introduzca las unidades vendidas");
                    unidadesVendidas=teclado4.nextInt();
                    System.out.println("Quedan " +objeto.ventas(unidadesVendidas)+ " unidades.");
                    break;
            }
        } while (n != 7); //Mientras n sea distinto de 11 se seguirá realizando el método
    }

}
