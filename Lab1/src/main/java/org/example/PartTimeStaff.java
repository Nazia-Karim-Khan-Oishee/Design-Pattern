package org.example;

import java.util.Date;

public class PartTimeStaff extends Staff{
    private Double working_hour;
   private double base_salary;
    public PartTimeStaff(String name, String address, String email, String phone, String office, MyDate date_hired, String title, int salary, Double working_hour) {
        super(name, address, email, phone, office, salary, date_hired, title);
        this.base_salary=base_salary;
        this.working_hour=working_hour;
    }

    public Double getWorking_hour() {
        return working_hour;
    }

    @Override
    public void setSalary(int salary) {
        this.salary= (int) (this.working_hour*base_salary);
    }

    public void setWorking_hour(Double working_hour) {
        this.working_hour = working_hour;
    }
    @Override
    public String toString() {
        return "Name of this person is "+ this.getName() + " and the class name is " +  getClass().getName();
    }
}
