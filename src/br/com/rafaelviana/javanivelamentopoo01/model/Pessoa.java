
package br.com.rafaelviana.javanivelamentopoo01.model;

public class Pessoa implements Habilidade {
    private String nome;
    private String telefone;
    private String email;

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String falarIdioma() {
        return "Meu nome é: "+getNome()+" eu sei falar minha lingua materna.";
    }
    
    
    
}
