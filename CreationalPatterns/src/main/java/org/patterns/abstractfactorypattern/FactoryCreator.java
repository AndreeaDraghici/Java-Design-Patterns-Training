
package org.patterns.abstractfactorypattern;

/**
 * Created by Andreea Draghici on 15.03.2023
 * Name of project: CreationalPatterns
 */
public class FactoryCreator {
    
    public static BikeFactory createFactory(String type) {
        
        if(type.equalsIgnoreCase("mountain bike")) {
            return new MountainBikeFactory();
        } else if(type.equalsIgnoreCase("road bike")) {
            return new RoadBikeFactory();
        } else {
            System.out.println("Please specify a valid type");
            return null;
        }
        
    }
    
}
