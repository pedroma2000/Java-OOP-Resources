package bikes;

import enums.BikeTools;
import enums.BrakeType;
import enums.Material;
import enums.MountainBikeSuspension;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma Bicicleta de montanha
 * </p>
 */
public class MountainBike extends Bicycle {

    private final int MAXTOOLS = 10;
    private int counttools = 0;

    /**
     * Número de luzes
     */
    private int numberOfLights;
    /**
     * Tipo de suspensão
     */
    private MountainBikeSuspension suspension;
    /**
     * Utensílios existentes neste tipo de bicicleta
     */
    private BikeTools[] bikeTools;

    /**
     * Método construtor para a criação de uma instância de
     * {@link MountainBike bicicleta de montanha} sem utensílios.
     *
     * @param numberOfLights Número de luzes
     * @param suspension Tipo de suspensão
     * @param id Identificador da bicicleta
     * @param numberOfGears Número de velocidades
     * @param mainColor Cor da bicicleta
     * @param weelSize Diâmetro das rodas
     * @param brakes {@link BrakeType tipo de travões} da bicicleta
     * @param material {@link Material tipo de material} da bicicleta
     * @param price Preço da bicicleta
     * @param guarantee Anos de garantia
     */
    public MountainBike(int numberOfLights, MountainBikeSuspension suspension,
            int id, int numberOfGears, String mainColor, float weelSize,
            BrakeType brakes, Material material, float price, int guarantee) {

        super(id, numberOfGears, mainColor, weelSize, brakes, material,
                price, guarantee);

        this.numberOfLights = numberOfLights;
        this.suspension = suspension;
        bikeTools = new BikeTools[MAXTOOLS];
    }

    /**
     * Metodo de adicionar ferramentas ao array de bikeTools
     * conta tambem a posição que foi guardada com um counter
     * @param tool
     */
    public void addtool(BikeTools tool) {
        int i = 0;
        /// counter 
        // biketools[counter]
        // counter++
        for (; i < MAXTOOLS; i++) {
            if (bikeTools[i] == null) {
                bikeTools[i] = tool;
                counttools++;
                break;
            }
        }
    }

    /**
     * metodo de editar tools, vaia aposiçao da tool antiga e da replace por uma
     * nova a escolha
     * @param tool
     * @param newtool
     */
    public void edittool(BikeTools tool, BikeTools newtool) {
        int i = 0;

        for (; i < MAXTOOLS; i++) {
            if (bikeTools[i] == tool) {
                bikeTools[i] = newtool;
                break;
            }
        }

    }

    /**
     * Metodo de remover tools
     * verifica se ha tools iguais a inserida no metodo, se houver ignora, se nao
     * houver, guarda pro array novo as diferentes
     * @param tool
     */
    public void removetool(BikeTools tool) {
        // 4-3 counter --
        int i = 0;
        BikeTools[] newtools = new BikeTools[bikeTools.length];

        for (int k = 0; i < MAXTOOLS; i++) {

            if (bikeTools[i] == tool) {
                counttools--;
                continue;
            }

            newtools[k++] = bikeTools[i];
        }
        bikeTools = newtools;
    }

    /**
     * printar tools
     * @return
     */
    public String printtools() {

        String tools = "";
        for (int i = 0; i < counttools; i++) {
            tools += bikeTools[i] + "\n";
        }

        return tools;
    }
    
    /**
     * printar bike
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
        text += "Number of ligths : " + numberOfLights + "\n";
        text += "Suspension : " + suspension + "\n";
        text += "Tools: " +  printtools();


        return text;
        
    }


}
