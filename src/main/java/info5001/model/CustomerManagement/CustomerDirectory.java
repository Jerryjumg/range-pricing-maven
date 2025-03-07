/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.model.CustomerManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.github.javafaker.Faker;
import info5001.model.Business.Business;
import info5001.model.OrderManagement.Order;
import info5001.model.Personnel.Person;
import info5001.model.ProductManagement.Product;

/**
 *
 * @author kal bugrara
 * @param <Item>
 */
public class CustomerDirectory<Item> {

    Business business;
    ArrayList<CustomerProfile> customerlist;

    public CustomerDirectory(Business d) {

        business = d;
        customerlist = new ArrayList();

    }

    public CustomerProfile newCustomerProfile(Person p) {

        CustomerProfile sp = new CustomerProfile(p);
        customerlist.add(sp);
        return sp;
    }
  

    public CustomerProfile findCustomer(String id) {

        for (CustomerProfile sp : customerlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
        public CustomersReport generatCustomerPerformanceReport(){
        CustomersReport customersreport = new CustomersReport();
    
        for(CustomerProfile cp: customerlist){
            
            CustomerSummary cs = new CustomerSummary(cp);
            customersreport.addCustomerSummary(cs);
        }
        return customersreport; 
    }

    public CustomerProfile pickRandomCustomer(){
        if (customerlist.size() == 0) return null;
        Random r = new Random();
        int randomIndex = r.nextInt(customerlist.size());
        return customerlist.get(randomIndex);
    }




    public void printShortInfo(){
        System.out.println("Checking what's inside the Customer directory.");
        System.out.println("There are " + customerlist.size() + " customers.");
    }

    public List<CustomerProfile> getCustomerList() {
        return null;
    }

    public static CustomerProfile newCustomerProfile(String customerName) {
        return null;
    }
}
