package service.concretes;

import model.Ucak;
import service.abstracts.BaseRezervasyonService;

import java.util.Scanner;

public class ThyRezervasyon implements BaseRezervasyonService {
    private int koltukNumarasi;

    @Override
    public void rezervasyonAl(Ucak ucak) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Koltik Tipi Seçiniz?");
        System.out.println("1- Business \n2- Ekonomi");
        int secim = scanner.nextInt();

        System.out.println(ucak.getKoltukTuru());
        while (true){
            koltukNumarasi = scanner.nextInt();
            boolean koltukDoluluk = ucak.getKoltuklar().get(koltukNumarasi);
            if(!koltukDoluluk){
                ucak.getKoltuklar().put(koltukNumarasi,true);
                System.out.println(ucak.getKoltuklar() + "\n" + ucak.getKoltukTuru());
            }else{
                System.out.println("Koltuk malesef dolu!");
            }
        }
    }


}
