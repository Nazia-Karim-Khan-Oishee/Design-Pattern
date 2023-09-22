package org.example;

import java.util.Date;

public class Faculty extends Employee{
private Double office_hour;
private String rank;
    public Faculty(String name, String address, String email, String phone, String office, int salary, MyDate date_hired, Double office_hour, String rank) {
        super(name, address, email, phone, office, salary, date_hired);
        this.office_hour=office_hour;
        this.rank=rank;
    }



    public void setOffice_hour(Double office_hour) {
        this.office_hour = office_hour;
    }

    public Double getOffice_hour() {
        return office_hour;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public String getRank() {
        return rank;
    }
    @Override
    public String toString() {
        return "Name of this person is "+ this.getName() + " and the class name is " +  getClass().getName();
    }}
