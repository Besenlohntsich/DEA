import utils.*;
import java.util.Scanner;
public class Analyse {

    private List<Token> tokenliste;
    private Scanner scanner;
    private Parser parser;
    private String eingabe;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Welches Wort möchtest du Analysieren?");
            new Analyse(scanner.next());
        }


    }

    public Analyse(String eingabe) {
        this.eingabe = eingabe;
        tokenliste=new List<>();
        scanner=new Scannerh(eingabe,tokenliste);
        parsser=new Parser(tokenliste);
        analysiere();

    }
    public void Analysieren()
    {
        scanne();
        if(!tokenliste.isEmpty()) {
            parase();
        }
    }

}
