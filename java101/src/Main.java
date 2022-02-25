import java.util.Scanner;

public class Main {public static void main(String[] args) {
   double  mesafe , odeme ;
   Scanner input = new Scanner(System.in);
   System.out.println("Hesaplanacak mesafeyi giriniz= " );
   mesafe = input.nextInt();
   odeme = (mesafe * 2.2) + 10 ;
   System.out.println(odeme < 20 ? "Ödenecek tutar 20 liradır " : "Ödemecek tutar " + odeme + "liradır" );

}

}