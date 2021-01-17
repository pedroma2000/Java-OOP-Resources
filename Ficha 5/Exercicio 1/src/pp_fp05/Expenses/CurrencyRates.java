/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.Expenses;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class CurrencyRates {

    public static double[][] TaxMatrix = new double[][]{{1.00000, 0.76900, 96.1141, 0.67131},
    {1.13, 1.00000, 124.989, 0.89},
    {96.06148, 125.00000, 1.00000, 143.26648}};

    
    public static float setValor(float ValorOrigem, String moedaOrigem, String moedaDestino) {
        float valorDestino = 0;

        valorDestino = (float) (ValorOrigem * TaxMatrix[1][3]);

        return valorDestino;
    }


}
