/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

import enums.AcademicDegree;
import enums.AdminArea;
import java.time.LocalDateTime;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Worker extends Person{
    private AcademicDegree wdegree;
    private AdminArea warea;
    private LocalDateTime beginContract;
    private double contractPerc;
    private LocalDateTime endContract;

    public Worker(AcademicDegree wdegree, AdminArea warea, LocalDateTime beginContract, double contractPerc, 
                  LocalDateTime endContract, String code, String name, String address, int phoneNumb) {
        super(code, name, address, phoneNumb);
        this.wdegree = wdegree;
        this.warea = warea;
        this.beginContract = beginContract;
        this.contractPerc = contractPerc;
        this.endContract = endContract;
    }


    @Override
    double CalcHours() {
        return 0;
    }

    @Override
    public String toString() {
        String text = "";
        
        text += super.toString();
        text += "Habilitações : " + AcademicDegree.AcademicDegreeToString(wdegree) + "\n";
        text += "Area de trabalho : " + AdminArea.AdminAreaToString(warea) + "\n";
        text += "Inicio do contrato : " + beginContract + "\n";
        text += "Percentagem do contrato : " + contractPerc + "\n";
        text += "Fim do contrato : " + endContract + "\n";

        return text;
    }
    
    
}
