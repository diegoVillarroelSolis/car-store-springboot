package com.dh.project.demo.service;

import com.dh.project.demo.domain.Seller;
import com.dh.project.demo.repository.SellerRepository;
import com.dh.project.demo.web.SellerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Cristhian on 26/05/2017.
 */
@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> getAllSellers(){
        return sellerRepository.findAll();
    }

    public void addSeller(SellerController.RequestSellerDTO newSellerDTO){
        Seller newSellerDB = new Seller();
        newSellerDB.setName(newSellerDTO.getName());
        newSellerDB.setCi(newSellerDTO.getCi());
        newSellerDB.setAge(newSellerDTO.getAge());
        sellerRepository.save(newSellerDB);
    }

    public void updateSeller(Long id, SellerController.RequestSellerDTO updatedSellerDTO) {
        Seller updatedSellerDB = sellerRepository.findOne(id);
        updatedSellerDB.setName(updatedSellerDTO.getName());
        updatedSellerDB.setCi(updatedSellerDTO.getCi());
        updatedSellerDB.setAge(updatedSellerDTO.getAge());
        sellerRepository.save(updatedSellerDB);
    }

    public void deleteSeller(Long id) {
        sellerRepository.delete(id);
    }
}

