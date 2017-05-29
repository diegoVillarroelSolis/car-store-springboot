package com.dh.project.demo.service;

import com.dh.project.demo.repository.RoomRepository;
import com.dh.project.demo.domain.Room;
import com.dh.project.demo.web.RoomController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Cristhian on 25/05/2017.
 */
@Service
public class RoomService {
    @Autowired
    RoomRepository roomRepository;

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public void addRoom(RoomController.RequestRoomDTO newRoomDTO) {
        Room newRoomDB = new Room();
        newRoomDB.setName(newRoomDTO.getName());
        newRoomDB.setCapacity(newRoomDTO.getCapacity());
        roomRepository.save(newRoomDB);
    }

    public Room getRoomByID(Long id) {
        return roomRepository.findOne(id);
    }

    public void updateRoom(Long id, RoomController.RequestRoomDTO updatedRoomDTO) {
        Room room = roomRepository.findOne(id);
        room.setName(updatedRoomDTO.getName());
        room.setCapacity(updatedRoomDTO.getCapacity());
        roomRepository.save(room);
    }

    public void deleteRoom(Long id) {
        roomRepository.delete(id);
    }
}
