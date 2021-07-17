package com.week3.ödev;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class PegasusReservationSystem  extends FlightReservationSystem{

    @Override
    public void rezarvasyonAl() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        FlightReservationSystem flightReservationSystem = new FlightReservationSystem();

        System.out.println("Please enter seats number : ");
        flightReservationSystem.setSeatsNumber(scanner.nextInt());
        flightReservationSystem.setKoltuk(new boolean[flightReservationSystem.getSeatsNumber()]);
        flightReservationSystem.setBusinessSeat(random.nextInt(10)); //x;


        HashMap<Integer, Boolean> seats = new HashMap<>(flightReservationSystem.getSeatsNumber());

        flightReservationSystem.randomSeatAllocation(flightReservationSystem.getKoltuk(), flightReservationSystem.getSeatsNumber(), seats);

        super.rezarvasyonAl();
    }
}
