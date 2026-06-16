package temastrings;

import java.util.Scanner;

public class desafioCPF {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o cpf: ");
            String cpf = scanner.nextLine();
            
            String apenasNumeros = cpf.replace(".", "")
                    .replace("-", "")
                    .replace("-", "")
                    .replace(" ", "");
            
            System.out.println("CPF original: " + cpf);
            System.out.println("Apenas números: " + apenasNumeros);
        }
    }
}