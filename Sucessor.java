import java.util.Scanner;
public class Sucessor{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = sc.nextInt();
        int sucessor = numero + 1;
        int antecessor = numero - 1;
        System.out.println("O numero " + numero +  " tem como sucessor " + sucessor + " Antecessor " + antecessor);
    }
}