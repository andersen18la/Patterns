/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carDecorator;

/**
 *
 * @author Lasse Andersen
 */
public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car c) {
        //This c of the Car Interface will be set as the protected car object. 
        this.car = c;
    }
     
    @Override
    public void assemble() {
        //this car.assemple comes from the Car Interface
        this.car.assemble();
    }
    
}
