package pp_fp05.cd;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Tracks {

    public int number;
    public String name;
    public int duration;
    public Authors[] author;

    public Tracks(int tempnumber, String tempname, int tempduration) {

        number = tempnumber;
        name = tempname;
        duration = tempduration;
    }

    public void printTrack() {
        System.out.println("Titulo da musica numero " + number + " do CD:" + name);
        System.out.println("Duração: " + duration);
        System.out.println("Autores da musica: ");

        for (Authors author : author) {
            author.authorPrint();
        }
    }
}
