package org.lessons.bestoftheyear.controller;

import org.lessons.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {

    @GetMapping
    public String bestSongs(Model model) {
        List<Song> songs = getBestSongs();
        model.addAttribute("songList", songs);
        return "song-list";
    }

    private List<Song> getBestSongs() {
        Song[] bestSongs = {
                new Song(1,"Money"),
                new Song(2,"The Wall"),
                new Song(3,"The Dark Side of the Moon")
        };
        return Arrays.asList(bestSongs);
    }
}
