package com.mycompany.bibliotecapoo;

import java.util.Scanner;

public class Principal {
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Ingresar un nuevo libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Buscar un libro");
            System.out.println("4. Marcar un libro como no leído");
            System.out.println("5. Mostrar libros no leídos");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarLibro(biblioteca, scanner);
                    break;
                case 2:
                    biblioteca.mostrarLibros();
                    break;
                case 3:
                    buscarLibro(biblioteca, scanner);
                    break;
                case 4:
                    marcarLibroNoLeido(biblioteca, scanner);
                    break;
                case 5:
                    biblioteca.mostrarLibrosNoLeidos();
                    break;
            }
        } while (opcion != 6);

    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public static void ingresarLibro(Biblioteca biblioteca, Scanner scanner) {
        scanner.nextLine();

        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el año de publicación del libro:");
        int anioPublicacion = scanner.nextInt();
        System.out.println("Ingrese el género del libro:");
        scanner.nextLine(); // Limpiar el buffer de entrada
        String genero = scanner.nextLine();

        Libro nuevoLibro = new Libro(titulo, autor, anioPublicacion, genero);
        biblioteca.registrarLibro(nuevoLibro);
        System.out.println("El libro ha sido ingresado correctamente.");
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public static void buscarLibro(Biblioteca biblioteca, Scanner scanner) {
        scanner.nextLine();

        System.out.println("Ingrese el título, autor o género del libro a buscar:");
        String palabraBusqueda = scanner.nextLine();
        biblioteca.buscarLibro(palabraBusqueda);
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public static void marcarLibroNoLeido(Biblioteca biblioteca, Scanner scanner) {
        scanner.nextLine();

        System.out.println("Ingrese el título del libro que desea marcar como no leído:");
        String tituloLibro = scanner.nextLine();
        biblioteca.marcarLibroNoLeido(tituloLibro);
    }
}
