package etichettaMusicale;

import java.util.Scanner;

public class TestBranoDigitale {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        //Proviamo i costruttori
        //Primo
        BranoDigitale b1=new BranoDigitale("Vasco Rossi", "Albascura","wav"); //Ovviamente titolo sbagliato apposta
        //Secondo
        BranoDigitale b2;
        System.out.println("Inserire il titolo per la seconda canzone da pubblicare del cd per le bancarelle, tu sai di dove.");
        String titolo=in.nextLine();
        System.out.println("Inserisci il nome di chi la canta");
        String nome=in.nextLine();
        System.out.println("Lo sai il formato si/no");
        String s=in.nextLine();
        if (s.equalsIgnoreCase("SI")){
            System.out.println("Allora inseriscilo qui:");
            b2=new BranoDigitale(nome, titolo,in.nextLine());
        }
        else if (s.equalsIgnoreCase("NO")) {
            System.out.println("Ok non fa nulla ");
            b2=new BranoDigitale(nome, titolo);
        }
        else {
            System.out.println("Oramai è un no, io sono stato chiaro");
            b2=new BranoDigitale(nome, titolo);
        }

        //Proviamo i metodi get e set
        System.out.println("Le canzoni inserite sono : "+b1.getAutore()+" ; "+b1.getTitolo()+" ; "+ b1.getFormato()+".\n"
                +b2.getAutore()+" ; "+b2.getTitolo()+" ; "+ b2.getFormato()+".\n");
        System.out.println("Ah vuoi inserire .mp3 come formato per la famosa albascura. Ora è giusto guarda se è meglio.");
        b1.setFormato("mp3");
        System.out.println("Le canzoni inserite sono : "+b1.getAutore()+" ; "+b1.getTitolo()+" ; "+ b1.getFormato()+".\n"
                +b2.getAutore()+" ; "+b2.getTitolo()+" ; "+ b2.getFormato()+".\n");
    }
}
