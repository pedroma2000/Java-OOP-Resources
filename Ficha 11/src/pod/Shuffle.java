package pod;

import CustomExceptions.NonSuportedException;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Shuffle {

    public static enum metodo {
        ORDEM_ALFA, ORDEM_TAMANHO, ORDEM_DURACAO;
    }

    public static void OrdenaTamanho(File files[]) {

        for (int i = 0; i < files.length - 1; i++) {
            for (int j = i + 1; j < files.length; j++) {
                if (files[i] != null && files[j]!= null) {



                }
            }
        }
    }


    public static void OrdenaNome(File files[]){
        for (int i = 0; i < files.length - 1; i++){
            for (int j = i + 1; j < files.length; j++){
                //fazer as posições não null
                if (files[i] != null && files[j]!= null) {
                    //Ordenação
                    if (files[i].getNome().compareTo(files[j].getNome()) > 0) {
                        File temp = files[i];
                        files[i] = files[j];
                        files[j] = temp;
                    }
                }
            }
        }

    }

    public static void OrdenaDuracao(File files[]) {

    }

    public static void sort(metodo m, File files[]) {
        switch (m) {
            case ORDEM_ALFA:
                Shuffle.OrdenaNome(files);
                break;
            case ORDEM_DURACAO:
                Shuffle.OrdenaDuracao(files);
                break;
            case ORDEM_TAMANHO:
                Shuffle.OrdenaTamanho(files);
                break;
            default:
                System.out.println("Algoritmo invalido");
                break;
        }
    }
}
