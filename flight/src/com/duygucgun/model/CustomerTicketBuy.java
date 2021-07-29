package com.codeunlu.model;

import java.time.LocalDateTime;
import java.util.Map;

public class CustomerTicketBuy {
    private Integer id;
    private Integer customerId;
    private Integer flightId;
    private Map<Integer,ChairType> flightPlane;
    private LocalDateTime purchaseDate;

    public CustomerTicketBuy(){}

    public CustomerTicketBuy(Integer id, Integer customerId, Integer flightId, Map<Integer, ChairType> flightPlane, LocalDateTime purchaseDate) {
        this.id = id;
        this.customerId = customerId;
        this.flightId = flightId;
        this.flightPlane = flightPlane;
        this.purchaseDate = purchaseDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Map<Integer, ChairType> getFlightPlane() {
        return flightPlane;
    }

    public void setFlightPlane(Map<Integer, ChairType> flightPlane) {
        this.flightPlane = flightPlane;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
