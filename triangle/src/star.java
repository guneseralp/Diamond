import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.print("Basamak sayisini giriniz: ");
        int n= scan.nextInt();
        for (int i =1; i<=n; i++){
            for (int k= 1; k<= (n-i); k++){
                System.out.print(" ");
            }
            for (int l=1; l<= (2*i)-1; l++){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int a=1; a<n; a++){
            for (int b = 1; b<=a; b++){
                System.out.print(" ");
            }
            for (int c=1; c<= (2*n-(2*a+1));c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
