import utils.*;
public class Scannerh {
    private Token aktuellesToken;
    private boolean fehler;
    private String eingabe;
    private List tokenliste;


    public Scannerh(String eingabe, List<Token> Tokenlist) {
        aktuellesToken = Tokenlist.getContent();
        this.tokenliste = Tokenlist;
        this.eingabe = eingabe;
        this.fehler = false;
    }

    public void scanne() {

        int i;
        for (i = 0; i < eingabe.length(); i += 2) {
            // Prüfe, ob noch mindestens 2 Zeichen übrig sind
            if (i + 2 <= eingabe.length()) {
                String ZweiBuchstaben = eingabe.substring(i, i + 2);

                if (ZweiBuchstaben.equals("la") || ZweiBuchstaben.equals("le") || ZweiBuchstaben.equals("lu")) {
                    tokenliste.append(new Token("Wort", ZweiBuchstaben));
                    //"WORT" der Typ des Tokens ist, der angibt, welche Art von Token es ist (hier ein gültiges Wort der
                    // Grammatik, z.B. "la", "le", "lu").
                    System.out.println("1. trift zu"); //= funktioniert
                    //ZweiBuchstaben der Wert des Tokens ist, also der tatsächliche Text aus der Eingabe, der diesem Token entspricht.

                } else {
                    fehler = true;
                    ausgabe(fehler);
                }


            }
        }ausgabe(fehler);
    }



    private void ausgabe(boolean pFehler){
        if (pFehler) {
            System.out.println("Ungültiges Wort in der Eingabe gefunden.");
        } else {
            System.out.println("Eingabe erfolgreich gescannt, keine Fehler gefunden.");
        }
    }

     public List<Token> getTokenliste(){
         if (!fehler){
             return tokenliste;
         }else{
             return null;
         }
    }
}
