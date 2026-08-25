import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos (n): ");
        int n = scanner.nextInt();

        System.out.println("\n--- Matrículas: Programação Modular ---");
        int[] modular = lerVetorMatriculas(n, scanner);

        System.out.println("\n--- Matrículas: Cálculo ---");
        int[] calculo = lerVetorMatriculas(n, scanner);

        List<Integer> intersecao = calcularIntersecao(modular, calculo);

        imprimirResultado(intersecao);

        scanner.close();
    }

    public static int[] lerVetorMatriculas(int tamanho, Scanner scanner) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite a matrícula " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        return vetor;
    }

    public static List<Integer> calcularIntersecao(int[] vetor1, int[] vetor2) {
        List<Integer> intersecao = new ArrayList<>();
        
        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j] && !intersecao.contains(vetor1[i])) {
                    intersecao.add(vetor1[i]);
                }
            }
        }
        return intersecao;
    }

    public static void imprimirResultado(List<Integer> intersecao) {
        System.out.println("\n--- Alunos em Ambas as Disciplinas ---");
        if (intersecao.isEmpty()) {
            System.out.println("Nenhum aluno está matriculado simultaneamente nas duas disciplinas.");
        } else {
            System.out.println("Matrículas (Intersecção):");
            for (Integer matricula : intersecao) {
                System.out.println("- " + matricula);
            }
        }
    }
}
