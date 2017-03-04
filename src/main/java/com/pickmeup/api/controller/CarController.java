package com.pickmeup.api.controller;

import com.pickmeup.api.model.Cars;
import com.pickmeup.api.Service.CarsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Govind on 12/22/2016.
 */
@RestController
@RequestMapping("/cars" )
public class CarController {

    @RequestMapping(value = "/registerCar", method = RequestMethod.GET)

    public Cars register(@RequestParam Map<String, String> params) {
        CarsService service = new CarsService();
        Cars car = service.registerCar(params);

        return car;
    }
}



