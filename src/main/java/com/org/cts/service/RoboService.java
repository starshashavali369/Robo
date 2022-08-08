package com.org.cts.service;

import com.org.cts.modelrobo.Robo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RoboService {
    public void createRoto( Robo robo);
    public  void updateRobo( Robo robo);
    public String deleteByIdRobo( Integer id);
    public List<Robo> getAllRobo();
}
