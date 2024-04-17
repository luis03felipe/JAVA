import java.util.Scanner;

public class SomaVetor {
    public static void imprimeVetor (int[] vet){
        for(int i = 0; i < vet.length; i++){
            System.out.print(vet[i] + " - ");
        }
        System.out.println();
    }
    
    public static int somaVetor (int [] vet){
        int soma = 0;
        for(int i = 0; i <vet.length; i++){
            soma += vet[i];
        }
        return soma;
    }      
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] a = new int[5];
        int[] b = new int[5];
        
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite um elemento: " + i);
            a[i] = entrada.nextInt();
        }
        for(int i = 0; i < b.length; i++){
            b[i] = a[i] * 2;
        }
        imprimeVetor(a);
        int s = somaVetor(a);
        System.out.println("Soma do vetor a = " + s);
        
        imprimeVetor(b);
        s = somaVetor(b);
        System.out.println("Soma do vetor b = " + s);
    }
}

