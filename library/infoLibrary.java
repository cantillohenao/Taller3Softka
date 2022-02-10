package library;

/**
 *
 * @author JUANES
 */
public class infoLibrary extends Info implements Comparable<Info> {

    public infoLibrary(int songId, String title, String artist, long year, float duration, String gender, String cover, String description) {
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.duration = duration;
        this.gender = gender;
        this.cover = cover;
        this.description = description;
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

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
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
