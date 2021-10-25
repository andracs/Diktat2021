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
    // Klassevariable
    private static int idCounter = 0;

    // No-arg constructor
    public Media() {
        this.unikID = ++idCounter;
        System.out.println("Et nyt blankt medieobjekt er oprettet.");
        System.out.println(this);
    }

    // Lav en constructor som tager imod alle instansvariabler, undtagen unikID og modifiedDate
    public Media(String titel, String beskrivelse, LocalDate createdDate) {
        this.unikID = ++idCounter;
        System.out.println("Et nyt rigtigt medieobjekt er oprettet.");
        this.titel = titel;
        this.beskrivelse = beskrivelse;
        this.createdDate = createdDate;
        this.modifiedDate = createdDate;
        System.out.println(this);
    }


    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getUnikID() {
        return unikID;
    }

    @Override
    public String toString() {
        return "Media{" +
                "titel='" + titel + '\'' +
                ", beskrivelse='" + beskrivelse + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                ", unikID=" + unikID +
                '}';
    }
}
