import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double KGArmutFiyati = 2.14;
        double KGElmaFiyati =  3.67;
        double KGDomatesFiyati =1.11;
        double KGMuzFiyati= 0.95;
        double KGPatlıcanFiyati=5.00;
        Scanner input =new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ?");
        int A=input.nextInt();
        System.out.println("Elma Kaç Kilo ?");
        int E=input.nextInt();
        System.out.println("Muz Kaç Kilo ?");
        int M=input.nextInt();
        System.out.println("Domates Kaç Kilo ?");
        int D=input.nextInt();
        System.out.println("Patlıcan Kaç Kilo ?");
        int P=input.nextInt();
        double toplam;
        toplam=(A*KGArmutFiyati)+(E*KGElmaFiyati)+(D*KGDomatesFiyati)+(M*KGMuzFiyati)+(P*KGPatlıcanFiyati);
        System.out.println("Toplam Tutari " +toplam+ "TL");


    }
}


public class OkulPuanlarin {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float Ex1,Ex2;
        System.out.println(" Ogrencilerin Sayisi giriniz");
        int sayi=input.nextInt();
        for (int i=0;i<sayi;i++) {
            System.out.println(i+12+". Ogrenci");
            System.out.println("viza sinavin giriniz:");
            Ex1 = input.nextFloat();
            System.out.println("Final sinavin giriniz:");
            Ex2 = input.nextFloat();
            BasariliDurumu(Ex1, Ex2);
        }


    }

    private static void BasariliDurumu(float ex1, float ex2) {
        Double ort;
        ort =(ex1 * 0.4) + (ex2 *0.6);
        System.out.println(ort);
        if (ort<= 100 && ort>70 )
            System.out.println(" AA ile gecti :");
        else if (ort<= 70 && ort>50 )
            System.out.println(" BB ile gecti :");
       else if (ort<= 50 && ort>35 )
            System.out.println(" DC  sartli gecti :");
       else
            System.out.println (" FF kaldi ");


    }
}



public class FibonacciSerisi {

    static void FibonacciSeri(int N)
    {
        int num1 = 0, num2 = 1;
        int i;
        for(i=0;i<N;i++){
            System.out.print(num1 + " ");
            int num3=num1+num2;
            num1=num2;
            num2=num3;

        }
    }


    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println(" inter  a number of Fibonacci seri :  ");

        int N;
        N=input.nextInt();


        FibonacciSeri(N);
    }
}
