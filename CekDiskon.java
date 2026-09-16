import java.util.Scanner;
public class CekDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan status member = ");
        String status = input.nextLine();  
        System.out.print("Anda mendapatkan diskon ");
            
            if (status.equals("Gold")) {
                System.out.println("20%");
            }

            else if (status.equals ("Silver")) {
                System.out.println("15%");
            }

            else if (status.equals("Bronze")) {
                System.out.println("10%");
            }

            else if (status.equals("Regular")) {
                System.out.println("Tidak ada diskon");
            }

            else {
                System.out.println("Status tidak valid");
            }
        }


}
