import utils.*;
public class Paraser {

    private boolean fehler;
    private Token aktuellesToken;
    private List tokenliste;

    public Paraser(Tokenlist){
        fehler = false;

    }

    public nextToken(Token){
    int i = 0;
    tokenliste.toFirst();
    tokenliste.getContent();
    tokenliste.next();
    }

    public boolean parase(){
    if(tokenliste.hasAccess())
    {
        pruefeA();
        return true;
    }else {

   fehler=true;
    }
        return false;
    }


    public boolean pruefeS(){

    }
    public boolean pruefeA(){

    }

    public boolean pruefeB(){

    }
}
