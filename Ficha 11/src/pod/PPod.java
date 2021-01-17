package pod;

import CustomExceptions.FullMemoryException;
import CustomExceptions.NonSuportedException;
import Interfaces.AppFunctions;
import Interfaces.PpodStates;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class PPod implements AppFunctions, java.io.Serializable, PpodStates {

    private final int MAX = 20;
    private File files[] = new File[MAX];
    private double memory;
    private double filledmemory = 0;
    private int filecount = 0;
    private int currentTrack;
    private Shuffle.metodo metodo;

    public PPod(double memory, Shuffle.metodo metodo) {
        this.memory = memory;
        this.metodo = metodo;
    }

    public PPod(double memory) {
        this.memory = memory;
    }

    public PPod() {
    }

    @Override
    public void addfile(File file) throws NullPointerException, IndexOutOfBoundsException, FullMemoryException {
        if (file == null) {
            throw new NullPointerException("Ficheiro não pode ser null");
        }
        if (filledmemory + file.getSize() > memory) {
            throw new FullMemoryException("memoria cheia!!!");
        }
        if (filecount > files.length) {
            throw new IndexOutOfBoundsException("Numero de ficheiros passa do limite!!");
        }
        for (int i = 0; i < files.length; i++) {
            if (files[i] == null) {
                files[i] = file;
                filecount++;
                filledmemory = filledmemory + files[i].getSize();
                return;
            }
        }
    }

    @Override
    public void delete(int index) throws ArrayIndexOutOfBoundsException, NullPointerException {
        if (index > files.length) {
            throw new ArrayIndexOutOfBoundsException("Index Inválido");
        }
        if (files[index] == null) {
            throw new NullPointerException("a posicao esta vazia");
        }
        files[index] = null;
        for (int i = index; i < (filecount - 1); i++) {
            files[i] = files[i + 1];
        }
        filecount -= 1;
        files[filecount] = null;
    }

    @Override
    public void playTrack(int index) throws NonSuportedException, NullPointerException, ArrayIndexOutOfBoundsException {
        if (index < MAX && index >= 0) {
            if (files[index] == null) {
                throw new NullPointerException("a posicao esta vazia");
            }

            if (files[index].getExtention() != "mp3") {
                throw new NonSuportedException("Ficheiro não suportado");
            }
            if (index >= files.length || index < 0) {
                throw new ArrayIndexOutOfBoundsException("Index Inválido");
            }

            if (files[index].getExtention().equals("mp3")) {
                System.out.println(files[index].toString());
                currentTrack = index;
            }
        }
    }

    @Override
    public void nextTrack() {
        int next;
        for (int i = currentTrack; i < MAX; i++) {
            try {
                next = currentTrack + 1;
                playTrack(next);
                return;
            } catch (NonSuportedException e) {
                System.out.println(e.getMessage());
                currentTrack++;
                continue;
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }

    @Override
    public void previousTrack() {
        int previous;
        for (int i = currentTrack; i >= 0; i--) {
            try {
                previous = currentTrack - 1;
                playTrack(previous);
                return;
            } catch (NonSuportedException e) {
                System.out.println(e.getMessage());
                currentTrack--;
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void ShufflePlay() {

        Shuffle.sort(metodo, files);

        try {
            playTrack(0);
        } catch (NonSuportedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void backup(String filePath) {

        try {
            ObjectOutputStream outp = new ObjectOutputStream(new FileOutputStream(filePath));
            for (int i = 0; i <= files.length; i++) {
                if (files[i] != null) {
                    outp.writeObject(files[i]);
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(PPod.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void recover(String filePath) {
        try {

            ObjectInputStream inp = new ObjectInputStream(new FileInputStream(filePath));

            for (int i = 0; i <= files.length; i++) {
                Object tmp = new File();
                tmp = (File) inp.readObject();
                files[i] = (pod.File) tmp;

            }

            inp.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PPod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PPod.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
