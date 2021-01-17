package exercicio.pkg1;

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
        
        /*
        Company c1 = new Company();
        c1.setName("Galp Energias");
        c1.setVatNumber(1234);
        */
        
        GasStation station1 = new GasStation(1.34, "Station 1", "Galp Energias", 12345);
        System.out.println(station1.toString());
        System.out.println("---------------------------");
        station1.setGasPrice(2.35);
        System.out.println("New gas price : " + station1.getGasPrice());
        System.out.println("---------------------------");
        System.out.println("Informacao nova------------");
        System.out.println(station1.toString());
        System.out.println("---------------------------");
        System.out.println("Total a pagar : " + station1.getGasTotal(20));
        
        
        
    }
    
}
