package ex6;

import java.util.Calendar;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class JumbHipermarket extends HiperMarket {


    public JumbHipermarket(double coffeePrice, double gasPrice,
                           double aRate, double potatoPrice, String name, int vatNumber) {
        super(coffeePrice, gasPrice, aRate, potatoPrice, name, vatNumber);
    }

    @Override
    int getPoints(double purchaseValue) {
        Calendar c = Calendar.getInstance();

        double Wpoints = ((3 * purchaseValue) / 10);
        double WNpoints = ((1 * purchaseValue) / 10);

        switch (c.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
            case Calendar.TUESDAY:
            case Calendar.WEDNESDAY:
            case Calendar.THURSDAY:
            case Calendar.FRIDAY:
                return (int) Wpoints;
            default:
                return (int) WNpoints;


        }

    }


    @Override
    public String getName(){
        return super.getName();
    }

}
