import java.util.*;

public class MergeSort {
    Scanner scanner = new Scanner(System.in);
    Main m = new Main();
    BubbleSort b = new BubbleSort();
    public void MenuMerge(){
        while (true){
            m.LimparConsole();
            System.out.print("Sua lista: ");
            for (int i = 0; i < b.listaOrdenada.length; i++){
                System.out.print(b.listaOrdenada[i] + " ");
            }
            System.out.println("");
            System.out.println("1-Ordenar com Merge sort");
            System.out.println("2-Voltar");
            System.out.print("Digite sua escolha: ");
            int opc = scanner.nextInt();

            if (opc < 1 || opc > 2){
                System.out.println("Opção inválida");
            }
            if(opc == 1){
                m.LimparConsole();
                Ordenar(b.listaOrdenada, 0, b.listaOrdenada.length - 1);
            }
            if (opc == 2){
                System.out.println("Saindo...");
                break;
            }
        }
    }

    //metodo do Merge sort
    public void Ordenar(int [] array, int inicio, int fim){
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            // Chama recursivamente para dividir o array
            Ordenar(array, inicio, meio);
            Ordenar(array, meio + 1, fim);

            // Junta os dois lados ordenados
            merge(array, inicio, meio, fim);
        }
    }
    // Junta dois subarrays ordenados
    public void merge(int [] array, int inicio, int meio, int fim){
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        // Cria arrays temporários
        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        // Copia os dados para os arrays temporários
        for (int i = 0; i < n1; i++) {
            esquerda[i] = array[inicio + i];
        }

        for (int j = 0; j < n2; j++) {
            direita[j] = array[meio + 1 + j];
        }

        // Índices iniciais dos subarrays e do array principal
        int i = 0, j = 0, k = inicio;

        // Junta os arrays comparando os elementos
        while (i < n1 && j < n2) {
            if (esquerda[i] <= direita[j]) {
                array[k] = esquerda[i];
                i++;
            } else {
                array[k] = direita[j];
                j++;
            }
            k++;
        }

        // Copia o que sobrou do array da esquerda
        while (i < n1) {
            array[k] = esquerda[i];
            i++;
            k++;
        }

        // Copia o que sobrou do array da direita
        while (j < n2) {
            array[k] = direita[j];
            j++;
            k++;
        }
    }
}
