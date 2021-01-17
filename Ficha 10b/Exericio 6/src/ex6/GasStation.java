/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import Interfaces.GasService;

/**
 * @author Pedro Machado "pedroma2000"
 */
public class GasStation extends Company implements GasService {
    private double gasPrice;
    private String sname;
    private int count = 0;

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

    public GasStation() {
    }

    public GasStation(double gasPrice, String sname, String name, int vatNumber) {
        super();
        super.setName(name);
        super.setVatNumber(vatNumber);
        this.gasPrice = gasPrice;
        this.sname = sname;
    }

    public static GasStation verify(GasStation gr[]) {

        double min = gr[0].gasPrice;
        int i;

        for (i = 1; i < gr.length; i++) {
            if (gr[i].gasPrice < min) {
                min = gr[i].gasPrice;
            }
        }

        for (i = 1; i < gr.length; i++) {
            if (gr[i].gasPrice == min) {
                return gr[i];
            }

        }
        return null;
    }


    @Override
    public String toString() {
        String text = "";

        text += super.toString();
        text += "Station name: " + sname + "\n";
        text += "Gas price per litre: " + gasPrice + " €" + "\n";

        return text;
    }

}
