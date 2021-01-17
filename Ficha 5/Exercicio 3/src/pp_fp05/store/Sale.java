package pp_fp05.store;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
import java.util.Date;
import pp_fp05.cd.CD;

public class Sale {

    protected int saleid;
    protected Date date;
    CD[] cds;
    protected double finalprice;

    Sale(int tempsaleid, Date tempdate, CD[] tempcds) {
        
        saleid = tempsaleid;
        date = tempdate;
        finalprice = totalprice(tempcds);

    }

    public void PrintSales() {
        System.out.println("Saleid : " + saleid);
        System.out.println("Sale date : " + date);
        
        for (CD cd : cds) {
            if (cd.price != 0.0) {
            System.out.println("Nome do CD: " + cd.name);
            System.out.println("Ano de lançamento: " + cd.year);
            System.out.println("Editora: " + cd.editor);
            System.out.println("Preco: " + cd.price + " €");
        } else {
            System.out.println("Nome do CD: " + cd.name);
            System.out.println("Ano de lançamento: " + cd.year);
            System.out.println("Editora: " + cd.editor);
            System.out.println("Preco: SEM PREÇO");
        }
        }
        
        System.out.println("Preco total: "+finalprice);
    }

    
    public final double totalprice(CD[] cds) {
        double result = 0;

        for (CD cd : cds) {
            result += cd.price;
        }

        return result;
    }

}
