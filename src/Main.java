import java.util.*;

public class Main {
    public static void main(String[] args) {
        SelectionSort selection = new SelectionSort();
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        boolean menu0 = false;
        BubbleSort bubble = new BubbleSort();
        InsertionSort insertion = new InsertionSort();
        QuickSort q = new QuickSort();
        MergeSort ms = new MergeSort();
        ShellSort s = new ShellSort();
        BogoSort bo = new BogoSort();
        HeapSort h = new HeapSort();
        CountingSort c = new CountingSort();
        TimSort t = new TimSort();
        BucketSort bk = new BucketSort();
        RadixSort r = new RadixSort();
        GnomeSort g = new GnomeSort();
        CocktailSort ck = new CocktailSort();
        CollectionsSort col = new CollectionsSort();

        while (true){
            System.out.println("");
            System.out.println("Feito por Luiz Antônio e João Vitor");
            System.out.println("");
            System.out.print("Lista: ");
            for (int i = 0; i < bubble.t; i++){
                System.out.print(bubble.listaOrdenada[i] +" ");
            }
            System.out.println("");
            System.out.println("--------------------");
            System.out.println("Lista de métodos!");
            System.out.println("");
            System.out.println("1-bubble sort");
            System.out.println("2-selection sort");
            System.out.println("3-insertion sort");
            System.out.println("4-Quick sort");
            System.out.println("5-Merge sort");
            System.out.println("6-Shell sort");
            System.out.println("7-Bogo sort");
            System.out.println("8-Heap sort");
            System.out.println("9-Counting sort");
            System.out.println("10-Tim sort");
            System.out.println("11-Bucket sort");
            System.out.println("12-Radix sort");
            System.out.println("13-Gnome sort");
            System.out.println("14-Cocktail Sort");
            System.out.println("15-Collections Sort");
            System.out.println("0-SAIR");
            System.out.println("--------------------");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1 && !menu0){
                m.LimparConsole();
                bubble.menulist = true;
                bubble.Menu();

            }

            if (opcao == 2 && !menu0){
                m.LimparConsole();
                selection.menuSelec = true;
                selection.Ordenacao();
                selection.Printando();
            }

            if (opcao == 3){
                m.LimparConsole();
                insertion.Menuzinho();

            }

            if (opcao == 4){
                m.LimparConsole();
                q.MenuQuick();
            }

            if (opcao == 5){
                m.LimparConsole();
                ms.MenuMerge();
            }

            if (opcao == 6){
                s.MenuShell();
            }

            if (opcao == 7){
                m.LimparConsole();
                bo.MenuBogo();
            }

            if (opcao == 8){
                m.LimparConsole();
                h.MenuHeap();
            }

            if (opcao == 9){
                m.LimparConsole();
                c.MenuCounting();
            }

            if (opcao == 10){
                m.LimparConsole();
                t.MenuTim();
            }

            if (opcao == 11){
                m.LimparConsole();
                bk.MenuBucked();
            }

            if (opcao == 12){
                m.LimparConsole();
                r.MenuRadix();
            }

            if (opcao == 13){
                m.LimparConsole();
                g.MenuGnome();
            }

            if (opcao == 14){
                m.LimparConsole();
                ck.MenuCocktail();
            }

            if (opcao == 15){
                m.LimparConsole();

                //criamos uma lista aqui
                List<Integer> lista = new ArrayList<>();

                //e preenchemos ela com os valores do nosso array
                for (int i = 0; i < bubble.listaOrdenada.length; i++){
                    lista.add(bubble.listaOrdenada[i]);
                }
                //atribuimos nossa lista, agora preenchida, à lista da nossa classe collections
                col.menuCollections(lista);

                //depois de ordenar é só copiar os novos valores para nossa lista
                for (int i = 0; i < lista.size(); i++){
                    bubble.listaOrdenada[i] = lista.get(i);
                }

            }

            if (opcao == 0){
                System.out.println("Tem certeza que deseja sair?");
                System.out.println("Sim = 1");
                System.out.println("Não = 0");
                System.out.print("-");
                int opc = scanner.nextInt();
                if (opc < 0 || opc > 1){
                    System.out.println("Opção inválida");
                }else if(opc == 1){
                    break;
                }else{
                    m.LimparConsole();
                    System.out.println("Voltando");
                }
            }
        }
    }

    public void LimparConsole(){
        for (int i = 0; i < 50; i++){
            System.out.println("");
        }
    }
}