package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

public class Biblioteca {

    private LinkedList<Libro> libros;
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Biblioteca() {
        this.libros = new LinkedList<>();
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void registrarLibro(Libro libroNuevo) {
        libros.add(libroNuevo);
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void buscarLibro(String palabraBusqueda) {
        for (int i = 0; i < libros.size(); i++) {
            Libro libroVisitado = libros.get(i);

            if (libroVisitado.getTitulo().equals(palabraBusqueda) || libroVisitado.getAutor().equals(palabraBusqueda) || libroVisitado.getGenero().equals(palabraBusqueda)) {
                System.out.println(libroVisitado.mostrarInformacion());

            }
        }
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.mostrarInformacion());
        }
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void mostrarLibrosNoLeidos() {

        boolean hayLibrosNoLeidos = false;

        for (Libro libro : libros) {
            if (!libro.isLeido()) {
                if (!hayLibrosNoLeidos) {
                    System.out.println("Libros no leídos en la biblioteca:");
                    hayLibrosNoLeidos = true;
                }
                System.out.println(libro.mostrarInformacion());
            }
        }
    }
    public void marcarLibroNoLeido(String tituloLibro) {
    for (Libro libro : libros) {
        if (libro.getTitulo().equalsIgnoreCase(tituloLibro)) {
            libro.marcarLeido(); // Llama al método marcarNoLeido() en la clase Libro
            return; // Sal del método después de marcar el libro
        }
    }
}
}

