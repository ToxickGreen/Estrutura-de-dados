import java.util.*;

public class RadixSort {
    Scanner scanner = new Scanner(System.in);
    BubbleSort b = new BubbleSort();
    Main m = new Main();

    public void MenuRadix() {
        while (true) {
            System.out.print("Sua lista: ");
            for (int i = 0; i < b.listaOrdenada.length; i++) {
                System.out.print(b.listaOrdenada[i] + " ");
            }
            System.out.println("");
            System.out.println("1-Ordenar com Radix Sort");
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
    public void ordenar(int[] array){
        int max = encontrarMaior(array);

        // Aplica Counting Sort para cada casa decimal (1, 10, 100, ...)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortPorDigito(array, exp);
        }
    }

    public void countingSortPorDigito(int[] array, int exp){
        int n = array.length;
        int[] output = new int[n]; // array de saída
        int[] count = new int[10]; // 0 a 9, pois estamos lidando com dígitos

        // Contar ocorrências dos dígitos na posição atual (exp)
        for (int i = 0; i < n; i++) {
            int digito = (array[i] / exp) % 10;
            count[digito]++;
        }

        // Transforma count[i] em posição real no output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Constrói o array de saída (de trás para frente para manter estabilidade)
        for (int i = n - 1; i >= 0; i--) {
            int digito = (array[i] / exp) % 10;
            output[count[digito] - 1] = array[i];
            count[digito]--;
        }

        // Copia para o array original
        for (int i = 0; i < n; i++) {
            array[i] = output[i];
        }
    }

    public int encontrarMaior(int[] array){
        int max = array[0];
        for (int num : array){
            if (num > max) max = num;
        }
        return max;
    }
}
