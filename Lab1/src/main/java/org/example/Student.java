package org.example;

public class Student extends Person{
    private String status;
    public Student(String name, String address, String email, String phone, String status) {
        super(name, address, email, phone);
        this.status=status;
    }

    public void setStatus(String status)
    {
        this.status=status;
    }
    public String getStatus()
    {
        return this.status;
    }
    @Override
    public String toString() {
        return "Name of this person is "+ this.getName() + " and the class name is " +  getClass().getName();
    }
}
