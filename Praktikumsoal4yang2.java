package praktikumsoal4yang2;
import java.util.Scanner;

public class Praktikumsoal4yang2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double r, L;
        final double phi = 3.141592;
        
        System.out.print("Masukkan r : ");
        r = input.nextDouble();
        
        L = Math.round(phi*r*r);
        System.out.println(L);
    }
    
}
