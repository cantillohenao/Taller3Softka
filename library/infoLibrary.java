package library;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * [la clase InfoLibrary extiende de la clase Info, donde organizamos cada
 * parametro de la clase Info
 *
 * @version [1.0.000 2022-02-10]
 *
 * @author [Juan Esteban, Velasquez Posada ]
 *
 * @since [1.0.000 2022-02-10]
 *
 */
public class InfoLibrary extends Info implements Comparable<Info> {

    public InfoLibrary(int songId, String title, String artist, int year, float duration, String gender, String cover, String description) {
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.duration = duration;
        this.gender = gender;
        this.cover = cover;
        this.description = description;
    }

    /**
     * Refleja el Id de la cancion al agregarlo en el arrayList
     *
     * @return el Id de la cancion
     */
    public int getSongId() {
        return songId;
    }

    /**
     * Refleja el Id de la cancion, en caso de ser seteado por usuario
     *
     * @param songId Id de la cancion asignado por usuario
     */
    public void setSongId(int songId) {
        this.songId = songId;
    }

    /**
     * Refleja el año de la cancion al agregarlo en el arrayList
     *
     * @return el año de la cancion
     */
    public int getYear() {
        return year;
    }

    /**
     * Refleja el año de la cancion, en caso de ser seteado por usuario
     *
     * @param year año de la cancion asignado por usuario
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Refleja el artista de la cancion al agregarlo en el arrayList
     *
     * @return el artista de la cancion
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Refleja el artista de la cancion, en caso de ser seteado por usuario
     *
     * @param artist artista de la cancion asignado por usuario
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Refleja el titulo de la cancion al agregarlo en el arrayList
     *
     * @return el titulo de la cancion
     */
    public String getTitle() {
        return title;
    }

    /**
     * Refleja el titulo de la cancion, en caso de ser seteado por usuario
     *
     * @param title titulo de la cancion asignado por usuario
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Refleja la duracion (en tipo float) de la cancion al agregarlo en el
     * arrayList
     *
     * @return el duracion de la cancion
     */
    public float getDuration() {
        return duration;
    }

    /**
     * Refleja la duracion de la cancion, en caso de ser seteado por usuario
     *
     * @param duration la duracion de la cancion asignado por usuario
     */
    public void setDuration(float duration) {
        this.duration = duration;
    }

    /**
     * Refleja el genero de la cancion al agregarlo en el arrayList
     *
     * @return el genero de la cancion
     */
    public String getGender() {
        return gender;
    }

    /**
     * Refleja el genero de la cancion, en caso de ser seteado por usuario
     *
     * @param gender el genero de la cancion asignado por usuario
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Refleja la portada de la cancion al agregarlo en el arrayList
     *
     * @return la portada de la cancion
     */
    public String getCover() {
        return cover;
    }

    /**
     * Refleja la portada de la cancion, en caso de ser seteado por usuario
     *
     * @param cover la portada de la cancion asignado por usuario
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Refleja la descripcion de la cancion al agregarlo en el arrayList
     *
     * @return la descripcion de la cancion
     */
    public String getDescription() {
        return description;
    }

    /**
     * Refleja la descripcion de la cancion, en caso de ser seteado por usuario
     *
     * @param description la descripcion de la cancion asignado por usuario
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * [Con este metodo, se recorre el arrayList comparando los parametros
     * asignados. en este caso duracion de la cancion
     *
     *
     * @return valor 0 objetos iguales
     * @return valor 1. el objeto inicial tiene mayor prioridad que el anterior
     * por parametro
     *
     *
     * @author [Juan Esteban, Velasquez Posada ]
     *
     * @since [1.0.000 2022-02-10]
     *
     */
    @Override
    public int compareTo(Info o) {

        int state = -1;
        if (this.duration == o.getDuration()) {
            state = 0; // los objetos son iguales
        } else if (this.duration > o.getDuration()) {
            state = 1; // el objeto 1 es mayor que el pasado por parametro
        }
        return state;
    }
}