
package br.com.rafaelviana.javanivelamentopoo01.view;

import br.com.rafaelviana.javanivelamentopoo01.model.Pessoa;

public class JavaNivelamentoPOO01 {

  
    public static void main(String[] args) {
        Pessoa objeto = new Pessoa ();
        objeto.setNome("Rafael");
        objeto.setTelefone("(11)981911012");
        objeto.setEmail("rafaelviana544@yahoo.com");
        
        System.out.println("Nome:"+objeto.getNome());
        System.out.println("Telefone:"+objeto.getTelefone());
        System.out.println("Email:"+objeto.getEmail());
        
        
    }
    
}
