
package org.patterns.abstractfactorypattern;

/**
 * Created by Andreea Draghici on 15.03.2023
 * Name of project: CreationalPatterns
 */
public abstract class BikeFactory {           
    
    abstract BikePart create(String type);
    
}
