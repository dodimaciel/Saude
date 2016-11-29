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

    public String getOrgaodoar() {
        return orgaodoar;
    }

    public void setOrgaodoar(String orgaodoar) {
        this.orgaodoar = orgaodoar;
    }

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
        for (int i = 0; i < listDoador.size(); i++) {
                System.out.println(" - - - - - - - - - - - - - - - -");
                System.out.println("Nome: " + listDoador.get(i).getNome());
                System.out.println("Idade: " +listDoador.get(i).getIdade());
                System.out.println("Tipo Sanguíneo: " + listDoador.get(i).getTiposangue());
                System.out.println("Orgão que pode Doar: " + listDoador.get(i).getOrgaodoar());
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
