package com.revature.bankapp_v1;

import java.io.*;

public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name ="noName";
    private transient int age = 0;

    public Customer() {}
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person [" + name + ", " + age + "]";
    }
}