package exercicio.pkg2;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LargeGasStation station1 = new LargeGasStation(0.50, 1.35, 
                                       "Station 1", "Galp Energias", 1234);
        
        System.out.println(station1.toString());
        station1.setCoffeePrice(1.00);
        System.out.println("---------------------");
        System.out.println("New coffee price : ");
        System.out.println(station1.getCoffeePrice() + " €");
        System.out.println("---------------------");
        System.out.println(station1.toString());
        System.out.println("---------------------");
        System.out.println("Total coffee price");
        System.out.println(station1.getCoffeeTotal(10) + " €");
        
    }
    
}
