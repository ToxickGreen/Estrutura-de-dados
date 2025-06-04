import java.util.*;

public class InsertionSort {
    Scanner scanner = new Scanner(System.in);
    BubbleSort b = new BubbleSort(); //pegando nossa lista

    //Fazendo um menu
    public void Menuzinho(){
        while (true){
            //Imprimindo a lista
            System.out.print("Sua lista: ");
            for (int i = 0; i < b.listaOrdenada.length; i++){
                System.out.print(b.listaOrdenada[i]+ " ");
            }
            System.out.println("");
            System.out.println("1-Ordenar a lista com Insertion Sort");
            System.out.println("2-voltar");
            System.out.println("---------------------------------------");
            System.out.print("Digite sua escolha: ");
            int opc = scanner.nextInt();

            if (opc < 1 || opc > 2){
                System.out.println("Opção inválida");
            }
            //Ordenar
            if (opc == 1){
                InsertionOdr();
            }

            if (opc == 2){
                System.out.println("Saindo...");
                break;
            }

        }
    }

    public void InsertionOdr(){
        //criando o inserction Sort
        //lembrando que as posições nos vetores começam com 0
        for (int i = 1; i < b.listaOrdenada.length; i++){ // aqui criamos uma variavel i que começa valendo 1
            int chave = b.listaOrdenada[i]; //como a variavel i = 1, a variavel chave guarda uma posição a frente
            int j = i - 1; // a variavel j guarda as posições anteriores a variavel chave

            // comparando a chave com os demais valores
            while (j >= 0 && b.listaOrdenada[j] > chave){//aqui não deixamos o j chegar nas posições negativas do vetor ocasionando erro
                //comparamos os valores anteriores à posição chave, se forem maiores, passamos eles para frente
                b.listaOrdenada[j+1] = b.listaOrdenada[j];//empurrando o valor anterior pra frente
                j--; //fazendo o j ir pra proxima posição da esquerda para compara-la com a atual chave tambem
            }
            b.listaOrdenada[j+1] = chave; // reposicionando o primeiro valor chave
        }
    }
}
