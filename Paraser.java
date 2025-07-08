import utils.*;
public class Paraser {

    private boolean fehler;
    private List<Token> tokenliste;
    private Token aktuellesToken;

    public Paraser(List<Token>tokenlist){
        fehler = false;
     this.tokenliste = tokenliste;
    }

    public Token nextToken(){
    Token t = tokenliste.getContent();
    tokenliste.next();



    return tokenliste.getContent();

    }

    public boolean parase(){
    if(tokenliste!=null)
    {
        pruefeS();
        return true;
    }else {

   fehler=true;
   System.out.println("nein");
        return false;
    }

    }


    public boolean pruefeS(){
        System.out.println("S wird geprüft");
        if(tokenliste.getContent().equals("la")|| tokenliste.getContent().equals("le") || tokenliste.getContent().equals("lu")){
           pruefeA();

        }
        fehler = true;
        return false;
    }
    public boolean pruefeA(){
        System.out.println("A wird geprüft");
        if(tokenliste.getContent().equals("la")|| tokenliste.getContent().equals("le") || tokenliste.getContent().equals("lu")){
            pruefeB();

        }
            fehler = true;
            return false;

    }

    public boolean pruefeB() {
        //Wenn lu und Wert= ende
        if (tokenliste.getContent().equals("lu") && tokenliste.getContent().getWert().equals("ende")) {
         return true;
        }
        fehler = true;
        return false;
    }

}
