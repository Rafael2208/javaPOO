
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
        
        
        Pessoa neia = new Pessoa ();
        neia.setNome("Neia");
        neia.setTelefone("(11)981911012");
        neia.setEmail("neia.neia2@yahoo.com.br");
        
        System.out.println("Nome:"+neia.getNome());
        System.out.println("Telefone:"+neia.getTelefone());
        System.out.println("Email:"+neia.getEmail());
    }
    
}
