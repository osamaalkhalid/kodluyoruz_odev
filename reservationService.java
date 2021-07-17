package com.week3.ödev;

import java.util.HashMap;

public interface reservationService {

    void updating(int passengerSeat,HashMap<Integer,Boolean> seats);

    void randomSeatAllocation(boolean[] koltuk, int seatsNumber,HashMap<Integer,Boolean> seats );

    boolean businessDoluMu(int businessSeat, boolean[] koltuk);

    int buySeat(int businessSeat, boolean[] koltuk);

    boolean ekonomiDoluMu(int businessSeat, boolean[] koltuk);

}
