/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.ui;

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

    Business business = ConfigureABusiness.createABusinessAndLoadALotOfData("Amazon", 20, 10, 30, 100, 10);
    business.printShortInfo();

  }


}
