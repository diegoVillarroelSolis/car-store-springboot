package com.dh.project.demo.web;

import com.dh.project.demo.domain.Seller;
import com.dh.project.demo.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Cristhian on 26/05/2017.
 */
@RestController
@RequestMapping("sellers")
public class SellerController {
    @Autowired
    private SellerService sellerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Seller> getAllSellers(){
        return sellerService.getAllSellers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createSeller(@RequestBody RequestSellerDTO newSeller){
        sellerService.addSeller(newSeller);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateSeller(@PathVariable Long id, @RequestBody RequestSellerDTO updatedSeller){
        sellerService.updateSeller(id, updatedSeller);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{id}")
    public void update(@PathVariable Long id, @RequestBody RequestSellerDTO updatedSeller){
        sellerService.updateSeller(id, updatedSeller);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteSeller(@PathVariable Long id){
        sellerService.deleteSeller(id);
    }

    public static class RequestSellerDTO{
        private String name;
        private Long ci;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getCi() {
            return ci;
        }

        public void setCi(Long ci) {
            this.ci = ci;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}

