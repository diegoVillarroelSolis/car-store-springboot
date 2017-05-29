package com.dh.project.demo.repository;

import com.dh.project.demo.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Cristhian on 26/05/2017.
 */
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
