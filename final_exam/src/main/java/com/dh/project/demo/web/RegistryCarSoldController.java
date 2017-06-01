package com.dh.project.demo.web;

import com.dh.project.demo.domain.RegistryCarSold;
import com.dh.project.demo.service.RegistryCarSoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Cristhian on 26/05/2017.
 */
@RestController
@RequestMapping("registryCarSolds")
public class RegistryCarSoldController {
    @Autowired
    private RegistryCarSoldService registryCarSoldService;

    @RequestMapping(method = RequestMethod.GET)
    public List<RegistryCarSold> getAllRegistryCarSolds(){
        return registryCarSoldService.getAllRegistryCarSolds();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createRegistryCarSold(@RequestBody RequestRegistryCarSoldDTO newRegistryCarSold){
        registryCarSoldService.addRegistryCarSold(newRegistryCarSold);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateRegistryCarSold(@PathVariable Long id, @RequestBody RequestRegistryCarSoldDTO updatedRegistryCarSold){
        registryCarSoldService.updateRegistryCarSold(id, updatedRegistryCarSold);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{id}")
    public void update(@PathVariable Long id, @RequestBody RequestRegistryCarSoldDTO updatedRegistryCarSold){
        registryCarSoldService.updateRegistryCarSold(id, updatedRegistryCarSold);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteRegistryCarSold(@PathVariable Long id){
        registryCarSoldService.deleteRegistryCarSold(id);
    }

    public static class RequestRegistryCarSoldDTO{
        private Date dateOfSell;
        Long carId;
        Long sellerId;
        Long buyerId;

        public Date getDateOfSell() {
            return dateOfSell;
        }

        public void setDateOfSell(Date dateOfSell) {
            this.dateOfSell = dateOfSell;
        }

        public Long getCarId() {
            return carId;
        }

        public void setCarId(Long carId) {
            this.carId = carId;
        }

        public Long getSellerId() {
            return sellerId;
        }

        public void setSellerId(Long sellerId) {
            this.sellerId = sellerId;
        }

        public Long getBuyerId() {
            return buyerId;
        }

        public void setBuyerId(Long buyerId) {
            this.buyerId = buyerId;
        }
    }
}
