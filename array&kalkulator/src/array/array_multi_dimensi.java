package array;

import java.util.Scanner;

public class array_multi_dimensi {
    public static void main(String[] args) {
        
        String [][] laptop =  new String[2][3];
         Scanner scan = new Scanner(System.in);
         
        for(int bar=0; bar<laptop.length;bar++){
            for(int kol=0; kol<laptop[bar].length;kol++){
            System.out.format("produk laptop apa yang ada di (%d,%d): ", bar,kol);
            
            laptop[bar][kol] = scan.nextLine();
            
            }    
        }
        System.out.println("+++++++++++++++++++++++++");
        for(int bar = 0; bar < laptop.length; bar++){
            for(int kol = 0; kol < laptop[bar].length; kol++){
                System.out.format("| %s | \t", laptop[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("+++++++++++++++++++++++++");
        
    }
}
    

