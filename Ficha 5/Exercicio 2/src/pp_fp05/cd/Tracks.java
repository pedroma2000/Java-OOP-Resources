package pp_fp05.cd;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Tracks {
    protected int number;
    protected String name;
    protected int duration;
    protected String author;
    
    Tracks(int tempnumber, String tempname, int tempduration, String tempauthor){
        
        number = tempnumber;
        name = tempname;
        duration = tempduration;
        author = tempauthor;
        
    }
    
    public void printTrack(){
        System.out.println("Titulo da musica numero "+number+" do CD:" + name);
        System.out.println("Duração: "+duration);
        System.out.println("Autor da musica: "+author);
    }
}
