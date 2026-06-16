package temastrings;

import java.util.Scanner;

import java.util.Scanner;

public class desafioNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

       
        nomeCompleto = nomeCompleto.trim();

        
        int posicaoEspaco = nomeCompleto.indexOf(" ");

        
        if (posicaoEspaco == -1) {
            System.out.println("Primeiro nome: " + nomeCompleto);
            System.out.println("Sobrenome: (Não informado)");
        } else {
            
            String primeiroNome = nomeCompleto.substring(0, posicaoEspaco);

          
            String sobrenome = nomeCompleto.substring(posicaoEspaco + 1).trim();

            
            
            
            System.out.println("Primeiro nome: " + primeiroNome);
            System.out.println("Sobrenome: " + sobrenome);
        }

        scanner.close();
    }
}