/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 25/10/2021
 */

public class Audio extends Media implements Pause{

    @Override
    public void pause() {
        // Sætte afspilning på pause
        System.out.println("Lyden er stoppet.");
    }
}
