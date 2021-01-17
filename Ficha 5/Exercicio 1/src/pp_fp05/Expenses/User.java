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
public class User {

    private static final int ID_SIZE = 3;

    protected char[] id;
    protected String name;
    protected String email;
    protected Date birthDate;
    protected Expense[] expenses; //array de despesas
    protected float contrib;
    protected String usertype;

    public User(char[] tempId, String tempName, String tempEmail, Date tempBirthDate, float tempcontrib) {

        id = tempId;
        name = tempName;
        email = tempEmail;
        birthDate = tempBirthDate;
        expenses = new Expense[10];
        
        contrib = tempcontrib;
        
        if (contrib >= 1.00){
            usertype = "Premium";
        } else if (contrib < 1.00) {
            usertype = "Free";
        }

    }
    
    public User(char[] tempId, String tempName, String tempEmail, Date tempBirthDate, Expense[] tempExpenses) {

        id = tempId;
        name = tempName;
        email = tempEmail;
        birthDate = tempBirthDate;
        expenses = tempExpenses;

    }

    public User(char[] tempId, String tempName, String tempEmail, Date tempBirthDate) {

        id = tempId;
        name = tempName;
        email = tempEmail;
        birthDate = tempBirthDate;
        expenses = new Expense[10];
    }

    void addExpense(Expense e) {
        int i = 0;
        while (expenses[i].number != -1f && i < expenses.length) {

            i++;
        }
        expenses[i] = e;
    }

    @Override
    public String toString() {
        String r = "";
        r += "User name: " + name + "\n";
        r += "User email: " + email + "\n";
        r += "User ID: " + new String(id) + "\n";
        r += "User birth date: " + birthDate.toString() + "\n";
        r += "User account type: " + usertype + "\n";

        int total = 0, i = 0;
//        while (expenses[i] !=null && i < expenses.length && expenses[i].value != 0) {
//            total++;
//            i++;
//        }
//        
//        r+= "total despesas: "+total;

        while (expenses[i] != null && i < expenses.length) {
            r += expenses[i].toString();
            i++;
        }
        
        return r;
    }

}

