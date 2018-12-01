/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoguanabara;

import java.util.Scanner;

public class Pessoa {

    Scanner scan = new Scanner(System.in);

    Conta c = new Conta();
    public String nome;
    public String sexo;
    public String dataAniversario;
    public int idade;
    public double alturaPessoa;
    public int totalContaPoupanca;
    public int premioContaPoupanca;
    public int premioContaCorrente;
    public int totalContaCorrente;
    public int impostoContaCorrente;
    public int impostoContaPoupanca;
    
    public Pessoa(String nome, String sexo, String dataAniversario, int idade, double alturaPessoa) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataAniversario = dataAniversario;
        this.idade = idade;
        this.alturaPessoa = alturaPessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void dataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setAlturaPessoa(double alturaPessoa) {
        this.alturaPessoa = alturaPessoa;
    }

    public double getAlturaPessoa() {
        return alturaPessoa;
    }

    public void depositoLuan() {
        if (sexo == "m") {
            c.contaPoupanca = 300;
        }
    }

    public void depositoIza() {
        if (sexo == "f") {
            c.contaCorrente = 500;
        }
    }

    public void desejoConta() {
        System.out.println("-------------------------------");
        System.out.println("Digite 0 - Para conta Poupança ");
        System.out.println("Digite 1 - Para conta Corrente");
        System.out.println("\n");

        System.out.println("Qual conta você deseja ");
        int desejoConta = scan.nextInt();

        if (desejoConta == 0) {
            System.out.println("\n");
            premioContaPoupanca = 150;
            totalContaPoupanca = 150 + c.getContaPoupanca();
            impostoContaPoupanca = totalContaPoupanca - 20;
            System.out.println("Premio conta poupanca: " + this.premioContaPoupanca);
            System.out.println("Total conta poupanca: " + this.totalContaPoupanca);
            System.out.println("Imposto conta poupanca: " +this.impostoContaPoupanca);

        } else if (desejoConta == 1) {
            System.out.println("\n");
            premioContaCorrente = 50;
            totalContaCorrente = 50 + c.getContaCorrente();
            impostoContaCorrente = totalContaCorrente - 12;
            System.out.println("Premio conta corrente: " + this.premioContaCorrente);
            System.out.println("Total conta corrente: " + this.totalContaCorrente);
            System.out.println("Imposto da conta corrente: " + this.impostoContaCorrente);
        }
    }

    public void exibePessoa() {
        System.out.println("\n");
        System.out.println("Nome da pessoa: " + this.getNome());
        System.out.println("Sexo da pessoa: " + this.getSexo());
        System.out.println("Data de aniversário pessoa: " + this.getDataAniversario());
        System.out.println("Idade pessoa:  " + this.getIdade());
        System.out.println("Altura pessoa: " + this.alturaPessoa);

    }

    public void fecharConta() {
        System.out.println("\n");
        System.out.println("0- Não");
        System.out.println("1- Sim");
        System.out.println("\n");
        System.out.println("Deseja fechar sua conta ?");
        int resposta = scan.nextInt();

        switch (resposta) {
            case 0:
                System.out.println("Você optou por deixar a sua conta aberta");
                break;

            case 1:
                if (totalContaCorrente > 0) {
                    System.out.println("Não é possível fechar a sua conta. Pois você possui dinheiro nela");
                } else if (totalContaPoupanca > 0) {
                    System.out.println("Não é possível fechar a sua conta. Pois você possui dinheiro nela");
                }

                System.out.println("--------------------------------");
                break;
        }
    }

}
