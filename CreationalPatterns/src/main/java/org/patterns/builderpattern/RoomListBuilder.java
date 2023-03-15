package org.patterns.builderpattern;

import java.util.ArrayList;

/**
 * Created by Andreea Draghici on 15.03.2023
 * Name of project: CreationalPatterns
 */
public class RoomListBuilder {
    private ArrayList listOfRooms;

    public RoomListBuilder addList() {
        this.listOfRooms = new ArrayList();
        return this;
    }

    public RoomListBuilder addRoom(Room room){
        listOfRooms.add(room);
        return this;
    }

    public RoomBuilder addRoom() {
        return new RoomBuilder(this);
    }

    public ArrayList buildList(){
        return listOfRooms;
    }

}
