package com.airbnb.rooms.dao;

import com.airbnb.rooms.model.Room;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

public class RoomDao {
    private List<Room> rooms = new ArrayList<>();

    public RoomDao() {
        if (rooms.size() == 0) {
            setRooms();
        }
    }

    public Room get(int roomNumber) {
        for(Room room : rooms) {
            if(room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    public List<Room> list() {
        return rooms;
    }

    public Room create(Room room) {
        rooms.add(room);
        return room;
    }

    public void delete(int roomNumber) {
        for(Room room : rooms) {
            if(room.getRoomNumber() == roomNumber) {
                rooms.remove(room);
            }
        }
    }

    public Room update(Room room, int roomNumber) {
        for(int i = 0; i < rooms.size(); i++) {
            if(rooms.get(i).getRoomNumber() ==  roomNumber) {
                rooms.set(i, room);
                return rooms.get(i);
            }
        }
        return null;
    }

    private void setRooms() {
        rooms.add(new Room(101, 1, 100, false));
        rooms.add(new Room(102, 1, 100, true));
        rooms.add(new Room(103, 1, 100, true));
        rooms.add(new Room(104, 1, 100, false));
        rooms.add(new Room(105, 1, 100, true));
        rooms.add(new Room(106, 2, 200, true));
        rooms.add(new Room(107, 2, 200, false));
        rooms.add(new Room(108, 2, 200, false));
        rooms.add(new Room(109, 2, 200, true));
        rooms.add(new Room(110, 2, 200, true));
        rooms.add(new Room(111, 3, 350, false));
        rooms.add(new Room(112, 3, 350, true));
        rooms.add(new Room(113, 3, 350, false));
        rooms.add(new Room(114, 3, 350, false));
        rooms.add(new Room(115, 3, 350, false));
    }

}
