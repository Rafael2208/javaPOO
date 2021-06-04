
package br.com.rafaelviana.javanivelamentopoo01.view;

import br.com.rafaelviana.javanivelamentopoo01.model.Estudante;
import br.com.rafaelviana.javanivelamentopoo01.model.Pessoa;
import br.com.rafaelviana.javanivelamentopoo01.model.Professor;

public class JavaNivelamentoPOO01 {

  
    public static void main(String[] args) {
        Pessoa objeto = new Pessoa ();
        objeto.setNome("Rafael");
        objeto.setTelefone("(11)371945012");
        objeto.setEmail("rafaelsilvio497@yahoo.com");
        
        System.out.println(objeto.falarIdioma());
        
        System.out.println("Telefone:"+objeto.getTelefone());
        System.out.println("Email:"+objeto.getEmail());
        
        System.out.println("*****************************************");
        Pessoa neia = new Pessoa ();
        neia.setNome("Neia");
        neia.setTelefone("(11)351935012");
        neia.setEmail("neia.neves7@yahoo.com");
        
        System.out.println("Nome:"+neia.getNome());
        System.out.println("Telefone:"+neia.getTelefone());
        System.out.println("Email:"+neia.getEmail());
        
        System.out.println("*****************************************");
        Estudante estudante = new Estudante ();
        estudante.setNome("Maria");
        estudante.setCurso("Geografia");
        estudante.setRa(123);
        
        System.out.println("Nome:"+estudante.getNome());
        System.out.println("RA:"+estudante.getRa());
        System.out.println("Matéria:"+estudante.toString());
        System.out.println(estudante.falarIdioma());
        
        System.out.println("*****************************************");
        Professor professor = new Professor ();
       professor.setNome("Mario");
       professor.setTitulo("Desenvolvedor");
       
       
        
        System.out.println("Nome:"+professor.getNome());
        System.out.println("Titulo:"+professor.getTitulo());
        System.out.println("Profissão:"+professor.toString());
        System.out.println(professor.falarIdioma());
       
    }
    
}
