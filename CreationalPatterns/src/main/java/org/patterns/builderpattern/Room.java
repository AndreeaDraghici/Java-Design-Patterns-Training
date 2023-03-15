package org.patterns.builderpattern;

import java.awt.*;

/**
 * Created by Andreea Draghici on 15.03.2023
 * Name of project: CreationalPatterns
 */
public class Room {
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;


    public Room(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors) {
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
    }

    public Dimension getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
    }

    public int getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Color getWallColor() {
        return wallColor;
    }

    public void setWallColor(Color wallColor) {
        this.wallColor = wallColor;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
