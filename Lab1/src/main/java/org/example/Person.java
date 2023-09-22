package org.example;

public class Person {
   private String name;
    private String address;
    private String  email;
    private String phone;

    public Person(String name, String address, String email, String phone){
        this.name=name;
        this.address=address;
        this .email=email;
        this.phone=phone;
    }

public void setName(String name)
{
    this.name=name;
}
public String getName()
{
        return this.name;
}
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getAddress()
    {
        return this.address;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return this.email;
    }

    public void setPhone(String phone)
    {
        this.email=email;
    }
    public String getPhone()
    {
        return this.phone;
    }
    @Override
    public String toString() {
        return "Name of this person is "+ this.name+ " and the class name is " +  getClass().getName();
    }
}


