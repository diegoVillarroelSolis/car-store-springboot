package com.dh.project.demo.service;

import com.dh.project.demo.domain.Buyer;
import com.dh.project.demo.domain.Car;
import com.dh.project.demo.domain.RegistryCarSold;
import com.dh.project.demo.domain.Seller;
import com.dh.project.demo.repository.BuyerRepository;
import com.dh.project.demo.repository.CarRepository;
import com.dh.project.demo.repository.RegistryCarSoldRepository;
import com.dh.project.demo.repository.SellerRepository;
import com.dh.project.demo.web.RegistryCarSoldController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Cristhian on 26/05/2017.
 */
@Service
public class RegistryCarSoldService {
    @Autowired
    private RegistryCarSoldRepository RegistryCarSoldRepository;
    @Autowired
    private BuyerRepository buyerRepository;
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private SellerRepository sellerRepository;

    public List<RegistryCarSold> getAllRegistryCarSolds(){
        return RegistryCarSoldRepository.findAll();
    }

    public void addRegistryCarSold(RegistryCarSoldController.RequestRegistryCarSoldDTO newRegistryCarSoldDTO){
        RegistryCarSold newRegistryCarSoldDB = new RegistryCarSold();

        Buyer newBuyer = buyerRepository.findOne(newRegistryCarSoldDTO.getBuyerId());
        Car newCar = carRepository.findOne(newRegistryCarSoldDTO.getCarId());
        Seller newSeller = sellerRepository.findOne(newRegistryCarSoldDTO.getSellerId());
        newSeller.addCarSold();

        newRegistryCarSoldDB.setDateOfSell(newRegistryCarSoldDTO.getDateOfSell());
        newRegistryCarSoldDB.setBuyer(newBuyer);
        newRegistryCarSoldDB.setCar(newCar);
        newRegistryCarSoldDB.setSeller(newSeller);

        RegistryCarSoldRepository.save(newRegistryCarSoldDB);
    }

    public void updateRegistryCarSold(Long id, RegistryCarSoldController.RequestRegistryCarSoldDTO updatedRegistryCarSoldDTO) {
        RegistryCarSold updatedRegistryCarSoldDB = RegistryCarSoldRepository.findOne(id);

        Seller updatedSeller = sellerRepository.findOne(updatedRegistryCarSoldDTO.getSellerId());
        Seller currentSeller = updatedRegistryCarSoldDB.getSeller();

        if(!currentSeller.equals(updatedSeller)) {
            currentSeller.removeCarSold();
            updatedSeller.addCarSold();
            updatedRegistryCarSoldDB.setSeller(updatedSeller);
        }

        Buyer updatedBuyer = buyerRepository.findOne(updatedRegistryCarSoldDTO.getBuyerId());
        Car updatedCar = carRepository.findOne(updatedRegistryCarSoldDTO.getCarId());

        updatedRegistryCarSoldDB.setDateOfSell(updatedRegistryCarSoldDTO.getDateOfSell());
        updatedRegistryCarSoldDB.setBuyer(updatedBuyer);
        updatedRegistryCarSoldDB.setCar(updatedCar);

        RegistryCarSoldRepository.save(updatedRegistryCarSoldDB);
    }

    public void deleteRegistryCarSold(Long id) {
        Seller seller = RegistryCarSoldRepository.findOne(id).getSeller();
        seller.removeCarSold();
        RegistryCarSoldRepository.delete(id);
    }
}


