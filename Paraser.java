import utils.*;
public class Paraser {

    private boolean fehler;
    private List<Token> tokenliste;
    private Token aktuellesToken;

    public Paraser(List<Token>Tokenlist){
        fehler = false;
     this.tokenliste = tokenliste;
    }

    public Token nextToken(){
    int i = 0;

    tokenliste.toFirst();
    tokenliste.getContent();
    tokenliste.next();
//notiz; das wird so nicht klappen, da wir hier das erste skippen
    return tokenliste.getContent();

    }

    public boolean parase(){
    if(tokenliste.hasAccess())
    {
        pruefeA();
        return true;
    }else {

   fehler=true;
        return false;
    }

    }


    public boolean pruefeS(){
        if(tokenliste.getContent().equals("la")|| tokenliste.getContent().equals("le") || tokenliste.getContent().equals("lu")){
           pruefeA();

        }
        fehler = true;
        return false;
    }
    public boolean pruefeA(){
        if(tokenliste.getContent().equals("la")|| tokenliste.getContent().equals("le") || tokenliste.getContent().equals("lu")){
            pruefeB();

        }
            fehler = true;
            return false;

    }

    public boolean pruefeB() {
        //Wenn lu und Wert= ende
        if (tokenliste.getContent().equals("lu") && tokenliste.getWert().equals("ende")) {
         return true;
        }
        fehler = true;
        return false;
    }

}
