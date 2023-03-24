package Exercício3;

import java.util.Scanner;

public class QuitandaDoSeuMadruga {
  public static void main(String[] args) {
    double precoMorango = 2.5;
    double precoMaca = 1.8;
    double precoBanana = 1.3;
    
    Scanner input = new Scanner(System.in);
    
    // Passo 1
    System.out.println("Quantidade de morangos (em Kg): ");
    double quantidadeMorango = input.nextDouble();
    System.out.println("Quantidade de maças (em Kg): ");
    double quantidadeMaca = input.nextDouble();
    System.out.println("Quantidade de bananas (em Kg): ");
    double quantidadeBanana = input.nextDouble();
    
    // Passo 2
    double total = quantidadeMorango * precoMorango + quantidadeMaca * precoMaca + quantidadeBanana * precoBanana;
    
    // Passo 3
    double desconto = 0;
    if ((quantidadeMorango + quantidadeMaca + quantidadeBanana) > 8 || total > 25) {
      desconto = total * 0.1;
    }
    
    // Passo 4
    double valorFinal = total - desconto;
    
    // Exibindo o valor final
    System.out.println(valorFinal);
    
    input.close();
  }

  public void VendaDoSeuMadruga() {
  }
}

