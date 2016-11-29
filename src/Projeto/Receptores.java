package Projeto;

import java.util.Scanner;

/**
 * Created by Douglas on 28/11/2016.
 */
public class Receptores extends Pessoa {
    Scanner tc = new Scanner(System.in);
    public String orgao;
    public int urgencia;

    public void ler() {
        System.out.println(" - - - - - - - - - - - - - - - -");
        System.out.print("Digite o nome: ");
        nome = tc.next();
        System.out.print("Digite a idade: ");
        idade = tc.nextInt();
        System.out.print("Digite o tipo sanguíneo: ");
        tiposangue = tc.next();
        System.out.print("Digite o orgao que precisa: ");
        orgao = tc.next();
        System.out.print("Digite a sua urgencia sendo que: ");
        System.out.print("\n1-Muito Baixa 2-Baixa 3-Media 4-Alta 5-Urgente: ");
        urgencia = tc.nextInt();
    }

    public void exibir() {
        System.out.println(" - - - - - - - - - - - - - - - -");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Tipo Sanguíneo: " + this.tiposangue);
        System.out.println("Orgão que pode Doar: " + this.orgao);
        System.out.println("Urgencia: " + this.urgencia);
        System.out.println(" - - - - - - - - - - - - - - - -");
    }
}
