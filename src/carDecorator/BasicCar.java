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
public class BasicCar implements Car{

    @Override
    public void assemble() {
        System.out.println("This is a Basic CAR");
    }
    
}
