package com.dh.project.demo.repository;

import com.dh.project.demo.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Cristhian on 25/05/2017.
 */
public interface RoomRepository extends JpaRepository<Room, Long> {
}
