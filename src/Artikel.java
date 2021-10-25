/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 25/10/2021
 */

public class Artikel extends Media{
    private String tekst;
    private String journalist;

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getJournalist() {
        return journalist;
    }

    public void setJournalist(String journalist) {
        this.journalist = journalist;
    }
}
