package com.mycompany.bibliotecapoo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. ingresar libros");
            System.out.println("2. mostrar todos los libros");
            System.out.println("3. buscar libro");
            System.out.println("4. marcar libro como leído ");
            System.out.println("5. mostrar libros no leídos ");
            System.out.println("salir");
            option = scanner.nextInt();

            switch (option) {
                case 1:

                    System.out.println("Ingrese el título del libro: ");
                    String tituloUsuario = scanner.nextLine();

                    System.out.println("Ingrese el autor");
                    String autorUsuario = scanner.nextLine();

                    System.out.println("Ingrese el año de publicación");
                    int anioUsuario = scanner.nextInt();

                    System.out.println("Ingrese el género del libro");
                    String generoUsuario = scanner.nextLine();

                    Libro libroRegistrado = new Libro(tituloUsuario, autorUsuario, anioUsuario, generoUsuario);
                    Biblioteca reLibro = new Biblioteca();
                    reLibro.registrarLibro(libroRegistrado);

                    break;

                case 2:
                    System.out.println("libros disponibles");
                    Biblioteca mosLibros = new Biblioteca();
                    mosLibros.mostrarLibros();

                    break;

                case 3:
                    System.out.println("escriba el libro, o el autor, o el genero a buscar");
                    
                    String palabraBuscada = scanner.nextLine();
                                       
                    Biblioteca busLibro = new Biblioteca();
                    busLibro.buscarLibro(palabraBuscada);
                    
                    break;

                case 4:
                    System.out.println("escriba el libro para marcarlo como leído ");
                    Libro libroLeido=new Libro();
                    libroLeido.marcarLeido();                                    
                    break;
                    
                case 5:
                    System.out.println("libros no leídos: ");

                    Biblioteca libNoLeidos = new Biblioteca();
                    libNoLeidos.mostrarLibrosNoLeidos();

                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}

