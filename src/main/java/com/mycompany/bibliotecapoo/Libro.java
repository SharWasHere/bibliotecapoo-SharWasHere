package com.mycompany.bibliotecapoo;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String genero;
    private boolean leido;

    public Libro(String titulo, String autor, int anioPublicacion, String genero) {

        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.leido = false;

    }

    public String mostrarInformacion() {
        String mostrar = titulo + " " + autor + " " + anioPublicacion + " " + genero;
        return mostrar;

    }

    public void marcarLeido() {
        leido = true;
    }

    public boolean esAntiguo() {
        int diferencia = 2024 - anioPublicacion;

        if (diferencia > 50) {
            return true;
        } else {
            return false;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }
}
