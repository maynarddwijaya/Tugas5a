import java.util.Scanner;

public class Penilaian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai = ");
        int nilai = input.nextInt();

        if (nilai >= 0 && nilai <= 100) {
            System.out.print("Anda mendapatkan nilai : ");
            
            if (nilai >= 85) {
                System.out.println("A");
            } else if (nilai >= 70) {
                System.out.println("B");
            } else if (nilai >= 55) {
                System.out.println("C");
            } else if (nilai >= 40) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
}
