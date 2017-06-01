package com.dh.project.demo.service;

import com.dh.project.demo.domain.Car;
import com.dh.project.demo.repository.CarRepository;
import com.dh.project.demo.web.CarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Cristhian on 26/05/2017.
 */
@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    public void addCar(CarController.RequestCarDTO newCarDTO){
        Car newCarDB = new Car();
        newCarDB.setBrand(newCarDTO.getBrand());
        newCarDB.setYear(newCarDTO.getYear());
        newCarDB.setModel(newCarDTO.getModel());
        newCarDB.setColor(newCarDTO.getColor());
        newCarDB.setImage(newCarDTO.getImage());
        carRepository.save(newCarDB);
    }

    public void updateCar(Long id, CarController.RequestCarDTO updatedCarDTO) {
        Car updatedCarDB = carRepository.findOne(id);
        updatedCarDB.setBrand(updatedCarDTO.getBrand());
        updatedCarDB.setYear(updatedCarDTO.getYear());
        updatedCarDB.setModel(updatedCarDTO.getModel());
        updatedCarDB.setColor(updatedCarDTO.getColor());
        updatedCarDB.setImage(updatedCarDTO.getImage());
        carRepository.save(updatedCarDB);
    }

    public void deleteCar(Long id) {
        carRepository.delete(id);
    }
}

