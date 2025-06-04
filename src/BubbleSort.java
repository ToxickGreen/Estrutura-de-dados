import java.util.*;

// serve para organizar os elementos de um vetor em orde crescente ou decrescente.
//ele compara os 2 numeros vizinhos e troca de lugar até que o vetor esteja em ordem.

public class BubbleSort {
    Scanner scanner = new Scanner(System.in);

    int[] listaOrdenada = {0, 5, 3, 4, 1, 2}; //Vetor simples de apenas 5 casas
    int t = listaOrdenada.length; //variavel para guardar o tamanho do vetor
    int aux;
    boolean menulist;

    public void Menu(){
        Main Limpar = new Main();
        while (menulist) {
            System.out.println("-------------------------------------");
            System.out.println("Ordenar em ordem crescente (1)");
            System.out.println("Ordenar em ordem decrescente (2)");
            System.out.println("Voltar (3)");
            System.out.println("-------------------------------------");
            System.out.println("");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1 && menulist == true){
                Limpar.LimparConsole();
                BubblewapCrescente();
                System.out.println("Seu vetor foi ordenado!!!");

                //Escreve o vetor na tela
                for(int i = 0; i < t; i++){
                    System.out.print(listaOrdenada[i] +"");
                }
                System.out.println(" ");
            }

            if (opcao == 2 && menulist == true){
                Limpar.LimparConsole();
                BubbleSwapDecrescente();
                System.out.println("Seu vetor foi ordenado!!!");

                //Escreve o vetor na tela
                for (int i = 0; i < t; i++){
                    System.out.print(listaOrdenada[i] + " ");
                }
                System.out.println(" ");
            }

            //Volta ao menu principal
            if (opcao == 3){
                Limpar.LimparConsole();
                break;
            }
        }
    }

    public void BubbleSwapDecrescente(){
        for (int i = 0; i < t - 1; i++){//esse primeiro "for" vai fazer com que nosso vetor seja ordenado até não ter mais nada a ordenar
            for (int j = 0; j < t - 1; j++) {// esse segundo "for" vai ordenar nosso vetor
                if (listaOrdenada[j] < listaOrdenada[j + 1]) { // "Se o numero nessa posição for menor que o próximo numero"
                    aux = listaOrdenada[j]; // a variavel aux recebe esse numero
                    listaOrdenada[j] = listaOrdenada[j + 1]; // essa posição recebe o numero da posição posterior
                    listaOrdenada[j + 1] = aux;//a posição posterior recebe o numero que está na variavel aux
                }
            }
        }
    }

    // Metodo para ordenar nosso vetor de forma crescente
    public void BubblewapCrescente(){
        for (int i = 0; i < t - 1; i++){ //esse primeiro "for" vai fazer com que nosso vetor seja ordenado até não ter mais nada a ordenar
            for(int j = 0; j < t - 1; j++){// esse segundo "for" vai ordenar nosso vetor
                if(listaOrdenada[j] > listaOrdenada[j+1]) {// "se o numero nessa posição for maior que o próximo número"
                    aux = listaOrdenada[j];//A variavel aux recebe o numero dessa posição
                    listaOrdenada[j] = listaOrdenada[j + 1]; //essa posição recebe o numero que está na posição a frente
                    listaOrdenada[j + 1] = aux;//o número na posição da frente recebe o numero guardado na variavel aux
                }
            }

        }


    }
}
