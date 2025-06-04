import java.util.*;

public class ShellSort {
    Scanner scanner = new Scanner(System.in);
    BubbleSort b = new BubbleSort();
    Main m = new Main();

    public void MenuShell(){
        while (true){
            m.LimparConsole();
            System.out.print("Sua lista: ");
            for (int i = 0; i < b.listaOrdenada.length; i++){
                System.out.print(b.listaOrdenada[i] + " ");
            }
            System.out.println("");
            System.out.println("1-Ordenar com Shell Sort");
            System.out.println("2-Voltar");
            System.out.println("----------------------------");
            System.out.print("Digite sua escolha: ");
            int opc = scanner.nextInt();

            if (opc < 1 || opc > 2){
                System.out.println("Opção inválida");
            }

            if (opc == 1){
                m.LimparConsole();
                ShellOrd(b.listaOrdenada);
            }

            if (opc == 2){
                m.LimparConsole();
                System.out.println("Saindo...");
                break;
            }

        }
    }

    //efetudando o Shell sort
    public void ShellOrd(int [] array){
        int n = array.length;

        // Começa com um "gap" grande e vai diminuindo até 1
        for (int gap = n / 2; gap > 0; gap /= 2) {//gap é a distançia entre os elementos comparados

            // Aplica uma espécie de Insertion Sort com base no gap
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;

                // Move elementos maiores que temp para frente
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }

                // Coloca o temp na posição correta
                array[j] = temp;
            }
        }
    }
}
