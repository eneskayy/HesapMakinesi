import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2,select;

        Scanner inp =   new Scanner(System.in);
        System.out.print("İlk sayıyı girin : ");
        n1 = inp.nextInt();

        System.out.print("İkinci sayıyı girini : ");
        n2 = inp.nextInt();

        System.out.println("1-Toplama,\n2-Çıkarma,\n3-Çarpma,\n4-Bölme");
        select = inp.nextInt();

        switch (select){
            case 1 :
                System.out.println("Sonuç : " +(n1 + n2));
                break;

            case 2 :
                System.out.println("Sonuç : " +(n1 - n2));
                break;
            case 3 :
                System.out.println("Sonuç : " +(n1 * n2));
                break;
            case 4 :

                if (n2 != 0){
                    System.out.println("Sonuç : " +(n1 / n2));
                }
                    else {
                    System.out.println("Tanımsız");
                    }
                    break;

            default:
                System.out.println("Yanlış Giriş Yaptınız!");



        }


    }
}