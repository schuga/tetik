package com.tetikbackend.controller;

import com.tetikbackend.tetik.Manufacturer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by suior on 16.02.2018.
 */

@RestController
public class Controller {

    private JPATetik reposytory;

    public Controller( JPATetik reposytory ) {
        this.reposytory = reposytory;
    }

    @GetMapping("/manufacturers")
    public List<Manufacturer> getAll() {
        return reposytory.findAll();
    }

}
