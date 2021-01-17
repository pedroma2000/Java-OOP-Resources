/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikes;

import enums.BrakeType;
import static enums.BrakeType.H;
import enums.Material;
import static enums.Material.CARBONO;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class RoadBike extends Bicycle {

    private final int MAXOBS = 20;

    private String handlebelt​;
    private float framesize;
    private String[] observation = new String[MAXOBS];
    private int countobs = 0;

    /**
     * Metodo construtor de Roadbike
     * @param id
     * @param numberOfGears
     * @param mainColor
     * @param weelSize
     * @param brakes
     * @param material
     * @param price
     * @param guaranteeYears
     * @param handlebelt
     * @param framesize
     */
    public RoadBike(int id, int numberOfGears, String mainColor,
            float weelSize, BrakeType brakes, Material material,
            float price, int guaranteeYears, String handlebelt,
            float framesize) {

        super(id, numberOfGears, mainColor, weelSize, H, CARBONO, price, guaranteeYears);

        this.framesize = framesize;
        this.handlebelt​ = handlebelt;

    }

    /**
     * Adicionar observaçoes ao array
     * @param obs
     */
    public void addobs(String obs) {

        if (countobs < MAXOBS) {
            observation[countobs] = obs;
            countobs++;
        } else {
            System.out.println("Limite atingido");
        }
    }

    /**
     * remover observaçoes
     * @param pos
     */
    public void removeobs(int pos) {
        String[] tmp = new String[MAXOBS];
        int found = 0;

        for (int i = 0; i < countobs; i++) {
            if (pos == i) {
                found += 1;
                countobs -= 1;
                continue;
            }
            tmp[i] = observation[i];
        }

        if (found > 0) {
            observation = tmp;
        } else {
            System.out.println("Não foi encontrado.");
        }
    }

    /**
     * editar observaçoes
     * @param position
     * @param obs
     */
    public void editObservations(int position, String obs) {
        int found = 0;

        for (int i = 0; i < countobs; i++) {
            if (position == i) {
                observation[i] = obs;
                found += 1;
                break;
            }
        }

        if (found > 0) {
            System.out.println("Foi alterado com sucesso.");
        } else {
            System.out.println("Não foi encontrado.");
        }
    }

    /**
     * printar ibservaçoes
     * @return
     */
    public String printobs() {
        String obs = "";
        for (int i = 0; i < countobs; i++) {
            obs += "Observação " + (i + 1) + " : " + observation[i] + "\n";
        }
        return obs;
    }
    
    /**
     * Printar Bike
     */

    @Override
    public String toString(){
        String text = " ";

        text += super.toString();
        text += "ID : " + super.getId() + "\n";
        text += "Number of Gears : " + super.getNumberOfGears() + "\n";
        text += "Color : " + super.getMainColor() + "\n";
        text += "Weel Size : " + super.getWeelSize() + "\n";
        text += "Brakes : " + super.getBrakes() + "\n";
        text += "Material : " + super.getMaterial() + "\n";
        text += "Price : " + super.getPrice() + "\n";
        text += "Guarantee : " + super.getGuaranteeYears() + "\n";
        text += "Handlebelt : " + handlebelt​ + "\n";
        text += "Framesize : " + framesize + "\n";
        text += "Observations : " +  printobs();

        return text;

    }

        


}
