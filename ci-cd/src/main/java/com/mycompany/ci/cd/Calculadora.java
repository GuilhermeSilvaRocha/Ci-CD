/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ci.cd;

/**
 *
 * @author 823212197
 */
   import java.util.Scanner;

public class Calculadora {

     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.println("Bem-vindo à Calculadora!");
             
             while (true) {
                 System.out.println("Escolha uma operação:");
                 System.out.println("1: Adição");
                 System.out.println("2: Subtração");
                 System.out.println("3: Multiplicação");
                 System.out.println("4: Divisão");
                 System.out.println("5: Sair");
                 
                 int opcao = scanner.nextInt();
                 
                 if (opcao == 5) {
                     System.out.println("Saindo...");
                     break;
                 }
                 
                 System.out.print("Digite o primeiro número: ");
                 double num1 = scanner.nextDouble();
                 
                 System.out.print("Digite o segundo número: ");
                 double num2 = scanner.nextDouble();
                 
                 double resultado;
                 
                 switch (opcao) {
                     case 1 -> {
                         resultado = num1 + num2;
                         System.out.println("Resultado: " + resultado);
                     }
                     case 2 -> {
                         resultado = num1 - num2;
                         System.out.println("Resultado: " + resultado);
                     }
                     case 3 -> {
                         resultado = num1 * num2;
                         System.out.println("Resultado: " + resultado);
                     }
                     case 4 -> {
                         if (num2 != 0) {
                             resultado = num1 / num2;
                             System.out.println("Resultado: " + resultado);
                         } else {
                             System.out.println("Erro: Divisão por zero!");
                         }
                     }
                     default -> System.out.println("Opção inválida! Tente novamente.");
                 }
             }}
    }
}
