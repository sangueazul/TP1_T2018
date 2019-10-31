package br.edu.iff.teste.propostaabs;

/**
 *
 * @author luizcanf
 */
public abstract class Usuario {
    
    int codigo, idade, cpf;
    String nome, sobrenome, seilah;
    
    public String olah() {
        return ("Oi! Eu sou o " + nome + " " + sobrenome +
                ". Tenho " + idade + " anos.");
    }
    
    public abstract String tchau();

}
