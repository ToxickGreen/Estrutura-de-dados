import java.util.*;

public class TimSort {
    Scanner scanner = new Scanner(System.in);
    BubbleSort b = new BubbleSort();
    Main m = new Main();

    public void MenuTim() {
        while (true) {
            System.out.print("Sua lista: ");
            for (int i = 0; i < b.listaOrdenada.length; i++) {
                System.out.print(b.listaOrdenada[i] + " ");
            }
            System.out.println("");
            System.out.println("1-Ordenar com Tim Sort");
            System.out.println("2-Voltar");
            System.out.println("----------------------------");
            System.out.print("Digite sua escolha: ");
            int opc = scanner.nextInt();

            if (opc < 1 || opc > 2) {
                System.out.println("Opção inválida");
            }

            if (opc == 1) {
                m.LimparConsole();
                ordenarComTimSort();
            }

            if (opc == 2) {
                m.LimparConsole();
                System.out.println("Saindo...");
                break;
            }
        }
    }

    public void ordenarComTimSort() {
        // Convertendo o array primitivo int[] para Integer[] (necessário para usar Arrays.sort com TimSort)
        int[] lista = b.listaOrdenada;
        Integer[] listaInteger = Arrays.stream(lista).boxed().toArray(Integer[]::new);

        // Usa o TimSort do Java internamente
        Arrays.sort(listaInteger);

        // Se quiser converter de volta para int[]
        for (int i = 0; i < lista.length; i++) {
            lista[i] = listaInteger[i];
        }
    }


}
