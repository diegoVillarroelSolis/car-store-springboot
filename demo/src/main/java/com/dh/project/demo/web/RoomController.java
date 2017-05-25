package com.dh.project.demo.web;

import com.dh.project.demo.domain.Room;
import com.dh.project.demo.service.RoomService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Cristhian on 25/05/2017.
 */
@RestController
@RequestMapping("/rooms")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class RoomController {
    @Autowired
    RoomService roomService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createRoom(@RequestBody RequestRoomDTO newRoom){
        roomService.addRoom(newRoom);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Room getRoomById(@PathVariable String id){
        return roomService.getRoomByID(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateRoom(@PathVariable String id, @RequestBody RequestRoomDTO updatedRoomDTO){
        roomService.updateRoom(id, updatedRoomDTO);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{id}")
    public void update(@PathVariable String id, @RequestBody RequestRoomDTO updatedRoomDTO){
        roomService.updateRoom(id, updatedRoomDTO);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteRoom(@PathVariable String id){
        roomService.deleteRoom(id);
    }

    public static class RequestRoomDTO{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
