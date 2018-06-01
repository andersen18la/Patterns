package carDecorator;

/**
 *
 * @author Lasse Andersen
 */
public class SportsCar extends CarDecorator {
    
    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble(); 
        System.out.println("This is a SportsCar of a car");
    }
    
}
