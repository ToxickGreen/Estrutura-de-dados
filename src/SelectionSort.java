import java.util.*;

// o Selection Sort é um metodo de ordenação que trabalha com o menor número do vetor
//ele compara o primeiro numero com todos os do array, se houver algum maior ele troca a posição de ambos
//e então ele passa pro segundo numero e vai fazendo isso até o vetor ester ordenado
public class SelectionSort {
    Main m = new Main();
    BubbleSort bubble = new BubbleSort(); // criando um objeto do nosso vetor
    int menor = 0;
    Scanner scanner = new Scanner(System.in);
    int aux;
    boolean menuSelec;

    public void Printando(){
        System.out.println("Sua lista foi ordenada!!!");
        System.out.println("");
        System.out.print("Lista: ");
        for(int i = 0; i < bubble.t; i++){
            System.out.print(bubble.listaOrdenada[i] + " ");
        }
        System.out.println("");
    }

    public void Ordenacao(){
        while (menuSelec) {
            System.out.println("-----------------------------");
            System.out.println("1-ordenar com selection sort");
            System.out.println("2-sair");
            System.out.println("-----------------------------");
            int opcao = scanner.nextInt();

            if (opcao == 1 && menuSelec == true) {
                m.LimparConsole();
                //primeiro precisamos percorrer a lista
                for (int i = 0; i < bubble.t; i++) {//lembrando que "t" é o lenght do nosso vetor
                    menor = i;
                    //agora precisamos realizar as comparações
                    for (int j =  i + 1; j < bubble.t; j++) {
                        if (bubble.listaOrdenada[j] < bubble.listaOrdenada[menor]) {
                            menor = j;
                        }
                    }
                    aux = bubble.listaOrdenada[i];
                    bubble.listaOrdenada[i] = bubble.listaOrdenada[menor];
                    bubble.listaOrdenada[menor] = aux;
                }
                Printando();
            }

            if (opcao == 2 && menuSelec == true){
                System.out.println("Saindo...");
                m.LimparConsole();
                break;

            }
        }

    }
}
