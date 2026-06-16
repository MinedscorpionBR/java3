package temastrings;

public class TestesRapidos {
    public static void main(String[] args) {
        // ================================================
        // TESTES RÁPIDOS - STRINGS EM JAVA
        // Complete os testes abaixo substituindo os "???"
        // ================================================
        
        System.out.println("=== TESTES RÁPIDOS - STRINGS ===\n");
        
        // TESTE 1: length()
        String texto1 = "CursodeJAVA";
        int tamanho = 10;  // Complete com o método correto
        System.out.println("1. Tamanho de 'CursodeJAVA': " + tamanho);
        
        // TESTE 2: charAt()
        String palavra = "Java";
        String letra = "j" ;  // Pegue o caractere na posição 0
        System.out.println("2. Primeira letra de 'Java': " + letra);
        
        // TESTE 3: substring()
        String texto = "Aprendendo Java";
        String parte = "A";  // Extraia "Java" (posição 11 até o fim)
        System.out.println("3. Extraindo 'Java': " + parte);
        
        // TESTE 4: indexOf()
        String frase = "Java é incrível";
        int posicao = 9;  // Encontre a posição de "incrível"
        System.out.println("4. Posição de 'incrível': " + posicao);
        
        // TESTE 5: toUpperCase()
        String nome = "joao";
        String maiusculo = "JOÃO";  // Converta para MAIÚSCULO
        System.out.println("5. 'joao' em maiúsculo: " + maiusculo);
        
        // TESTE 6: toLowerCase()
        String sobrenome = "SILVA";
        String minusculo = "silva";  // Converta para minúsculo
        System.out.println("6. 'SILVA' em minúsculo: " + minusculo);
        
        // TESTE 7: trim()
        String comEspacos = "  Java  ";
        String semEspacos = "Java";  // Remova os espaços
        System.out.println("7. '  Java  ' sem espaços: '" + semEspacos + "'");
        
        // TESTE 8: equals()
        String senha1 = "admin123";
        String senha2 = "admin123";
        String iguais = "são senhas iguais";  // Compare se são iguais
        System.out.println("8. Senhas são iguais? " + iguais);
        
        // TESTE 9: replace()
        String telefone = "(11) 99999-8888";
        String numeros = "99999-8888";  // Remova ( ) - e espaço (use replace)
        System.out.println("9. Telefone limpo: " + numeros);
        
        // TESTE 10: contains()
        String email = "usuario@email.com";
        String temArroba = "não";  // Verifique se contém "@"
        System.out.println("10. Email tem @? " + temArroba);
    }
}