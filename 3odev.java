import java.util.Scanner;
public class JavaApplication1 {
 
   
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int vizeNot,finalNot;
        double ortalama;
        String durum="";
        System.out.print("Vize Notunuzu Girin : ");
        vizeNot=reader.nextInt();
        System.out.print("Final Notunuzu Girin : ");
        finalNot=reader.nextInt();
        ortalama=vizeNot*0.5+finalNot*0.7;
        if(ortalama>=50 && finalNot>=50){
            durum="Geçti";
        }
        else{
            durum="Kaldı";
        }
        System.out.println("Ortalama : " + ortalama);
        
        System.out.println("Durumunuz: " + durum);
    }
    
}
