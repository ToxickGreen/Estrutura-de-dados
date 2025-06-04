import java.util.*;

public class CocktailSort {
    Scanner scanner = new Scanner(System.in);
    BubbleSort b = new BubbleSort();
    Main m = new Main();

    public void MenuCocktail() {
        while (true) {
            System.out.print("Sua lista: ");
            for (int i = 0; i < b.listaOrdenada.length; i++) {
                System.out.print(b.listaOrdenada[i] + " ");
            }
            System.out.println("");
            System.out.println("1-Ordenar com Cocktail Sort");
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
        boolean trocou = true;
        int inicio = 0;
        int fim = array.length - 1;

        while (trocou) {
            trocou = false;

            // Da esquerda pra direita
            for (int i = inicio; i < fim; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trocou = true;
                }
            }

            // Se não houve troca, está ordenado
            if (!trocou)
                break;

            trocou = false;
            fim--; // diminui o limite superior

            // Da direita pra esquerda
            for (int i = fim - 1; i >= inicio; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trocou = true;
                }
            }

            inicio++; // aumenta o limite inferior
        }
    }
}
