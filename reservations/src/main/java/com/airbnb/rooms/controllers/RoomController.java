package com.airbnb.rooms.controllers;

import com.airbnb.rooms.dao.RoomDao;
import com.airbnb.rooms.model.Room;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/rooms")
public class RoomController {
    private RoomDao roomDao;

    public RoomController() {
        this.roomDao = new RoomDao();
    }

    @GetMapping
    public List<Room> list() {
        return roomDao.list();
    }

    @GetMapping(path = "/{number}")
    public Room get(@PathVariable int number) {
        return roomDao.get(number);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Room add(@RequestBody Room room) {
        return roomDao.create(room);
    }

    @PutMapping(path = "/{number}")
    public Room update(@RequestBody Room room, @PathVariable int number) {
        return roomDao.update(room, number);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/{number}")
    public void delete(@PathVariable int number) {
        roomDao.delete(number);
    }

    @GetMapping(path = "/reserved")
    public List<Room> filterByReservation() {
        List<Room> filteredRooms = new ArrayList<>();
        List<Room> rooms = list();

        for(Room room : rooms) {
            if(room.isReserved()) {
                filteredRooms.add(room);
            }
        }

        return filteredRooms;
    }
}
