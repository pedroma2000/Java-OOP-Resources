package Interfaces;

import CustomExceptions.FullMemoryException;
import CustomExceptions.NonSuportedException;
import pod.File;
import pod.Shuffle;


/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public interface AppFunctions {
    /**
     * Metodo para adicionar ficheiros
     * @param file
     * @throws NullPointerException
     * @throws IndexOutOfBoundsException
     * @throws FullMemoryException
     */
    public void addfile(File file) throws NullPointerException, IndexOutOfBoundsException, FullMemoryException;

    /**
     * Metodo para remover ficheiros
     * @param index
     * @throws ArrayIndexOutOfBoundsException
     * @throws NullPointerException
     */
    public void delete(int index)throws ArrayIndexOutOfBoundsException, NullPointerException;

    /**
     * Metodo de escolher a musica
     * @param index
     * @throws NonSuportedException
     * @throws ArrayIndexOutOfBoundsException
     * @throws NullPointerException
     */
    public void playTrack(int index) throws NonSuportedException, ArrayIndexOutOfBoundsException, NullPointerException;

    /**
     * Metodo de escolher a musica seguinte
     */
    public void nextTrack();

    /**
     * metodo de escolher a musica anterior
     */
    public void previousTrack();

    public void ShufflePlay();




}
