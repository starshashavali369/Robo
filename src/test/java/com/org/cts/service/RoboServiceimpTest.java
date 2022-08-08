package com.org.cts.service;

import com.org.cts.modelrobo.Robo;
import com.org.cts.repositary.RoboRopo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RoboServiceimpTest {
    @InjectMocks
    private  RoboServiceimp roboServiceimp;
    @Mock
    private RoboRopo roboRopo;
    @Test
    void createRoto() {
        Robo robo=new Robo();
        robo.setId(100);
        robo.setAddress("Blr");
        robo.setExpenditure(10000);
        roboServiceimp.createRoto(robo);
        Mockito.verify(roboRopo,Mockito.times(1)).save(robo);
    }
    @Test
    void updateRobo() {
        Robo robo=new Robo();
        robo.setId(106);
        robo.setAddress("blr");
        robo.setExpenditure(243567);
        roboServiceimp.updateRobo(robo);
        Mockito.verify(roboRopo,Mockito.times(1)).save(robo);
    }
    @Test
    void deleteByIdRobo() {
        int id=1008;
        String s="success";
        String h=roboServiceimp.deleteByIdRobo(id);
        Mockito.verify(roboRopo,Mockito.times(1)).deleteById(id);
        Assertions.assertEquals(s,h);
    }
    @Test
    void getAllRobo() {
        Robo robo=new Robo();
        robo.setId(187);
        robo.setExpenditure(75576768);
        robo.setName("Sha");
        Robo robo1=new Robo();
        robo1.setName("Shasha");
        robo1.setId(184);
        robo1.setExpenditure(999998);
        List<Robo>list=new ArrayList<>();
        list.add(robo);
        list.add(robo);
        Mockito.when(roboRopo.findAll()).thenReturn(list);
        List<Robo>list1=roboServiceimp.getAllRobo();
        Assertions.assertEquals(list.size(),list1.size());
    }
}