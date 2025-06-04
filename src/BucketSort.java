import java.util.*;

public class BucketSort {
    Scanner scanner = new Scanner(System.in);
    BubbleSort b = new BubbleSort();
    Main m = new Main();

    public void MenuBucked() {
        while (true) {
            System.out.print("Sua lista: ");
            for (int i = 0; i < b.listaOrdenada.length; i++) {
                System.out.print(b.listaOrdenada[i] + " ");
            }
            System.out.println("");
            System.out.println("1-Ordenar com Bucked Sort");
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
        if (array.length == 0)
            return;

        // Passo 1: Encontrar o valor máximo para saber o número de baldes necessários
        int max = array[0];
        for (int num : array) {
            if (num > max)
                max = num;
        }

        // Passo 2: Criar baldes
        int numBuckets = max / 10 + 1;
        List<List<Integer>> buckets = new ArrayList<>(numBuckets);

        for (int i = 0; i < numBuckets; i++) {
            buckets.add(new ArrayList<>());
        }

        // Passo 3: Distribuir os elementos nos baldes
        for (int num : array) {
            int index = num / 10; // Ex: 42 vai para o balde 4
            buckets.get(index).add(num);
        }

        // Passo 4: Ordenar cada balde (usando Collections.sort por simplicidade)
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Passo 5: Concatenar todos os baldes no array original
        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                array[index++] = num;
            }
        }
    }

}
