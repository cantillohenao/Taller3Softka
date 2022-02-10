package library;

import java.util.Date;
import java.util.stream.Stream;
import java.util.Calendar;

/**
 *
 * @author JUANES
 */
public class Info implements Comparable<Info> {

    public String artist;
    public String title;
    public int songId;
    public long year;
    public float duration;
    public String gender;
    public String cover;
    public String description;

    public Info(String artist, String title, int songId, long year, float duration,
            String gender, String cover, String description) {
        this.artist = artist;
        this.title = title;
        this.songId = songId;
        this.year = year;
        this.duration = duration;
        this.gender = gender;
        this.cover = cover;
        this.description = description;
        
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSongid() {
        return songId;
    }

    public void setSongid(int Songid) {
        this.songId = Songid;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Info [artist= " + artist + ", title= " + title + ", songId= "
                + songId + ", year=" + year + ", duration= " + duration + ", gender= "
                + gender + ", cover= " + cover + ", description= " + description + "]" + "\n";
    }

    @Override
    public int compareTo(Info o) {
        if (o.getDuration() > duration) {
            return -1;
        } else if (o.getDuration() > duration) {
            return 0;
        } else {
            return 1;
        }
    }

}
