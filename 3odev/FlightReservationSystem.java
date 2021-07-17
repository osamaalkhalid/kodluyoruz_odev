package com.week3.ödev;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static com.week2.ödev.StudentPoint.StudentPoint.scanner;

public  class FlightReservationSystem implements reservationService{

    private int seatsNumber;
    private boolean[] koltuk = new boolean[seatsNumber];
    private int businessSeat;
    private HashMap<Integer, Boolean> seats = new HashMap<>(seatsNumber);

    public FlightReservationSystem() {
    }

    @Override
    public  void updating(int passengerSeat,HashMap<Integer,Boolean> seats){
        seats.put(passengerSeat, true);
        for (Map.Entry<Integer,Boolean> entry : seats.entrySet()){
            Integer key = entry.getKey();
            Boolean value = entry.getValue();
            System.out.print(key + " " + value + "\t");
        }

    }

    @Override
    public  void randomSeatAllocation(boolean[] koltuk, int seatsNumber,HashMap<Integer,Boolean> seats ){
        for (int i = 0; i <= seatsNumber-1; i++){
            Random random = new Random();
            int j = random.nextInt(10)+1;
            if (j <= 5){
                koltuk[i] = false;
            }else {
                koltuk[i] = true;
            }
        }
//        for (Boolean bom: koltuk) {
//            System.out.print(bom + " ");
//        }

        for (int i = 0; i <= seatsNumber-1; i++){
            seats.put(i, koltuk[i]);
        }

        for (Map.Entry<Integer,Boolean> entry : seats.entrySet()){
            Integer key = entry.getKey();
            Boolean value = entry.getValue();
            System.out.print(key + " " + value + "\t");
        }

    }

    @Override
    public  boolean businessDoluMu(int businessSeat, boolean[] koltuk){
        boolean check = false;
        for (int i=0; i < businessSeat; i++){
            if (koltuk[i] == false){
                System.out.println((i+1) + ".business seat is empty");
                check = true;
            }
        }

        return check;
    }

    @Override
    public  int buySeat(int businessSeat, boolean[] koltuk){
        int seat = 0;
        for (int i=0; i < businessSeat; i++){
            if (koltuk[i] == false){
                seat = (i+1);
                break;
            }
        }
        return seat;
    }

    @Override
    public  boolean ekonomiDoluMu(int businessSeat, boolean[] koltuk){
        boolean check = false;
        for (int i=businessSeat; i <= koltuk.length-1; i++){
            if (koltuk[i] == false){
                System.out.println((i+1) + ".economy seat is empty");
                check = true;
            }
        }
        return check;
    }

    public  void rezarvasyonAl(){
        System.out.println();
        System.out.print("Which class would you like to travel : ");
        int classType = scanner.nextInt();
        boolean boşKoltukVarMı=false;

        switch (classType){
            case 1 :
                boşKoltukVarMı= businessDoluMu(getBusinessSeat(),getKoltuk());
                if (boşKoltukVarMı = true){
                    System.out.println(buySeat(getBusinessSeat(),getKoltuk()));
                    int passengerSeat = buySeat(getBusinessSeat(),getKoltuk());
                    System.out.println("Your seat number is : " + passengerSeat);
                    updating(passengerSeat, seats);
                }
                if(boşKoltukVarMı = false){
                    System.out.println("Business is full.");
                }
                break;
            case 2 :
                boşKoltukVarMı= ekonomiDoluMu(getBusinessSeat(),getKoltuk());
                if (boşKoltukVarMı = true){
                    System.out.println(buySeat(getBusinessSeat(),getKoltuk()));
                    int passengerSeat = buySeat(getBusinessSeat(),getKoltuk());
                    System.out.println("Your seat number is : " + passengerSeat);
                    updating(passengerSeat, seats);
                }
                if(boşKoltukVarMı = false){
                    System.out.println("Economy is full.");
                }
                break;
            default:
                System.out.println("Error...");

        }

    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public boolean[] getKoltuk() {
        return koltuk;
    }

    public void setKoltuk(boolean[] koltuk) {
        this.koltuk = koltuk;
    }

    public int getBusinessSeat() {
        return businessSeat;
    }

    public void setBusinessSeat(int businessSeat) {
        this.businessSeat = businessSeat;
    }
}
