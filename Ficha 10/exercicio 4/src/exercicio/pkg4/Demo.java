package exercicio.pkg4;

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
        
        HiperMarket hiper1 = new HiperMarket(0.50, 1.50, 5.00, 0.30, "Lidl", 123);
        //System.out.println(hiper1.getPotatoesPrice());
        System.out.println(hiper1.toString());
        System.out.println("--------------");
        System.out.println("anual rate : " + hiper1.getAnnualRate() + "%");
        hiper1.setAnnualRate(2.32);
        System.out.println("new anual rate : " + hiper1.getAnnualRate() + "%");
        System.out.println("Monthly payment for 5 months : ");
        System.out.println(hiper1.computeMonthlyPayment(124.23, 5) + " €");
        System.out.println("--------------");
        System.out.println("New info");
        System.out.println(hiper1.toString());
        
    }
    
}
