import java.time.LocalDate;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 25/10/2021
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("TV2 ØST mediehåndtering");

        // Instantier et medie-objekt
        Video video1 = new Video();

        // Instantier et medie-objekt med den anden constructor
        Media media2 = new Media("Hestelokkeren på Nordfalster", "Denne historie handler om dyr.", LocalDate.now());

        // Lav en løkke som opretter 50 medielementer
        for (int i = 0; i < 50; i++) {
            Media media3 = new Media();
        }



    }
}
