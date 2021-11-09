package com.winningwoman.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winningwoman.market.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
