package main;

import CustomExceptions.FullMemoryException;
import CustomExceptions.NonSuportedException;
import pod.File;
import pod.PPod;
import pod.Shuffle;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class PPodDemo {

    public static void main(String[] args) {
        PPod pod1 = new PPod(100.0, Shuffle.metodo.ORDEM_ALFA);
        File f1 = new File("aa","mp3", 1.0, 120);
        File f2 = new File("bb","mp3", 1.0, 120);
        File f3 = new File("cc","mp3", 1.0, 120);
        File f4 = new File("dd","mp3", 1.0, 120);
        File f5 = new File("ee","mp3", 1.0, 120);
        File f6 = new File("ff","mp3", 1.0, 120);


        try {
            pod1.addfile(f1);
            pod1.addfile(f2);
            pod1.addfile(f6);
            pod1.addfile(f4);
            pod1.addfile(f5);
            pod1.addfile(f3);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (FullMemoryException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


//        try{
//           // pod1.delete(0);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }catch (NullPointerException e){
//            System.out.println(e.getMessage());
//        }
//
//        try{
//            pod1.playTrack(0);
//        } catch (NonSuportedException e){
//            System.out.println(e.getMessage());
//        }
       
       pod1.backup("podInfo.txt");
       //pod1.recover("podInfo.txt");
       
       
       //pod1.previousTrack();
       //pod1.previousTrack()
       //pod1.previousTrack();

        //pod1.ShufflePlay();
        //pod1.nextTrack();

    }
}
