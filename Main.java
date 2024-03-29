import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de quantos elementos o vetor será composto ► ");
        int qtd_numeros = scan.nextInt();

        int[] vetorN = new int[qtd_numeros];

        for(int i=0; i < vetorN.length; i++) {
            System.out.printf("Digite o valor do %dº elemento ►  ", i+1);
            vetorN[i] = scan.nextInt();
        }
        System.out.println();
        int subtracao = subtracaoMaiorMenor(vetorN);
        System.out.println("A subtração do maior e o menor dos elementos digitados é " + subtracao);

        boolean orderC = orderCcheck(vetorN);
        System.out.println("\nA ordem é crescente? " + orderC);
        
        scan.close();
    }
    public static int subtracaoMaiorMenor(int[] array) {
        int valorMenor = Integer.MAX_VALUE;
        for(int i=0; i < array.length; i++) {
            if(valorMenor > array[i]) {
            	valorMenor = array[i];
            }
        }
        int valorMaior = Integer.MIN_VALUE;
        for(int i=0; i < array.length; i++) {
            if(valorMaior < array[i]){
            	valorMaior = array[i];
            }
        }
        return valorMaior - valorMenor;
    }
    public static boolean orderCcheck(int[] array) {
        for(int i=0; i < array.length-1; i++) {
            if(array[i] > array[i + 1]){
                return false; 
            }
        }
        return true;
    }
}