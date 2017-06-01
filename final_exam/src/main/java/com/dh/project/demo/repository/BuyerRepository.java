package com.dh.project.demo.repository;

import com.dh.project.demo.domain.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Cristhian on 30/05/2017.
 */
public interface BuyerRepository extends JpaRepository<Buyer, Long> {
}
