import java.util.*;

public class CountingSort {
    Scanner scanner = new Scanner(System.in);
    BubbleSort b = new BubbleSort();
    Main m = new Main();

    public void MenuCounting() {
        while (true) {
            System.out.print("Sua lista: ");
            for (int i = 0; i < b.listaOrdenada.length; i++) {
                System.out.print(b.listaOrdenada[i] + " ");
            }
            System.out.println("");
            System.out.println("1-Ordenar com Counting Sort");
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
    public void ordenar(int[] array) {
        // Verifica o maior valor do array
        int max = encontrarMaior(array);

        // Cria o array de contagem com tamanho = maior valor + 1
        int[] contador = new int[max + 1];

        // Conta quantas vezes cada número aparece no array original
        for (int i = 0; i < array.length; i++) {
            contador[array[i]]++;
        }

        // Reconstrói o array original com os números já ordenados
        int index = 0;
        for (int i = 0; i < contador.length; i++) {
            while (contador[i] > 0) {
                array[index] = i;
                index++;
                contador[i]--;
            }
        }
    }

    // Função auxiliar para encontrar o maior valor do array
    public int encontrarMaior(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }
}
