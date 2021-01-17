/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.List;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public interface Operations {
    
     /**
     * thid method returns the average minutes per user using the phone
     * and returns its value
     * @return
     */
    public List<Double> calculateAverageMinutesPerNumber();
    
    /**
     * thid method returns and writes to an csv file the average minutes spent
     * on the phone , per user area
     * @param area_code
     * @param outputFileName
     * @return
     */
    public double calculateAverageMinutesPerArea(String area_code, String outputFileName);
    
}
