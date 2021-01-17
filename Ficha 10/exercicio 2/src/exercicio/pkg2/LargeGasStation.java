package exercicio.pkg2;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class LargeGasStation extends GasStation implements CoffeeService {
    
    private double coffeePrice;

    public LargeGasStation(double coffeePrice, double gasPrice, String sname, String name, int vatNumber) {
        super(gasPrice, sname, name, vatNumber);
        this.coffeePrice = coffeePrice;
    }

    
    @Override
    public double getCoffeePrice() {
        return coffeePrice;
    }

    @Override
    public void setCoffeePrice(double p) {
        this.coffeePrice = p;
    }

    @Override
    public double getCoffeeTotal(int coffees) {
        double total;
        total = coffees * coffeePrice;
        return total;
    }
    
    @Override
    public String toString(){
        String text = "";
        text += super.toString();
        text += "Coffee price : " + coffeePrice + " €" + "\n";
        return text;
    }
    
}
