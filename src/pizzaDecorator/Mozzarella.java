package pizzaDecorator;

/**
 *
 * @author Lasse Andersen
 */
public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Dough");

        System.out.println("Adding Mozzarella");
    }

    @Override
    //Has access to the Description for the Pizza object
    public String getDescription()  {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    @Override
    //Has access to the Cost for the Pizza object
    public double getCost() {
        return tempPizza.getCost() + .50;
    }
}
