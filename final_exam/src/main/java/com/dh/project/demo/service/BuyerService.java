package com.dh.project.demo.service;

import com.dh.project.demo.domain.Buyer;
import com.dh.project.demo.repository.BuyerRepository;
import com.dh.project.demo.web.BuyerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Cristhian on 26/05/2017.
 */
@Service
public class BuyerService {
    @Autowired
    private BuyerRepository buyerRepository;

    public List<Buyer> getAllBuyers(){
        return buyerRepository.findAll();
    }

    public void addBuyer(BuyerController.RequestBuyerDTO newBuyerDTO){
        Buyer newBuyerDB = new Buyer();
        newBuyerDB.setName(newBuyerDTO.getName());
        newBuyerDB.setCi(newBuyerDTO.getCi());
        newBuyerDB.setProfession(newBuyerDTO.getProfession());
        newBuyerDB.setCel(newBuyerDTO.getCel());
        buyerRepository.save(newBuyerDB);
    }

    public void updateBuyer(Long id, BuyerController.RequestBuyerDTO updatedBuyerDTO) {
        Buyer updatedBuyerDB = buyerRepository.findOne(id);
        updatedBuyerDB.setCi(updatedBuyerDTO.getCi());
        updatedBuyerDB.setName(updatedBuyerDTO.getName());
        updatedBuyerDB.setProfession(updatedBuyerDTO.getProfession());
        updatedBuyerDB.setCel(updatedBuyerDTO.getCel());
        buyerRepository.save(updatedBuyerDB);
    }

    public void deleteBuyer(Long id) {
        buyerRepository.delete(id);
    }
}

