/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 25/10/2021
 */

public class Video extends Media {
    // Duration 01:02:24.2
    private double durationSecond;
    // Videofilnavn /nyheder/pj345.mp4
    private String videoFilNavn;

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
}
