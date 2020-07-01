package com.example.projectapp.Car;

public class Car {
    private String nameOfCarBrand;
    private String nameOfCar;
    private String typeOfCar;
    private int yearOfRelease;
    private int mileageOfCar;

    public Car(String nameOfCarBrand,String nameOfCar,String typeOfCar, int yearOfRelease,int mileageOfCar){
        this.nameOfCarBrand = nameOfCarBrand;
        this.nameOfCar = nameOfCar;
        this.typeOfCar = typeOfCar;
        this.yearOfRelease = yearOfRelease;
        this.mileageOfCar = mileageOfCar;
    }

    public String getNameOfCarBrand(){return nameOfCarBrand;}

    public void setNameOfCarBrand(String nameOfCarBrand){this.nameOfCarBrand = nameOfCarBrand;}

    public String getNameOfCar(){return nameOfCar;}

    public void setNameOfCar(String nameOfCar){this.nameOfCar = nameOfCar;}

    public String getTypeOfCar(){return typeOfCar;}

    public void setTypeOfCar(String typeOfCar){this.typeOfCar= typeOfCar;}

    public int getYearOfRelease() { return yearOfRelease; }

    public void setYearOfRelease(int yearOfRelease){this.yearOfRelease=yearOfRelease;}

    public int getMileageOfCar(){return mileageOfCar;}

    public void setMileageOfCar(int mileageOfCar){this.mileageOfCar= mileageOfCar;}
}
