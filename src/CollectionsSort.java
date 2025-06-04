import java.util.*;

//o collections sort é um metodo da biblioteca utilitária do java que nos permite ordenar listas
//esse metodo somente funciona com classes que implementam a interface list
//é necessário utiliar array list também
public class CollectionsSort {
    Scanner scanner = new Scanner(System.in);
    Main m = new Main();

    //aqui ja deixamos a lista pronta pra receber nosso vetor (volte para a opção de numero 15 no Main principal)
    public void menuCollections(List<Integer>lista) {
        while (true) {
            System.out.print("Sua lista: ");
            System.out.print(lista + " ");
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.println("VOCÊ ESTÁ ORDENANDO COM O COLLECTIONS SORT");
            System.out.println("1-Ordenar de forma crescente");
            System.out.println("2-Ordenar de forma decrescente");
            System.out.println("3-Embaralhar os elementos");
            System.out.println("0-Voltar");
            System.out.println("------------------------------------------");
            System.out.print("Digite sua escolha: ");
            int opc = scanner.nextInt();

            if (opc < 0 || opc > 2) {
                System.out.println("Opção inválida");
            }

            if (opc == 1) {
                m.LimparConsole();
                //assim ele automaticamente ordena a lista em ordem crescente
                Collections.sort(lista);
            }

            if (opc == 2) {
                m.LimparConsole();
                //Já para inverter a ordem a sintaxe é a seguinte...
                Collections.sort(lista, Collections.reverseOrder());
            }

            if (opc == 3){
                m.LimparConsole();
                //agora para embaralhar os elementos usamos a seguinte sintax
                Collections.shuffle(lista);
            }

            if (opc == 0) {
                System.out.println("Voltando...");
                break;
            }
        }
    }






}
