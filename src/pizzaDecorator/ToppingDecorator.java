package pizzaDecorator;

/**
 *
 * @author Lasse Andersen
 */
public class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza) {

        tempPizza = newPizza;
    }

    @Override
    //Has access to the Description for the Pizza object
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    //Has access to the Cost for the Pizza object
    public double getCost() {
        return tempPizza.getCost();
    }

}
