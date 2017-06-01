package com.dh.project.demo.web;

import com.dh.project.demo.domain.Buyer;
import com.dh.project.demo.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Cristhian on 26/05/2017.
 */
@RestController
@RequestMapping("buyers")
public class BuyerController {
    @Autowired
    private BuyerService buyerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Buyer> getAllBuyers(){
        return buyerService.getAllBuyers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createBuyer(@RequestBody RequestBuyerDTO newBuyer){
        buyerService.addBuyer(newBuyer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateBuyer(@PathVariable Long id, @RequestBody RequestBuyerDTO updatedBuyer){
        buyerService.updateBuyer(id, updatedBuyer);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{id}")
    public void update(@PathVariable Long id, @RequestBody RequestBuyerDTO updatedBuyer){
        buyerService.updateBuyer(id, updatedBuyer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteBuyer(@PathVariable Long id){
        buyerService.deleteBuyer(id);
    }

    public static class RequestBuyerDTO{
        private String name;
        private Long ci;
        private String profession;
        private int cel;

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

        public String getProfession() {
            return profession;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }

        public int getCel() {
            return cel;
        }

        public void setCel(int cel) {
            this.cel = cel;
        }
    }
}

