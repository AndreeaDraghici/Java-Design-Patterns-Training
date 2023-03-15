
package org.patterns.abstractfactorypattern;

/**
 * Created by Andreea Draghici on 15.03.2023
 * Name of project: CreationalPatterns
 */
public class MountainBikeHandlebar extends Handlebar {
    
    private static String type = "FLAT";
    
    @Override
    public void getDescription() {
        System.out.println("Mountain bike handlebar. Type: " + type);
    }
    
}
