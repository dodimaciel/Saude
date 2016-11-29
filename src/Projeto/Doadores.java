package Projeto;

import Fila.Doador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Douglas on 28/11/2016.
 */
public class Doadores extends Pessoa {
    Scanner tc = new Scanner(System.in);
    ArrayList<Doadores> listDoador = new ArrayList<>();

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

    public void exibir(ArrayList listDoador) {
        for (int i = 0; i < listDoador.size(); i++) {
                System.out.println(" - - - - - - - - - - - - - - - -");
                System.out.println("Nome: " + this.nome);
                System.out.println("Idade: " +listDoador.get(i));
                System.out.println("Tipo Sanguíneo: " + listDoador.get(i));
                System.out.println("Orgão que pode Doar: " + listDoador.get(i));
                System.out.println(" - - - - - - - - - - - - - - - -");
        }
    }

    public void remover() {
        String rmv;

        System.out.println("Digite o nome do Doador que deseja remover: ");
        rmv = tc.next();

        for (int i = 0; i < listDoador.size(); i++) {
            if(listDoador.get(i).nome.equals(rmv)) {
                listDoador.remove(i);
            } else {
                System.out.println("Doador não encontrado.");
            }
        }
    }


}
