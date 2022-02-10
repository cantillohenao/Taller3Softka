package classes;

import library.Info;

import java.util.ArrayList;

public class PlayList {
    private String namePlayList;
    public ArrayList<Info> songs = new ArrayList<>();

    public PlayList(String namePlayList) {
        this.namePlayList = namePlayList;
    }

    public String getNamePlayList() {
        return namePlayList;
    }

    public void setNamePlayList(String namePlayList) {
        this.namePlayList = namePlayList;
    }

    public ArrayList<Info> getPlaylist() {
        return songs;
    }

    public void setPlaylist(ArrayList<Info> song) {
        this.songs = song;
    }

}
