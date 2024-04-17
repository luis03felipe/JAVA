// Faça um programa em Java que receba três notas, calcule e mostre a média aritmética entre elas. 
// Ainda, informe se esse aluno está aprovado, em recuperação ou reprovado.

import java.util.Scanner;
public class MediaAritimetica{
    public static void main(String[] args){
    Scanner nota = new Scanner(System.in);
    int n1, n2, n3;
        
    System.out.print("Digite uma nota: ");
    n1 = nota.nextInt();
    
    System.out.print("Digite uma nota: ");
    n2 = nota.nextInt();
    
    System.out.print("Digite uma nota: ");
    n3 = nota.nextInt();
    
    int media = (n1+n2+n3)/3;
    
    System.out.println("Média aritmética: " + media);
    
    if (media >=6){
        System.out.println("Aprovado");
    }else{
    System.out.println("Reprovado");
        }
    }
}

