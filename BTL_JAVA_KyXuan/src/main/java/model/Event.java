/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author linhc
 */
public class Event {
    private Long id;
    private String nameEvent;
    private Date startDay;
    private Date endDay;
    private Integer numberOfStudent;
    private String address;
    private List<OperatingFee> operatingFees = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public Event() {
    }

    public Event(Long id, String nameEvent, Date startDay, Date endDay, Integer numberOfStudent, String address) {
        this.id = id;
        this.nameEvent = nameEvent;
        this.startDay = startDay;
        this.endDay = endDay;
        this.numberOfStudent = numberOfStudent;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public Integer getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(Integer numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<OperatingFee> getOperatingFees() {
        return operatingFees;
    }

    public void setOperatingFees(List<OperatingFee> operatingFees) {
        this.operatingFees = operatingFees;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    
    
    
}