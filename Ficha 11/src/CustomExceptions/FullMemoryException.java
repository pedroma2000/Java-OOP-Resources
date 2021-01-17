package CustomExceptions;

/**
 * Exception para memoria cheia
 *
 * @author Pedro Machado "pedroma2000"
 */
 */
public class FullMemoryException extends Exception {
    public FullMemoryException(String m){
        super(m);
    }
}
