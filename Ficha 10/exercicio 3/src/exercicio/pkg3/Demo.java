package exercicio.pkg3;

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
        Supermarket market1 = new Supermarket(1.50, "Market 1", 1234);
        System.out.println(market1.toString());
        System.out.println("------------------------");
        market1.setPotatoesPrice(2.50);
        System.out.println("new price : " + market1.getPotatoesPrice() + " €");
        System.out.println("new Info----------------");
        System.out.println(market1.toString());
        System.out.println("Price for 10.5 kilos of potatoes----------------");
        System.out.println(market1.getMarketTotal(10.5) + " €");
    }
    
}
