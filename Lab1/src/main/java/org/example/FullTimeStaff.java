package org.example;

import java.util.Date;

public class FullTimeStaff extends Staff{
    public FullTimeStaff(String name, String address, String email, String phone, String office, MyDate date_hired, String title, int salary) {
        super(name, address, email, phone, office, salary, date_hired, title);

    }

    @Override
    public String toString() {
        return "Name of this person is "+ this.getName() + " and the class name is " +  getClass().getName();
    }
}
