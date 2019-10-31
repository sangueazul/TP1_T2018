package br.edu.iff.teste.p3;

import java.util.Date;
import java.util.List;

public class Reajuste {
    public static void main(String[] args) {
        Funcionario estagiario = new Funcionario();
        Funcionario.dissidio = 1.1f;
        estagiario.salario = 1000;
        Funcionario cesar = new Gerente();
        cesar.salario = 30000;        
        estagiario.reajustaSalario(false);
        cesar.reajustaSalario(true);
    }
}

class Funcionario {
    int matricula;
    String nome, cpf;
    Date dtNascimento;
    static float dissidio;
    float salario;
    public void reajustaSalario(boolean bateuMeta) {
        if (bateuMeta) {
            salario = salario*dissidio*2;
        } else {
            salario = salario*dissidio;
        }
        System.out.println("O novo salário deste funcionário é: R$ "+salario);
    }
}

class Gerente extends Funcionario {
    int rank;
    String area;
    public void reajustaSalario(boolean bateuMeta) {
        if (bateuMeta) {
            salario = salario*3;
        } else {
            salario = salario*2;
        }
        System.out.println("O novo salário deste Gerente é: R$ "+salario);
    }
}

class Telefonista extends Funcionario {
    //List<Contato> agendaTelefonica;
}

class Secretaria extends Funcionario {
    void recebeLigacao(Gerente chefe) {
        if (chefe.estaNaEmpresa()) {
            chefe.repassaLigacao();
        } else {
            anotaRecado();
        }
    }
    void anotaRecado() {
        
    }
}