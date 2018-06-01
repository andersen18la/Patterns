/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaDecorator;

/**
 *
 * @author Lasse Andersen
 */
public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);


        System.out.println("Adding TomatoSauce");
    }

   

    @Override
    //Has access to the Description for the Pizza object
    public String getDescription()  {
        return tempPizza.getDescription() + ", Tomato Sauce";
    }

    @Override
    //Has access to the Cost for the Pizza object
    public double getCost() {
        return tempPizza.getCost() + .35;
    }
}
