import java.util.Scanner;

public class PesquisaPopulacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maiorIdade = -1;
        int menorIdade = Integer.MAX_VALUE;
        int mulheresEspecificas = 0;
        boolean dadosInseridos = false;

        System.out.println("=== Pesquisa de Características Físicas ===");
        
        while (true) {
            System.out.print("Digite a idade (ou -1 para encerrar): ");
            int idade = scanner.nextInt();
            
            if (idade == -1) {
                break;
            }
            dadosInseridos = true;
            
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            
            System.out.print("Sexo (M - Masculino, F - Feminino): ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            
            System.out.print("Cor dos olhos (A - Azuis, V - Verdes, C - Castanhos): ");
            char olhos = scanner.next().toUpperCase().charAt(0);
            
            System.out.print("Cor dos cabelos (L - Louros, C - Castanhos, P - Pretos): ");
            char cabelos = scanner.next().toUpperCase().charAt(0);
            
            if (sexo == 'F' && (idade >= 18 && idade <= 35) && olhos == 'V' && cabelos == 'L') {
                mulheresEspecificas++;
            }
            
            System.out.println("--------------------------------------------------");
        }
        
        if (dadosInseridos) {
            System.out.println("\n=== Resultados da Pesquisa ===");
            System.out.println("Maior idade entre os habitantes: " + maiorIdade);
            System.out.println("Menor idade entre os habitantes: " + menorIdade);
            System.out.println("Indivíduos do sexo feminino (18 a 35 anos, olhos verdes e cabelos louros): " + mulheresEspecificas);
        } else {
            System.out.println("\nNenhum habitante foi registrado.");
        }
        
        scanner.close();
    }
}