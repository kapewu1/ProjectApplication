package com.example.projectapp.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

@RestController
public class CarController {


    @Value("Projekt zaliczeniowy - projekt Spring")
    String nameOfApp;

    private CarService carService;

    @Autowired
    public CarController (CarService carService){this.carService = carService;}

    @RequestMapping("/")
    public String index(){return nameOfApp;}

    @GetMapping("/getCars")
    public LinkedList<Car> getCars(){ return carService.getCars();}
    @GetMapping("/sortCarsDesc")
    public LinkedList<Car> sortCarsDesc(){return carService.sortCarsDesc();}
    @GetMapping("/shuffleCarList")
    public LinkedList<Car> shuffleCarList(){return carService.shuffleCarList();}
    @GetMapping("/sortMileageAsc")
    public LinkedList<Car> sortCarMileageAsc(){return carService.sortCarMileageAsc();}
}
