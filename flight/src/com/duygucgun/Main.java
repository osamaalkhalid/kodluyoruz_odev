package com.codeunlu;

import com.codeunlu.model.*;
import com.codeunlu.service.IBaseReservation;
import com.codeunlu.service.PegasusReservation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Müşteri Oluşturuldu
        Customer customer = new Customer();
        customer.setId(1);
        customer.setEmail("codeunlu@gmail.com");
        customer.setName("Mustafa");
        customer.setSurname("ÜNLÜ");

        // Uçuş Oluşturuldu
        Flight flight = new Flight();
        flight.setId(1);
        flight.setFlightChairCount(15);
        flight.setFlightChairBusinessCount(5);
        flight.setCompany(Company.PEGASUS);
        flight.setFlightTimeStart(new Date(2021,7,16));
        flight.setFlightTimeEnd(new Date(2021,7,16));

        // Uçuşa ait uçak oluşturuldu
        FlightPlane flightPlane = new FlightPlane();
        flightPlane.setId(1);
        flightPlane.setFlightId(1);
        Map<Integer,Boolean> flightMap = new HashMap<>();
        Map<Integer, ChairType> flightChairTypeMap = new HashMap<>();
        for (Integer i = 1; i<=flight.getFlightChairCount(); i++){
            flightMap.put(i,true);
            if(i <= flight.getFlightChairBusinessCount()){
                flightChairTypeMap.put(i,ChairType.BUSINESS);
            }else{
                flightChairTypeMap.put(i,ChairType.ECONOMY);
            }
        }
        flightPlane.setChairStatus(flightMap);
        flightPlane.setChairs(flightChairTypeMap);

        //Uçuş bileti oluştur
        IBaseReservation baseReservation = new PegasusReservation();
        Flight[] flights =  {
                flight
        };
        FlightPlane[] flightPlanes = {
                flightPlane
        };
        baseReservation.createReservation(flights,flightPlanes,customer);
        System.out.println(flightMap);
    }
}
