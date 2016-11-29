package Projeto;

import java.util.Scanner;

/**
 * Created by Douglas on 28/11/2016.
 */
public class Doadores extends Pessoa {
    Scanner tc = new Scanner(System.in);

    public String orgaodoar;

    public void ler() {
        System.out.println(" - - - - - - - - - - - - - - - -");
        System.out.print("Digite o nome: ");
        nome = tc.next();
        System.out.print("Digite a idade: ");
        idade = tc.nextInt();
        System.out.print("Digite o tipo sanguíneo: ");
        tiposangue = tc.next();
        System.out.print("Digite o orgao que pode doar: ");
        orgaodoar = tc.next();
        System.out.println(" - - - - - - - - - - - - - - - -");
    }

    public void exibir() {
        System.out.println(" - - - - - - - - - - - - - - - -");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Tipo Sanguíneo: " + this.tiposangue);
        System.out.println("Orgão que pode Doar: " + this.orgaodoar);
        System.out.println(" - - - - - - - - - - - - - - - -");
    }
}
