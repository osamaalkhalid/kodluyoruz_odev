package com.codeunlu.service;

import com.codeunlu.model.Customer;
import com.codeunlu.model.Flight;
import com.codeunlu.model.FlightPlane;

public interface IBaseReservation {
    void createReservation(Flight[] flight, FlightPlane[] flightPlane, Customer customer);
}
