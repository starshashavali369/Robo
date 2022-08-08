package com.org.cts.controller;

import com.org.cts.modelrobo.Robo;
import com.org.cts.service.RoboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoboController {
    @Autowired
    RoboService roboService;
    @PostMapping("/create")
    public void createRoto(@RequestBody Robo robo){
        roboService.createRoto(robo);
    }
    @PutMapping("/update")
    public  void updateRobo(@RequestBody Robo robo){
        roboService.updateRobo(robo);
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteByIdRobo(@PathVariable Integer id){
        String ss=roboService.deleteByIdRobo(id);
        return ss;
    }
   @GetMapping("/getAll")
public List<Robo>getAllRobo(){
        List<Robo>ss=roboService.getAllRobo();
        return  ss;
    }

}