package org.patterns.methodfactorypattern;

import java.util.ArrayList;

/**
 * Created by Andreea Draghici on 15.03.2023
 * Name of project: CreationalPatterns
 */
public class HardCandy_CandyCane extends Candy {

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {                              
        
        ArrayList hardCandyPackage = new ArrayList<>();                                  
 
        for(int i = 1; i <= quantity; i++) {
            HardCandy_CandyCane candyCane = new HardCandy_CandyCane();
            hardCandyPackage.add(candyCane);
        }

        System.out.println(quantity / 10 + " packages of 10 candy canes have been made!");         
        return hardCandyPackage;

    }

}
