/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.model.MarketingManagement;

import java.util.ArrayList;

import info5001.model.Business.Business;
import info5001.model.Personnel.Person;

/**
 *
 * @author kal bugrara
 */
public class MarketingPersonDirectory {

    Business business;
    ArrayList<MarketingPersonProfile> marketingpersonlist;

    public MarketingPersonDirectory(Business d) {

        business = d;
        marketingpersonlist = new ArrayList();

    }

    public MarketingPersonProfile newMarketingPersonProfile(Person p) {

        MarketingPersonProfile sp = new MarketingPersonProfile(p);
        marketingpersonlist.add(sp);
        return sp;
    }

    public MarketingPersonProfile findMarketingPerson(String id) {

        for (MarketingPersonProfile sp : marketingpersonlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }

}
