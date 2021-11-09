package com.winningwoman.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winningwoman.market.model.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {
	
}
