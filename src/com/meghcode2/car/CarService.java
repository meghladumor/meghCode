package com.meghcode2.car;

public class CarService {
    private CarDAO carDAO;
    public CarService() {
        this.carDAO = new CarDAO();
    }


    public int registerNewCar(Car car){
        // check if car is not null
        // chekc if register number is not valid
        // chekc if the reg number is not taken
        // if price is less than zero throw an exception
        carDAO.saveCar(car);
        return 1;
    }

    public Car[] getCars(){
        return carDAO.selectAllCars();
    }



}
