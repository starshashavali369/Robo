package com.org.cts.service;

import com.org.cts.modelrobo.Robo;
import com.org.cts.repositary.RoboRopo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoboServiceimp implements RoboService{
    @Autowired
    RoboRopo roboRopo;

    @Override
    public void createRoto(Robo robo) {
        roboRopo.save(robo);
    }

    @Override
    public void updateRobo(Robo robo) {
        roboRopo.save(robo);
    }

    @Override
    public String deleteByIdRobo(Integer id) {
        roboRopo.deleteById(id);
        return "success";
    }

    @Override
    public List<Robo> getAllRobo() {
        List<Robo>t=roboRopo.findAll();
        return t;
    }
}
