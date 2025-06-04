import java.util.*;

public class GnomeSort {
    Scanner scanner = new Scanner(System.in);
    BubbleSort b = new BubbleSort();
    Main m = new Main();

    public void MenuGnome() {
        while (true) {
            System.out.print("Sua lista: ");
            for (int i = 0; i < b.listaOrdenada.length; i++) {
                System.out.print(b.listaOrdenada[i] + " ");
            }
            System.out.println("");
            System.out.println("1-Ordenar com Gnome Sort");
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
        int index = 0;

        while (index < array.length) {
            // Se estiver na primeira posição ou os elementos estão na ordem correta
            if (index == 0 || array[index] >= array[index - 1]) {
                index++; // anda para frente
            } else {
                // se estiver fora de ordem, troca e volta uma posição
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--; // volta para verificar se precisa continuar trocando
            }
        }
    }
}
