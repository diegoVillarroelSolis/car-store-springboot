package com.dh.project.demo.web;

import com.dh.project.demo.domain.Car;
import com.dh.project.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Cristhian on 26/05/2017.
 */
@RestController
@RequestMapping("cars")
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createCar(@RequestBody RequestCarDTO newCar){
        carService.addCar(newCar);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateCar(@PathVariable Long id, @RequestBody RequestCarDTO updatedCar){
        carService.updateCar(id, updatedCar);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{id}")
    public void update(@PathVariable Long id, @RequestBody RequestCarDTO updatedCar){
        carService.updateCar(id, updatedCar);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteCar(@PathVariable Long id){
        carService.deleteCar(id);
    }

    public static class RequestCarDTO{
        private String brand;
        private int year;
        private String model;
        private String color;
        private String image;

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}

