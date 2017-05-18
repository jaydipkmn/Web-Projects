package com.application;


public class Student {  
public Student() {
    System.out.println("hello "+name);
    }

private String name;  
private Address address;
 
public Address getAddress() {
    return address;
}

public void setAddress(Address address) {
    this.address = address;
}

public String getName() {  
   return name;  
}  
 
public void setName(String name) {  
   this.name = name;  
}  
 
public void displayInfo(){  
   System.out.println("Hello: "+name + " "+ address.getCity());  
}  
}
