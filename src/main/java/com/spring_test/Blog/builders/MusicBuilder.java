package com.spring_test.Blog.builders;
import com.spring_test.Blog.beans.music.*;

public class MusicBuilder {
    private Music music;

    public MusicBuilder(Music music) {
        this.music = music;
    }

    public String playMusic() {
        return music.getGenre() + ": Playing - " + music.getSongList().get(0) + ".";
    }
}
