package pp_fp05.store;

import java.util.Calendar;
import java.util.GregorianCalendar;
import pp_fp05.cd.CD;
import pp_fp05.cd.Tracks;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class StoreDemo {

    public static void main(String[] args) {
        
        Tracks[] t = {new Tracks(1, "Ho Hey", 90), 
                      new Tracks(2, "Stubborn Love", 105)};

        CD[] cd1 = {new CD("The Lumineers", 2012, "Dualtone Records", t, 50.0),
                    new CD("The Bros", 2012, "Dualtone Records", t, 250.0),
                    new CD("T-series", 2012, "Dualtone Records", t, 0.0)};
        
        CD[] cd2 = {new CD("The Lumineers", 2012, "Dualtone Records", t, 50.0),
                    new CD("The Niggaz", 2013, "Dualtone Records", t, 100.0)};
        
 
        Sale[] sales = {new Sale(1, new GregorianCalendar(2019, Calendar.MARCH,11).getTime(),cd1),
                        new Sale(2, new GregorianCalendar(2018, Calendar.MARCH,12).getTime(),cd2)};
        
        sales[0].cds = cd1;
        sales[1].cds = cd2;
        
        for (Sale sale : sales) {
            sale.PrintSales();
        }
    }
}
