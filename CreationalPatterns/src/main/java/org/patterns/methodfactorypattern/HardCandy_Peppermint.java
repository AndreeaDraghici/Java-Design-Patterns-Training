
package org.patterns.methodfactorypattern;

import java.util.ArrayList;

/**
 * Created by Andreea Draghici on 15.03.2023
 * Name of project: CreationalPatterns
 */
public class HardCandy_Peppermint extends Candy {
    
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList<>();
        for(int i = 1; i <= quantity; i++) {
            HardCandy_Peppermint hardCandy_Peppermint = new HardCandy_Peppermint(); 
            hardCandyPackage.add(hardCandy_Peppermint);
        }
        
        System.out.println("One package of " + quantity + " peppermints has been made!");
        return hardCandyPackage;
        
    }    
}
