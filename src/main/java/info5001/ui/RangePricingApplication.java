/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.ui;

import java.util.Random;

import com.github.javafaker.Faker;

import info5001.model.Business.Business;
import info5001.model.Business.ConfigureABusiness;
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

    Random randomInstance = new Random();

    System.out.println(" Random Numbers: ");

    for (int i = 0; i < 10; i++) {
      int randomInt = randomInstance.nextInt(100);
      // Random 10-15
      int randomIntInRange10to15 = randomInstance.nextInt(6) + 10;
      float randomFloat = randomInstance.nextFloat();
      System.out.println("Random integer: " + randomInt);
      System.out.println("Random float: " + randomFloat);
    }

    // Data that is not number (e.g. names, addresses, etc.)

    Faker fakerInstance = new Faker();

    System.out.println(" Customer list: ");
    for (int i = 0; i < 200; i++) {

      String fullName = fakerInstance.name().fullName();
      String address = fakerInstance.address().fullAddress();

      System.out.println(fullName);
      System.out.println(address);
      System.out.println("-----------------");
    }

    System.out.println(" Supplier list: ");
    for (int i = 0; i < 200; i++) {

      String companyName = fakerInstance.company().name();

      System.out.println(companyName);
      System.out.println("-----------------");
    }

    // Business business =
    // ConfigureABusiness.createABusinessAndLoadALotOfData("Amazon", 20, 10, 30,
    // 100, 10);
    // business.printShortInfo();

  }

}
