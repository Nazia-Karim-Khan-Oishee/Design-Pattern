package org.example;

public class Staff extends Employee{
private String title;
    public Staff(String name, String address, String email, String phone, String office,
                 int salary, MyDate date_hired, String title) {
        super(name, address, email, phone, office, salary, date_hired);
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Name of this person is "+ this.getName() + " and the class name is " +  getClass().getName();
    }
}
