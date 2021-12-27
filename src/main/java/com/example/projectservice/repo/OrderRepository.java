package com.example.projectservice.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectservice.model.Customer;
import com.example.projectservice.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {


  List<Orders> findAllByCustomer(Customer customer);

}
