package com.dh.project.demo.Repository;

import com.dh.project.demo.domain.Subscription;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Cristhian on 24/05/2017.
 */
public interface SubscriptionRepository extends MongoRepository<Subscription, String>{

}
