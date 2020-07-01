package com.example.projectapp.Car;


import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

@Service
public class CarService {

    LinkedList<Car> cars = new LinkedList<>();

    public CarService(){initCars();}
    public LinkedList<Car> getCars(){return cars;}
    public LinkedList<Car> sortCarsDesc(){
            Collections.sort(cars, new Comparator<Car>() {
                @Override
                public int compare(Car o1, Car o2) {
                    return  o2.getYearOfRelease() - o1.getYearOfRelease();
                }
            });
        return cars;
    }
    public LinkedList<Car> sortCarMileageAsc(){
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getMileageOfCar() - o2.getMileageOfCar();
            }
        });
        return cars;
    }
    public LinkedList<Car> shuffleCarList(){
        Collections.shuffle(cars);
        return cars;
    }

    private void initCars() {
        cars.add(new Car("Audi","A5","Sedan",2014,113590));
        cars.add(new Car("BMW","E92","Coupe",2009,
                111000));
        cars.add(new Car("Audi","A7","Sedan",2013,98758));
        cars.add(new Car("Mercedes","C63","Combi",2008,184232));
        cars.add(new Car("Skoda","Superb","Sedan",2018,45323));
        cars.add(new Car("Porshe","Panamera","Sedan",2014,106321));

    }


}
