
package br.com.rafaelviana.javanivelamentopoo01.model;

public class Professor extends Pessoa {
    
    private String titulo;

    @Override
    public String toString() {
        return getTitulo();
    }

    
    public String getTitulo() {
        return titulo;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
