
package org.patterns.methodfactorypattern;

import java.util.ArrayList;

/**
 * Created by Andreea Draghici on 15.03.2023
 * Name of project: CreationalPatterns
 */
public abstract class Candy {
        
    abstract ArrayList<Candy> makeCandyPackage(int quantity);
    
}
