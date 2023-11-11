/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.model.Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.github.javafaker.Faker;
import info5001.model.ProductManagement.Product;

/**
 *
 * @author kal bugrara
 */
public class SupplierDirectory {
    ArrayList<Supplier> suppliers;
    public SupplierDirectory(){
        suppliers = new ArrayList();
    }
    public Supplier newSupplier(String n){
        Supplier supplier = new Supplier(n);
        suppliers.add(supplier);
        return supplier;

    }
    public Supplier findSupplier(String id){
        
        for (Supplier supplier: suppliers){
            
            if(supplier.getName().equals(id)) return supplier;
        }
        return null;
        }
    public ArrayList<Supplier> getSuplierList(){
        return suppliers;
    }

    // public Supplier pickRandomSupplier(){
    //     if (suppliers.size() == 0) return null;
    //     Random r = new Random();
    //     int randomIndex = r.nextInt(suppliers.size());
    //     return suppliers.get(randomIndex);
    // }


    
    // public List<Product> generateProducts(int count) {
    //         List<Product> products = new ArrayList<>();
    //         for (int i = 0; i < count; i++) {
    //             Faker faker = new Faker();
    //             String productName = faker.commerce().productName();
    //             Product product = new Product(productName, i, i, i);
    //             products.add(product);
    //             System.out.println("Product: " + productName);
    //         }
    //         return products;
    //     }


        public void printShortInfo(){
        System.out.println("Checking what's inside the supplier directory.");
        System.out.println("There are " + suppliers.size() + " suppliers.");
        for (Supplier s: suppliers){
            s.printShortInfo();
        }
    }
        public Supplier pickRandomSupplier() {
            return null;
        }

    
}