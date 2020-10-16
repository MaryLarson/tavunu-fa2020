/**
 * Create tavuni.
 * 
 * @author Mithat Konar
 * @author Mary Ann Larson
 */
public class TavunuApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var t1 = new Tavunu();
        var t2 = new Tavunu("Trast", 1988, 24);
        System.out.println(t1);
        System.out.println(t2);
    }

}
