import java.util.Scanner;

public class App {

    public static int calculoMaior(int [] vet){
        int maior = vet[0];
        for (int i=1; i < vet.length;i++){
            if (vet[i] > maior){
                maior = vet[i];
            }
        }
        return maior;
    } 
    public static int calculoMenor(int [] vet){
        int menor = vet[0];
        for (int i=1; i < vet.length;i++){
            if (vet[i] < menor){
                menor = vet[i];
            }
        }
        return menor;
    }
    public static boolean calculoDivisivel(int x, int y){
        boolean divisivel = false;
        if (x % y == 0){
            divisivel = true;
        }
        else {
            divisivel = false;
        }
        return divisivel;
        
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int [] vet = new int[3];

        for (int i=0; i < vet.length;i++){
            System.out.println("Digite um número: ");
            vet[i] = scanner.nextInt();
        }

        System.out.println("O maior número é: " + calculoMaior(vet));
        System.out.println("O menor número é: " + calculoMenor(vet));
        System.out.println("O número " + vet[0] + " é divisivel por " + vet[1] + "? "+ calculoDivisivel(vet[0], vet[1]) + " e por" + vet[2] + "? " + calculoDivisivel(vet[0], vet[2]));
        boolean intervalo = false;
        
        if (vet[0] > vet[1] && vet[1] < vet[2]) {
            intervalo = true;
        }
        if(intervalo== true){
            System.out.println("O número " + vet[0] + " está no intervalo entre " + vet[1] + " e " + vet[2]);
        } else {
            System.out.println("O número " + vet[0] + " não está no intervalo entre " + vet[1] + " e " + vet[2]);
        }

        scanner.close();
    }
}
