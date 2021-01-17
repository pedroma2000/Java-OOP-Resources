/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg1;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class GasStation extends Company implements GasService {

    private double gasPrice;
    private final String sname;

    @Override
    public double getGasPrice() {
        return gasPrice;
    }

    @Override
    public void setGasPrice(double p) {
        if (p > 0) {
            gasPrice = p;
        }
    }

    @Override
    public double getGasTotal(double litres) {
        double total;
        total = litres * gasPrice;
        return total;
    }

    public GasStation(double gasPrice, String sname, String name, int vatNumber) {
        super();
        super.setName(name);
        super.setVatNumber(vatNumber);
        this.gasPrice = gasPrice;
        this.sname = sname;
    }

    @Override
    public String toString() {
        String text = "";

        text += super.toString();
        text += "Station name: " + sname + "\n";
        text += "Gas price per litre: " + gasPrice + " €";

        return text;
    }

}
