package org.lessons.bestoftheyear.controller;

import org.lessons.bestoftheyear.model.Movie;
import org.lessons.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{id}")
    public String songDetail(@PathVariable("id") int songId, Model model) {
        Song song = getSongById(songId);
        model.addAttribute("song", song);
        return "song-detail";
    }

    private List<Song> getBestSongs() {
        Song[] bestSongs = {
                new Song(
                        1,
                        "Money",
                        "Pink Floyd",
                        "Money/Any Colour You Like è un singolo del " +
                                "gruppo musicale britannico Pink Floyd, " +
                                "pubblicato il 7 maggio 1973 come primo estratto dall'ottavo album in studio " +
                                "The Dark Side of the Moon."),

                new Song(
                        2,
                        "The Wall",
                        "Pink Floyd",
                        "The Wall è l'undicesimo album in studio " +
                                "del gruppo musicale britannico Pink Floyd, " +
                                "pubblicato nel 1979 dalla Harvest/EMI in Europa e in Giappone, " +
                                "e dalla Columbia/Sony nel resto del mondo."),

                new Song(
                        3,
                        "Speak To Me",
                        "Pink Floyd",
                        "Speak to Me è un brano musicale del gruppo musicale britannico " +
                                "Pink Floyd, traccia d'apertura dell'ottavo album in studio " +
                                "The Dark Side of the Moon, pubblicato nel 1973."),
        };
        return Arrays.asList(bestSongs);
    }

    private Song getSongById(int id) {
        for (Song song : getBestSongs()) {
            if (song.getId() == (id)) {
                return song;
            }
        }
        return null;
    }
}
