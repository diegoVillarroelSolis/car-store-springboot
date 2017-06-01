package com.dh.project.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Cristhian on 30/05/2017.
 */
@Entity
public class Seller {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long ci;
    private int age;
    private int numCarsSold;

    public Seller() {
        numCarsSold=0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public int getNumCarsSold() {
        return numCarsSold;
    }

    public void setNumCarsSold(int numCarsSold) {
        this.numCarsSold = numCarsSold;
    }

    public void addCarSold(){
        setNumCarsSold(getNumCarsSold()+1);
    }

    public void removeCarSold() {
        if(numCarsSold>0)
            setNumCarsSold(getNumCarsSold()-1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seller seller = (Seller) o;

        if (age != seller.age) return false;
        if (numCarsSold != seller.numCarsSold) return false;
        if (id != null ? !id.equals(seller.id) : seller.id != null) return false;
        if (name != null ? !name.equals(seller.name) : seller.name != null) return false;
        return ci != null ? ci.equals(seller.ci) : seller.ci == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (ci != null ? ci.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + numCarsSold;
        return result;
    }
}
