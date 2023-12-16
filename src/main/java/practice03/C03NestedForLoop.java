package practice03;

public class C03NestedForLoop {
    public static void main(String[] args) {

        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */

        int sayi=5;

        for (int i = 0; i < sayi; i++) { // satirlar icin >> outer loop
            for (int j = 0; j <= i; j++) {  // inner loop ic loop sutun icin yani *yazdirma
                System.out.print("* ");

            }
            System.out.println();
        }

        for (int i = sayi-1; i >0 ; i--) { // satirlar icin
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

















    }
}
