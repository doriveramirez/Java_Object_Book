/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolibro;

/**
 *
 * @author AlumnoTarde
 */
public class Libro {

    protected String Titulo;
    protected String Autor;
    protected float Precio;
    protected int Stock;
    protected String Editorial;
    protected int AnoEdicion;

    public Libro() { //Inicializa las variables a los valores por defecto
    }

    public Libro(String Titulo, String Autor, float Precio, int Stock, String Editorial, int AnoEdicion) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Editorial = Editorial;
        this.AnoEdicion = AnoEdicion;
    }

    public void MostrarDatos() {
        System.out.println("El título es " + Titulo);
        System.out.println("El autor es " + Autor);
        System.out.println("El precio es " + Precio);
        System.out.println("Las unidades son " + Stock);
        System.out.println("La editorial es " + Editorial);
        System.out.println("El año de edición es " + AnoEdicion);
    }

    public void MostrarAutoryTitulo() {
        System.out.println("El título es " + Titulo);
        System.out.println("El autor es " + Autor);
    }

    public void cambiarPrecio(float Precio) {
        this.Precio = Precio;
    }

    public boolean comprobarEditorial(String Editorial) {
        return this.Editorial.equalsIgnoreCase(Editorial);
    }

    public int ventas(int unidadesVendidas) {
        if (this.Stock < unidadesVendidas) {
            return -1;
        } else {
            this.Stock -= unidadesVendidas;
            return this.Stock;
        }
    }
}
