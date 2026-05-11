package com.Yarragunta.Dinesh.Kumar.Reddy.myapp.repository;

import com.Yarragunta.Dinesh.Kumar.Reddy.myapp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
