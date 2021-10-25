/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 25/10/2021
 */

public class Video extends Media {

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
}
