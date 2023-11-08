package org.lessons.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {

    @GetMapping
    public String bestSongs(Model model) {
        List<String> songs = getBestSongs();
        String songList = String.join(", ", songs);
        model.addAttribute("songList", songList);
        return "song-list";
    }

    private List<String> getBestSongs() {
        return List.of("Money", "The Wall", "The Dark Side of the Moon");
    }
}
