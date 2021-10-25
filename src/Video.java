import java.time.LocalDate;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 25/10/2021
 */

public class Video extends Media implements Pause{
    // Duration 01:02:24.2
    private double durationSecond;
    // Videofilnavn /nyheder/pj345.mp4
    private String videoFilNavn;

    public Video() {

    }

    public Video(double durationSecond, String videoFilNavn) {
        this.durationSecond = durationSecond;
        this.videoFilNavn = videoFilNavn;
    }

    public Video(String titel, String beskrivelse, LocalDate createdDate, double durationSecond, String videoFilNavn) {
        super(titel, beskrivelse, createdDate);
        this.durationSecond = durationSecond;
        this.videoFilNavn = videoFilNavn;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titel='" + super.getTitel() + '\'' +
                ", beskrivelse='" + super.getBeskrivelse() + '\'' +
                ", createdDate=" + super.getCreatedDate() +
                ", modifiedDate=" + super.getModifiedDate() +
                ", unikID=" + super.getUnikID() +
                '}';
    }

    public double getDurationSecond() {
        return durationSecond;
    }

    public void setDurationSecond(double durationSecond) {
        this.durationSecond = durationSecond;
    }

    public String getVideoFilNavn() {
        return videoFilNavn;
    }

    public void setVideoFilNavn(String videoFilNavn) {
        this.videoFilNavn = videoFilNavn;
    }

    @Override
    public void pause() {
        System.out.println("Videoen er stoppet.");
    }
}
