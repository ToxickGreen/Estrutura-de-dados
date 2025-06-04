import java.util.*;

public class HeapSort {
    Scanner scanner = new Scanner(System.in);
    BubbleSort b = new BubbleSort();
    Main m = new Main();

    public void MenuHeap() {
        while (true) {
            System.out.print("Sua lista: ");
            for (int i = 0; i < b.listaOrdenada.length; i++) {
                System.out.print(b.listaOrdenada[i] + " ");
            }
            System.out.println("");
            System.out.println("1-Ordenar com Heap Sort");
            System.out.println("2-Voltar");
            System.out.println("----------------------------");
            System.out.print("Digite sua escolha: ");
            int opc = scanner.nextInt();

            if (opc < 1 || opc > 2) {
                System.out.println("Opção inválida");
            }

            if (opc == 1) {
                m.LimparConsole();
                ordenar(b.listaOrdenada);
            }

            if (opc == 2) {
                m.LimparConsole();
                System.out.println("Saindo...");
                break;
            }
        }
    }

    // Função principal que ordena
    public void ordenar(int[] array) {
        int n = array.length;

        // Passo 1: Construir o Max Heap (reorganiza o array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            aplicarHeap(array, n, i);
        }

        // Passo 2: Extrair elementos do heap um por um
        for (int i = n - 1; i > 0; i--) {
            // Troca o primeiro (maior) com o último não ordenado
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Reorganiza o heap reduzido
            aplicarHeap(array, i, 0);
        }
    }

    // Função que mantém a propriedade de Max Heap
    public void aplicarHeap(int[] array, int tamanho, int raiz) {
        int maior = raiz; // Começa assumindo que a raiz é o maior
        int esquerda = 2 * raiz + 1; // Filho esquerdo
        int direita = 2 * raiz + 2;  // Filho direito

        // Se o filho esquerdo for maior que o pai
        if (esquerda < tamanho && array[esquerda] > array[maior]) {
            maior = esquerda;
        }

        // Se o filho direito for maior que o maior até agora
        if (direita < tamanho && array[direita] > array[maior]) {
            maior = direita;
        }

        // Se o maior não for a raiz, troca
        if (maior != raiz) {
            int temp = array[raiz];
            array[raiz] = array[maior];
            array[maior] = temp;

            // Recursivamente aplica o heap na subárvore afetada
            aplicarHeap(array, tamanho, maior);
        }
    }
}