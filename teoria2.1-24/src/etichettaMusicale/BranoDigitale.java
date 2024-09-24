package etichettaMusicale;

public class BranoDigitale {
    private String formato;
    private String titolo;
    private String autore;

    public String getAutore() { return autore; }
    public String getTitolo() { return titolo; }
    public String getFormato() { return formato; }

    public void setFormato( String formatoN ) { formato = formatoN; }

    public BranoDigitale(String aut,String tit){
        autore=aut;
        titolo=tit;
        formato=null;
    }
    public BranoDigitale(String aut,String tit,String form){
        autore=aut;
        titolo=tit;
        formato=form;
    }

}
