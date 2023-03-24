package Exercício1;

import java.util.Scanner;

public class DistribuirAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de matrícula do aluno: ");
        int matricula = sc.nextInt();

        int time = matricula % 4;

        switch (time) {
            case 0:
                System.out.println("O aluno foi distribuído para o Time do Chris");
                break;
            case 1:
                System.out.println("O aluno foi distribuído para o Time do Greg");
                break;
            case 2:
                System.out.println("O aluno foi distribuído para o Time do Caruso");
                break;
            case 3:
                System.out.println("O aluno foi distribuído para o Time do Jerome");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        sc.close();
    }

    public void Prova1() {
    

    }
}
