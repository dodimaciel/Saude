package Projeto;

import Fila.Doador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Douglas on 28/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int opcao;

        ArrayList<Doadores> listDoador = new ArrayList<>();

        do {
            System.out.println(" MENU ");
            System.out.println(" * 1 - Doador * ");
            System.out.println(" * 2 - Receptor ");
            System.out.println(" * 0 - Sair");
            opcao = tc.nextInt();

            switch (opcao) {
                case 1: {
                    Doadores doadores = new Doadores();
                    int op = 0;
                    do {
                        System.out.println(" 1 - Adicionar Doador ");
                        System.out.println(" 2 - Remover Doador ");
                        System.out.println(" 3 - Exibir Doador ");
                        System.out.println(" 4 - Anterior");
                        op = tc.nextInt();

                        switch (op) {
                            case 1:
                                doadores.ler();
                                listDoador.add(doadores);
                                System.out.println("Adicionado com Sucesso!");
                                break;
                            case 2:
                                String rmv;

                                System.out.println("Digite o nome do Doador que deseja remover: ");
                                rmv = tc.next();

                                for (int i = 0; i < listDoador.size(); i++) {
                                    if (listDoador.get(i).nome.equals(rmv)) {
                                        listDoador.remove(i);
                                    } else {
                                        System.out.println("Doador não encontrado.");
                                    }
                                }
                                break;
                            case 3:
                                doadores.exibir(listDoador);
                                break;
                            default:
                                break;
                        }
                    } while (op != 4);
                }
            }
        } while (opcao != 0);
    }
}
