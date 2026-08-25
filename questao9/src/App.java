import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int []vet = new int[6];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um número inteiro: ");
            vet[i] = scanner.nextInt();
        }
        int pares=0;
        int impares=0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        int [] vetPares = new int[pares];
        int [] vetImpares = new int[impares];
        int somaPares = 0;
        for (int i = 0, j = 0, k = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                vetPares[j++] = vet[i];
                somaPares += vet[i];
            } else {
                vetImpares[k++] = vet[i];
            }
        }
        for(int i = 0; i < vetPares.length; i++) {
            System.out.println("vetPares[" + i + "] = " + vetPares[i]);
        }
        System.out.println("Soma dos números pares: " + somaPares);
        for(int i = 0; i < vetImpares.length; i++) {
            System.out.println("vetImpares[" + i + "] = " + vetImpares[i]);
        }
        System.out.println("Quantidade de números impares: " + impares);
        



        scanner.close();
    }
}
