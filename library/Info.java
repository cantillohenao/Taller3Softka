package library;

import java.util.Date;
import java.util.stream.Stream;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * [la clase Info nos apoya como clase base abstracta. de esta manera podemos
 * extenderla para crear otro tipo de arraysList sea con los mismos parametros u
 * omitiendo alguno de estos.
 *
 *
 * @version [1.0.000 2022-02-10]
 *
 * @author [Juan Esteban, Velasquez Posada ]
 *
 * @since [1.0.000 2022-02-10]
 *
 */
public abstract class Info {

    public String artist;
    public String title;
    public int songId;
    public int year;
    public float duration;
    public String gender;
    public String cover;
    public String description;

    public Info() {
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
     * [Con este metodo se sobreescribe el metodo toString para asi cuando se
     * pida el arrayList completo (en este caso myLibrary) Aparezca en pantalla
     * con el formato especificado
     *
     * @return Un orden designado en cuanto se pida imprimir la lista completa
     *
     * @author [Juan Esteban, Velasquez Posada ]
     *
     * @since [1.0.000 2022-02-10]
     *
     */
    @Override
    public String toString() {
        return "Info [Id=" + songId + ", titulo= " + title + ", Artista= "
                + artist + ", año= " + year + ", duracion= " + duration + ", genero= "
                + gender + ", portada= " + cover + ", descripcion= " + description + "]" + "\n";
    }

}