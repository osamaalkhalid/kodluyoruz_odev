package com.codeunlu.model;

import java.util.Map;

public class FlightPlane {
    private Integer id;
    private Integer flightId;
    private Map<Integer,ChairType> chairs;
    private Map<Integer,Boolean> chairStatus;

    public FlightPlane(){}

    public FlightPlane(Integer id, Integer flightId, Map<Integer, ChairType> chairs, Map<Integer, Boolean> chairStatus) {
        this.id = id;
        this.flightId = flightId;
        this.chairs = chairs;
        this.chairStatus = chairStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Map<Integer, ChairType> getChairs() {
        return chairs;
    }

    public void setChairs(Map<Integer, ChairType> chairs) {
        this.chairs = chairs;
    }

    public Map<Integer, Boolean> getChairStatus() {
        return chairStatus;
    }

    public void setChairStatus(Map<Integer, Boolean> chairStatus) {
        this.chairStatus = chairStatus;
    }

}
