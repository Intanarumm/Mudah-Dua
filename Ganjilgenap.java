import java.util.Scanner;

public class Ganjilgenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        System.out.println("Masukkan Bilangan");
        bilangan = input.nextInt();

        if (bilangan % 2==0) {
            System.out.println(bilangan + ": Bilangan tersebut genap");
            
        } else {
            System.out.println(bilangan + ": Bilangan tersebut ganjil");
        }
        

    }
    
}
