/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.Expenses;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class ExpensesDemo {

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Expense ex1 = new Expense(1, "Food", 122.2f , new GregorianCalendar(2019, Calendar.MARCH,11).getTime(), "Dolar");
        Expense ex2 = new Expense(2, 230.78f , new GregorianCalendar(2019, Calendar.MARCH,11).getTime());
        Expense ex3 = new Expense(3, "Cars", 234.01f, new GregorianCalendar(2019, Calendar.MARCH,11).getTime(), "Euro");
        Expense ex4 = new Expense(4, 234.01f, new GregorianCalendar(2019, Calendar.MARCH,11).getTime());
        
        //Expense[] despesas = {ex1,ex2}; trocar condiçoes pra usar este
        
        User user1 = new User(new char[]{'j', 'm', 'm'}, "Jorge", "moreirajorge_17@outlook.pt", new GregorianCalendar(1998, Calendar.JANUARY,16).getTime(), 0.50f);
        User user2 = new User(new char[]{'z','e','t'}, "Ze", "ze@gmail.com", new GregorianCalendar(1998, Calendar.JANUARY,16).getTime(), 3.44f); 
        
        user1.expenses[0]=ex1;
        user1.expenses[1]=ex2;
        
        user2.expenses[0]=ex3;
        user2.expenses[1]=ex4;
        
        //user1.addExpense(ex1);
        System.out.println(user1.toString());
        System.out.println("--------------");
        System.out.println(user2.toString());
        
  
        
    }

}

//1.4 da erro porque as variaveis tem protected