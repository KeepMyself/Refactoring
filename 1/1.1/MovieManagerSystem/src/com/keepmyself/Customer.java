package com.keepmyself;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by StudyForever on 2016/10/10.
 */
public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name){
        this._name = name;
    }

    public String get_name() {
        return _name;
    }

    public void addRental(Rental arg){
        this._rentals.addElement(arg);
    }

    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this._rentals.elements();
        String result = "Retenal Record for " + this.get_name() + "\n";

        return result;
    }
}
