/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.bikestore;

import pp_fp07.enums.BrakeType;
import static pp_fp07.enums.BrakeType.H;
import pp_fp07.enums.Material;
import static pp_fp07.enums.Material.CARBONO;

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
        this.handlebelt = handlebelt;

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
    public void printBike(){
        System.out.println("-----------------////----------");
        System.out.print("ID : ");
        System.out.println(super.getId());
        System.out.print("Number of Gears: ");
        System.out.println(super.getNumberOfGears());
        System.out.print("Cor : ");
        System.out.println(super.getMainColor());
        System.out.print("Weel Size : ");
        System.out.println(super.getWeelSize());
        System.out.print("Brakes : ");
        System.out.println(super.getBrakes());
        System.out.print("Material : ");
        System.out.println(super.getMaterial());
        System.out.print("Price : ");
        System.out.println(super.getPrice());
        System.out.print("Guarantee : ");
        System.out.println(super.getGuaranteeYears());
        System.out.print("Handlebelt : ");
        System.out.println(handlebelt);
        System.out.print("Frame size : ");
        System.out.println(framesize);
        System.out.println("---------Observations : ");
        System.out.println(printobs());
        
        
    }

}
