/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg20;
import java.util.Objects;
/**
 *
 * @author slagogonzalez
 */
public class Libro implements Comparable<Libro> {
   private String titulo;
   private String autor;
   private  String ISBN;
   private  double prezo;
   private  int numeroUnidades;
   
   Libro(String titulo,String autor,String ISBN, double prezo,int numeroUnidades){
       this.ISBN=ISBN;
       this.autor=autor;
       this.numeroUnidades=numeroUnidades;
       this.prezo=prezo;
       this.titulo=titulo;
       
   }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", numeroUnidades=" + numeroUnidades + '}';
    }

    @Override
    public int compareTo(Libro t) {
        if(titulo.compareToIgnoreCase(t.titulo)<0){
            return -1;         
        }else if(titulo.compareToIgnoreCase(t.titulo)>0){
            return 1;
        }else{
            return 0;
        }
    }     

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
    
   
}