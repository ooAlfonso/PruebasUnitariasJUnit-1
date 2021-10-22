package com.Generation.Drive;

public class Driver {

    //atributos privados
    private final String name;

    private final String id;

    private final double fee;

    private double balance;

    private boolean isAvailable = false;

    //constructor
    public Driver( String name, String id, double fee )
    {
        this.name = name;
        this.id = id;
        this.fee = fee;
    }


    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public double getFee()
    {
        return fee;
    }

    //método get
    public double getBalance()
    {
        return balance;
    }

    public boolean isAvailable()
    {
        return isAvailable;
    }

    public void startTrip()
    {
        isAvailable = false;
    }

    public void endTrip()
    {
        isAvailable = true;
        balance += balance;
    }
}
