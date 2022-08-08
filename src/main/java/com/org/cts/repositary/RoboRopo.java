package com.org.cts.repositary;

import com.org.cts.modelrobo.Robo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoboRopo extends JpaRepository<Robo,Integer> {
}
