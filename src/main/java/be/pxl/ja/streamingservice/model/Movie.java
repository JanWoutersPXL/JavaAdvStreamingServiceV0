package be.pxl.ja.streamingservice.model;


import java.time.LocalDate;


public class Movie extends be.pxl.ja.oef1.Content implements Playable {
    public static final int LONG_PLAYING_TIME = 2 * 60 + 15;

    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;

    public Movie(String title, Rating maturityRating) {
        super(title,maturityRating);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void play() {
        System.out.println("Pausing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Playing " + this);
    }
    public boolean isLongPlayingTime(){
        return duration >= LONG_PLAYING_TIME;
    }

    public String getPlayingTime(){
        String output;
        int hours = getDuration() / 60 ;
        int minutes = getDuration() % 60;

        if(hours != 0 && minutes != 0) {
            output = hours + " h " + minutes + " min";
        }

        else if(hours == 0 && minutes != 0){
            output = minutes + " min";
        }

        else if(minutes == 0 && hours != 0){
            output = hours + " h";
        }

        else{
            output = "?";
        }
        return output;
    }
    @Override
    public String toString() {

        if (releaseDate != null){
            return super.toString() + " " + releaseDate.getYear();
        }
        return super.toString();
    }
}

