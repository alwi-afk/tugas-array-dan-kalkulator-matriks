package array;

import java.util.Scanner;

public class array_1_dimensi {

    public static void main(String[] args) {
        String[] laptop = new String[5];
        Scanner scan = new Scanner(System.in);

        for( int i = 0; i < laptop.length; i++ ){
            System.out.print("laptop " + i + ": ");
            laptop[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String b : laptop ){
            System.out.println(b);
        }
    }
    
}
