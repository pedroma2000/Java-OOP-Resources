package ex5;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {

    public static void main(String[] args) {

        ContinentHipermarket Cont1 = new ContinentHipermarket(2.55, 1.80, 20.2,
                0.50, "Continente", 123);
        JumbHipermarket jumb1 = new JumbHipermarket(1.50, 1.80, 2.50,
                0.50, "Jumbo 1", 4564);

        System.out.println(Cont1.getPoints(80));
        System.out.println(jumb1.getPoints(20));


    }
}
