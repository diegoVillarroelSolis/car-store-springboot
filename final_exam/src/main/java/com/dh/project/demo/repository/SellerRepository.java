package com.dh.project.demo.repository;

import com.dh.project.demo.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Cristhian on 30/05/2017.
 */
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
