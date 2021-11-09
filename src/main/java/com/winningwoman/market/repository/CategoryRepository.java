package com.winningwoman.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winningwoman.market.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
