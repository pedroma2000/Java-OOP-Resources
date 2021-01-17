/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallsStructure;

import Interfaces.Operations;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Manage implements Operations {
    
    
    private ArrayList<UserComData>specific = new ArrayList<UserComData>();
    
    /**
     * Default Management Constructor
     */
    public Manage() {
    }

    /**
     * This method loads every user number objet into an arrayList, converting ever
     * object component to its right type
     * @param inputFileName
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void LoadInfoToArray(String inputFileName) throws FileNotFoundException, IOException {
        
        try (FileReader fr = new FileReader(inputFileName)) {
            
            BufferedReader br = new BufferedReader(fr);
            
            String s;
            br.readLine();
            
            while ((s = br.readLine()) != null) {

                String[] attributes = s.split(";");

                UserComData Object = new UserComData();

                int tmp_vmail = Integer.parseInt(attributes[0]);
                
                double tmp_dmin = attributes[1].contains(",") ? Double.valueOf(attributes[1].replace(',', '.')):Double.valueOf(attributes[1]);
                //double tmp_dmin = Double.parseDouble(attributes[1]);
                double tmp_emin = attributes[2].contains(",") ? Double.valueOf(attributes[2].replace(',', '.')):Double.valueOf(attributes[2]);
                double tmp_nmin = attributes[3].contains(",") ? Double.valueOf(attributes[3].replace(',', '.')):Double.valueOf(attributes[3]);
                double tmp_intlmin = attributes[4].contains(",") ? Double.valueOf(attributes[4].replace(',', '.')):Double.valueOf(attributes[4]);

                String tmp_code = attributes[5];
                String tmp_Phonenumb = attributes[6];

                Object.setVmail(tmp_vmail);
                Object.setDmin(tmp_dmin);
                Object.setEmin(tmp_emin);
                Object.setNmin(tmp_nmin);
                Object.setIntmin(tmp_intlmin);
                Object.setCode(tmp_code);
                Object.setPhnumber(tmp_Phonenumb);
                
                specific.add(Object);
                
            }
        }
    }

    /**
     * thid method returns the average minutes per user using the phone
     * and returns its value
     * @return
     */
    @Override
    public List<Double> calculateAverageMinutesPerNumber() {
        
        List<Double> avgList = new ArrayList<>();

        for (int i = 0; i < specific.size(); i++){
            UserComData tmpNumb = specific.get(i);
            double ave = (tmpNumb.getDmin() + tmpNumb.getEmin() + tmpNumb.getIntmin() + tmpNumb.getNmin()) / 4;
            avgList.add(ave);
        }
            return avgList;
    }
    
    /**
     * thid method returns and writes to an csv file the average minutes spent
     * on the phone , per user area
     * @param area_code
     * @param outputFileName
     * @return
     */
    @Override
    public double calculateAverageMinutesPerArea(String area_code, String outputFileName) {
        
        double avg = 0;
        int count = 0;
        
        for (int i = 0; i < specific.size(); i++){
            UserComData tmpNumb = specific.get(i);
            
            if (tmpNumb.getCode().equals(area_code)){
                
                avg = avg + tmpNumb.getDmin() + tmpNumb.getEmin() + tmpNumb.getIntmin()
                        + tmpNumb.getNmin();
                
                
                count += 1;
            }
        }
        
        avg = avg / count;
        
        try {
            
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFileName), "UTF-8"))) {
                StringBuilder sb = new StringBuilder();
                
                sb.append(area_code);
                sb.append(";");
                sb.append(avg);
                
                bw.write(sb.toString());
                bw.newLine();
                bw.flush();
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return avg;
    }

}
