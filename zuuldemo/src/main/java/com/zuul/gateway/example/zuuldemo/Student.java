package com.zuul.gateway.example.zuuldemo;

import java.io.Serializable;

public class Student implements Serializable
{
	
	
    String name;
    String address;
    String cls;
    
    public Student(){
    	System.out.println("Default constructor");
    }
 
    public Student(String name, String address, String cls) {
        super();
        this.name = name;
        this.address = address;
        this.cls = cls;
    }
 
    public String getName() {
        return name;
    }
 
    public String getAddress() {
        return address;
    }
 
    public String getCls() {
        return cls;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", cls=" + cls + "]";
	}
    
    
}
