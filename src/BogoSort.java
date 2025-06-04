import java.util.*;

//obs o pior algoritmo de ordenação. Lógica: "enquanto a lista não estiver ordenada, embaralhe ela aleatoriamente"

public class BogoSort {
    //metodo pra gerar um numero aleatório
    Random ramdom = new Random();
    Scanner scanner = new Scanner(System.in);
    BubbleSort b = new BubbleSort();
    Main m = new Main();


    public void MenuBogo(){
        while (true){
            m.LimparConsole();
            System.out.println("Sua lista: ");
            for (int i = 0; i < b.listaOrdenada.length; i++){
                System.out.print(b.listaOrdenada[i] + " ");
            }
            System.out.println("");
            System.out.println("1-Ordenar com Bogo Sort");
            System.out.println("2-Voltar");
            System.out.print("Digite a sua escolha: ");
            int opc = scanner.nextInt();

            if (opc < 1 || opc > 2){
                System.out.println("Opção inválida");
            }

            if (opc == 1){
                m.LimparConsole();
                MakeBogo(b.listaOrdenada);
            }

            if (opc == 2){
                m.LimparConsole();
                System.out.println("Saindo...");
                break;
            }
        }
    }

    //enquanto o vetor não estiver ordenado continue embaralhando
    public void MakeBogo(int [] array){
        while (!EstaOrdenado(array)){
            Embaralhar(array);
        }
    }

    //checa se a lista está ordenada
    public boolean EstaOrdenado(int [] array){
        for(int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]){
                return false;
            }
        }
        return true;
    }
    //embaralha a lista
    public void Embaralhar(int [] array){
        for (int i = 0; i < array.length; i++){
            int j = ramdom.nextInt(array.length);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
