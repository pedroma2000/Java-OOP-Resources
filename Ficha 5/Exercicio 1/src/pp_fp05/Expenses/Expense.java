/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.Expenses;

import java.util.Date;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Expense {

    protected int number;
    protected String type;
    protected float value;
    protected Date data;
    
    Expense(int tempNumber, String tempType, float tempValue, Date tempDate, String currencyType) {
        number = tempNumber;
        type = tempType;
        data = tempDate;        
        //value = CurrencyRates.setValor(tempValue, Fvalue, CurrencyType);
        if(currencyType.equals("euro")){
            value=tempValue;
        }else{
            value=CurrencyRates.setValor(tempValue, currencyType, "euro");
        }
        
    }
    
    Expense(int tempNumber, String tempType, float tempValue, Date tempDate) {
        number = tempNumber;
        type = tempType;
        value = tempValue;
        data = tempDate;
    }
    
    
    //construtor que nao recebe tipo e que admite "outro"
    Expense(int tempNumber, float tempValue, Date tempDate) {
        number = tempNumber;
        type = "outro";
        value = tempValue;
        data = tempDate;
    }
    
    
    @Override
    public String toString(){
        String res= "";
        res += number + " "+type+" "+value+" "+"\n";
        return res;
    }
    
    
    
    
    

}
