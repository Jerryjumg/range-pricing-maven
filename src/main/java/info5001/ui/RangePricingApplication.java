/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;

import info5001.model.Business.Business;
import info5001.model.Business.ConfigureABusiness;
import info5001.model.CustomerManagement.CustomerDirectory;
import info5001.model.CustomerManagement.CustomerProfile;
import info5001.model.CustomerManagement.CustomerProfile.CustomerProfileClass;
import info5001.model.OrderManagement.Order;
import info5001.model.Personnel.Person;
import info5001.model.ProductManagement.Product;
import info5001.model.ProductManagement.ProductCatalog;
import info5001.model.ProductManagement.ProductsReport;
import info5001.model.Supplier.Supplier;
import info5001.model.Supplier.SupplierDirectory;


/**
 *
 * @author kal bugrara
 */
public class RangePricingApplication {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    // Random numbers

    // Random randomInstance = new Random();

    // System.out.println(" Random Numbers: ");
    
    // ArrayList<Integer> randomIntegers = new ArrayList<Integer>();
    // int totalNumberOfRandomNumbers = 100;
    // int counter = 0;

    // while (counter < totalNumberOfRandomNumbers) {
    //   int randomInt = randomInstance.nextInt(100);
    //   if (!randomIntegers.contains(randomInt)) {
    //     randomIntegers.add(randomInt);
    //     counter++; // increment counter only if the number is not already in the list
    //   }
    // }

    // for (Integer integer : randomIntegers) {
    //   System.out.println(integer);
    // }

    // System.out.println("We picked "+ randomIntegers.size() + " unique random numbers from 0 to 100.");

    // // Data that is not number (e.g. names, addresses, etc.)

    // Faker fakerInstance = new Faker();

    // System.out.println(" Customer list: ");
    // for (int i = 0; i < 200; i++) {

    // String fullName = fakerInstance.name().fullName();
    // String address = fakerInstance.address().fullAddress();

    // System.out.println(fullName);
    // System.out.println(address);
    // System.out.println("-----------------");
    // }

    // System.out.println(" Supplier list: ");
    // for (int i = 0; i < 200; i++) {

    // String companyName = fakerInstance.company().name();

    // System.out.println(companyName);
    // System.out.println("-----------------");
    // }

    Business business =
    ConfigureABusiness.createABusinessAndLoadALotOfData("Amazon", 30, 10, 50,
    100, 10);
    business.printShortInfo();
    
    System.out.println("List of suppliers: ");
    List<Supplier> suppliers = new ArrayList<>();
    
    //input 30 suppliers
    // Supplier supplier1 = new Supplier("Apple");
    // System.out.println("Supplier 1: " + supplier1.getName());

    // Supplier supplier2 = new Supplier("Samsung");
    // System.out.println("Supplier 2: " + supplier2.getName());

    // Supplier supplier3 = new Supplier("Google");
    // System.out.println("Supplier 3: " + supplier3.getName());

    // Supplier supplier4 = new Supplier("Microsoft");
    // System.out.println("Supplier 4: " + supplier4.getName());

    // Supplier supplier5 = new Supplier("Sony");
    // System.out.println("Supplier 5: " + supplier5.getName());

    // Supplier supplier6 = new Supplier("LG");
    // System.out.println("Supplier 6: " + supplier6.getName());

    // Supplier supplier7 = new Supplier("Lenovo");
    // System.out.println("Supplier 7: " + supplier7.getName());

    // Supplier supplier8 = new Supplier("HP");
    // System.out.println("Supplier 8: " + supplier8.getName());

    // Supplier supplier9 = new Supplier("Dell");
    // System.out.println("Supplier 9: " + supplier9.getName());

    // Supplier supplier10 = new Supplier("Asus");
    // System.out.println("Supplier 10: " + supplier10.getName());

    // Supplier supplier11 = new Supplier("Acer");
    // System.out.println("Supplier 11: " + supplier11.getName());

    // Supplier supplier12 = new Supplier("Razer");
    // System.out.println("Supplier 12: " + supplier12.getName());

    // Supplier supplier13 = new Supplier("MSI");
    // System.out.println("Supplier 13: " + supplier13.getName());

    // Supplier supplier14 = new Supplier("Alienware");
    // System.out.println("Supplier 14: " + supplier14.getName());

    // Supplier supplier15 = new Supplier("Intel");
    // System.out.println("Supplier 15: " + supplier15.getName());
    
    
    List<Product> products = new ArrayList<>();
    Faker faker = new Faker();
    for (int i = 0; i < 20; i++) {
      String productName = faker.commerce().productName();
      Product product = new Product(productName, i, i, i);
      products.add(product);
      System.out.println(productName);
  }
    

  //java faker for company 
    for (int i = 0; i < 30; i++) {
        String companyName = faker.company().name();
        Supplier supplier = new Supplier(companyName);
        suppliers.add(supplier);
        System.out.println((i + 1) + ". " +companyName);
        System.out.println("----------------------");
    
        for (int j = 0; j < 20; j++) {
          String productName = faker.commerce().productName();
          System.out.println("Product " + (j + 1)+ ": " +productName); 
      }
  
      System.out.println("----------------------");
  }

   //java faker for customer
    List<CustomerProfile> customers = new ArrayList<>();
    for (int i = 0; i < 50; i++) {
      String customerName = faker.name().fullName();
      CustomerProfile customer = CustomerDirectory.newCustomerProfile(customerName);
      customers.add(customer);
      System.out.println((i + 1) + ". " + customerName);
    }

   
    
    // List<Product> product = new ArrayList<>();
    // for (int i = 0; i < 20; i++) {
    //   String productName = faker.commerce().productName();
    //   Product product = new Product(productName, i, i, i);
    //   products.add(product);
    //   System.out.println(productName);
    // }

      
    }


  }

    

// questiom:
// how to use pickRandomSupplier, since i literally have 30 suppliers all have 20 products, not randomly pick 20 and assign them 

