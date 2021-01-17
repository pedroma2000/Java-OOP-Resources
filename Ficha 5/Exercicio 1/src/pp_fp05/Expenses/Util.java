/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.Expenses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Util {

    public static Date parseDate(String data) {
        try {
            return new SimpleDateFormat("YYYY-MM-DD").parse(data);

        } catch (ParseException e) {
            return null;
        }
    }
}
