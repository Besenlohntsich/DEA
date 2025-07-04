import utils.*;
import java.util.Scanner;
public class Analyse {

    private List<Token> tokenliste;
    private Scannerh scanner;
    private Paraser parser;
    private String eingabe;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Welches Wort möchtest du Analysieren?");
            new Analyse(scanner.next());
        }


    }

    public Analyse(String peingabe) {
        eingabe = peingabe;
        tokenliste = new List<>();
        scanner = new Scannerh(eingabe,tokenliste);
        parser = new Paraser(scanner.getTokenliste());
        Analysiere();

    }
    public void Analysiere()
    {
        scanner.scanne();
        if(!tokenliste.isEmpty()) {
            parser.parase();
        }
    }

}
