/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.model.CustomerManagement;

import java.util.ArrayList;

import info5001.model.MarketModel.Market;
import info5001.model.OrderManagement.Order;
import info5001.model.Personnel.Person;

/**
 *
 * @author kal bugrara
 */
public class CustomerProfile {
    ArrayList<Order> orders;
    ArrayList<Market> markets;
    
    Person person;
    String customerName;
    String customerID;
    
    public CustomerProfile(Person p) {

        person = p;
        orders = new ArrayList();

    }
    


    // public CustomerProfile(String customerName2) {
    //     this.person = new Person(customerName);
    //     this.orders = new ArrayList<>();
    // }
           
    public int getTotalPricePerformance(){
        
 
        //for each order in the customer orderlist 
        //calculate order price performance and add it to the sum

        return 0;}
 
    public int    getNumberOfOrdersAboveTotalTarget(){
        //for each order in the customer order list 
        //calculate if order is positive (actual order total is greater than sum of item targets
        //if yes then add 1 to total 
        int sum = 0;
        for(Order o: orders){
            if(o.isOrderAboveTotalTarget()==true) sum = sum + 1;
        }
        
        return sum;}
    
    public int getNumberOfOrdersBelowTotalTarget(){return 0;}
         //for each order in the customer order list 
        //calculate if order is negative
        //if yes then add 1 to total 
        
    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
    public class CustomerProfileClass {
        ArrayList<Order> orders;
        ArrayList<Market> markets;
        
        Person person;
        String customerName;
        String customerID;
        
        public CustomerProfileClass(String customerName) {
            this.person = new Person(customerName);
            this.orders = new ArrayList<>();
        }

        public void addCustomerOrder(Order o){
            orders.add(o);
        }
        
        public String getCustomerId(){
            return person.getPersonId();
        }
        
        public String getPersonId(){
            return person.getPersonId();
        }
        
        public Person getPerson(){
            return person;
        }
        

        @Override
        public String toString(){
            return person.getPersonId();
        }
    }
    public void addCustomerOrder(Order order) {
    }



    public String getCustomerName() {
        return null;
    }
        
        
    
}
