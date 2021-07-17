package com.week3.ödev;

public class Main {

    public static void main(String[] args) {


        THYReservationSystem thyReservationSystem = new THYReservationSystem();
        PegasusReservationSystem pegasusReservationSystem = new PegasusReservationSystem();

        System.out.println("Thy resevation :::  ");
        thyReservationSystem.rezarvasyonAl();

        System.out.println("Pegasus resevation :::  ");
        pegasusReservationSystem.rezarvasyonAl();

    }


 }

