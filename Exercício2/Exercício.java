package Exercício2;

import java.util.Scanner;

public class Exercício {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Digite o primeiro número: ");
                double num1 = sc.nextDouble();
   
                System.out.println("Digite o segundo número: ");
                double num2 = sc.nextDouble();
   
                System.out.println("Escolha a operação aritmética: ");
                System.out.println("1 - Adição");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                int operacao = sc.nextInt();
   
                double resultado = 0;
                switch (operacao) {
                    case 1:
                        resultado = num1 + num2;
                        break;
                    case 2:
                        resultado = num1 - num2;
                        break;
                    case 3:
                        resultado = num1 * num2;
                        break;
                    case 4:
                        resultado = num1 / num2;
                        break;
                    default:
                        System.out.println("Operação inválida!");
                        System.exit(0);
                }
   
                System.out.println("O resultado da operação é: " + resultado);
            }
        }

        public void Exercício2() {
        }
    }

