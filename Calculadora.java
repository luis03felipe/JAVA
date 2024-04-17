//Faça um programa que simule uma calculadora simples. O usuário deve informar
//dois números e a operação desejada e o sistema deve apresentar o resultado na tela

import java.util.Scanner;
public class Calculadora{
    public static void main(String[] args){
    int n1, n2, opcao;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite dois números inteiros: ");
    n1 = entrada.nextInt();
    n2 = entrada.nextInt();
    
    System.out.println("Digite a operação: \n1 - Soma \n2 - Subtração \n3 - Divisão \n4 - Multiplicação ");
    opcao = entrada.nextInt();
    entrada.close();
    
    switch (opcao){
        case 1:
            System.out.println("Soma: " + (n1+n2));
            break;
        case 2:
            System.out.println("Subtração: " + (n1-n2));
            break;
        case 3:
            System.out.println("Divisão: " + (n1/n2));
            break;
        case 4:
            System.out.println("Multiplicação: " + (n1*n2));
            break;
        case 5: 
            System.out.println("Operação inválida!");
            break;
        }
    }
}

