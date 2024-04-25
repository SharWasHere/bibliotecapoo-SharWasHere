package com.mycompany.bibliotecapoo;

package com.mycompany.bibliotecapoo;

import java.util.LinkedList;
public class Biblioteca {
    
   private LinkedList<Libro> libros;
   
   public Biblioteca(){
       this.libros=new LinkedList<>();      
   }
   
   public void registrarLibro (Libro libroNuevo){
       libros.add(libroNuevo);
   }
   
   public void buscarLibro(String palabraBusqueda){
       for(int i=0;i<libros.size();i++){
           Libro libroVisitado=libros.get(i);
           
           if(libroVisitado.getTitulo().equals(palabraBusqueda) || libroVisitado.getAutor().equals(palabraBusqueda) || libroVisitado.getGenero().equals(palabraBusqueda)){
               
               
           }
       }
   }
}
