package org.example;

public class Employee extends Person{
    private String office;
   protected int salary;
   private MyDate date_hired;


    public Employee(String name, String address, String email, String phone, String office, int salary, MyDate date_hired) {
        super(name, address, email, phone);
        this.office=office;
        this.salary=salary;
        this.date_hired=date_hired;
    }
    public void setOffice(String office)
    {
        this.office=office;
    }
    public String getOffice()
    {
        return this.office;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public int getSalary()
    {
        return this.salary;
    }
    public void setDate(MyDate date_hired)
    {
        this.date_hired=date_hired;
    }
    public MyDate getDate()
    {
        return this.date_hired;
    }
    @Override
    public String toString() {
        return "Name of this person is "+ this.getName() + " and the class name is " +  getClass().getName();
    }
}
