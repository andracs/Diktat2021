import java.time.LocalDate;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 25/10/2021
 */

public class Media {
    // Instansvariabler
    // Titel
    private String titel;
    // Beskrivelse
    private String beskrivelse;
    // Created
    private LocalDate createdDate;
    // Modified
    private LocalDate modifiedDate;
    // UID (Unik ID)
    private int unikID;

    // No-arg constructor
    public Media() {
        System.out.println("Et nyt medieobjekt er oprettet.");
    }

    // Lav en constructor som tager imod alle instansvariabler, undtagen unikID og modifiedDate
    public Media(String titel, String beskrivelse, LocalDate createdDate) {
        this.titel = titel;
        this.beskrivelse = beskrivelse;
        this.createdDate = createdDate;
    }
}
