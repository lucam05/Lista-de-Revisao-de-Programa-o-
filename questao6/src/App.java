import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int NUM_QUESTOES = 8;
        final int NUM_ALUNOS = 10;
        final int NOTA_MINIMA = 6;
        
        char[] gabarito = new char[NUM_QUESTOES];
        int totalAprovados = 0;

        System.out.println("=== Cadastro do Gabarito da Prova ===");
        for (int i = 0; i < NUM_QUESTOES; i++) {
            System.out.print("Digite a resposta correta da questão " + (i + 1) + ": ");
            // Lê a resposta, converte para maiúscula e pega o primeiro caractere
            gabarito[i] = scanner.next().toUpperCase().charAt(0); 
        }

        System.out.println("\n=== Correção das Provas dos Alunos ===");
        
        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.print("\nDigite o número (ID) do " + (i + 1) + "º aluno: ");
            int numeroAluno = scanner.nextInt();
            
            int notaAluno = 0;
            for (int j = 0; j < NUM_QUESTOES; j++) {
                System.out.print("Resposta da questão " + (j + 1) + ": ");
                char resposta = scanner.next().toUpperCase().charAt(0);
    
                if (resposta == gabarito[j]) {
                    notaAluno++;
                }
            }
            System.out.println("-> A nota do aluno " + numeroAluno + " foi: " + notaAluno);
            
            if (notaAluno >= NOTA_MINIMA) {
                totalAprovados++;
            }
        }
        
        double porcentagemAprovacao = (totalAprovados * 100.0) / NUM_ALUNOS;
        System.out.println("\n=== Resultado Geral da Turma ===");
        System.out.println("Total de alunos aprovados: " + totalAprovados);
        System.out.println("Porcentagem de aprovação: " + porcentagemAprovacao + "%");
        
        scanner.close();
    }
}
