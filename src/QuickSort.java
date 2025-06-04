import java.lang.reflect.Array;
import java.util.*;

public class QuickSort {
    Scanner scanner = new Scanner(System.in);
    //Pegando nossa lista
    BubbleSort b = new BubbleSort();
    Main m = new Main();

    public void MenuQuick(){
        while (true){
            m.LimparConsole();
            //escrevendo a lista na tela
            System.out.print("Sua lista: ");
            for (int i = 0; i < b.listaOrdenada.length; i++){
                System.out.print(b.listaOrdenada[i] + " ");
            }
            System.out.println("");
            System.out.println("1-Ordenar com o Quick Sort");
            System.out.println("2-Voltar");
            System.out.println("--------------------------------");
            System.out.print("Digite sua escolha: ");
            int opc = scanner.nextInt();

            if (opc == 1){
                m.LimparConsole();
                MakeQuick(b.listaOrdenada, 0, b.listaOrdenada.length -1);
            }

            if (opc == 2){
                m.LimparConsole();
                System.out.println("Voltando...");
                break;
            }

        }
    }

    public void MakeQuick(int[] Array, int inicio, int fim){
        //Condição de parada
        if (inicio < fim){
            //posição atual do pivo
            int posiPivo = Particionar(Array, inicio, fim);
            //particiona o lado esquerdo do pivo
            MakeQuick(Array, inicio, posiPivo - 1);
            //particiona o lado direito do pivo
            MakeQuick(Array, posiPivo + 1, fim);
        }
    }

    public int Particionar(int []Array, int inicio, int fim){
        //de primeira o pivo sempre será o ultimo número do array
        int pivo = Array[fim];

        //'i' marca a última posição onde colocamos um valor menor ou igual ao pivô
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++){
            if (Array[j] <= pivo){
                i++;
                //organiza o vetor de acordo com os numeros menores que o pivo
                int temp = Array[i];
                Array[i] = Array[j];
                Array[j] = temp;
            }
        }
        //coloca o pivo na posição certa
        int temp = Array[i + 1];
        Array[i + 1] = Array[fim];
        Array[fim] = temp;
        //retorna a posição do novo pivo
        return i + 1;
    }
}
