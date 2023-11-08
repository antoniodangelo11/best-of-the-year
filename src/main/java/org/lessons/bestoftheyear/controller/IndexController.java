package org.lessons.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    @ResponseBody
    public String index() {
        return "<html><body><h1>I'm Index</h1></body></html>";
    }

    @GetMapping("home")
    public String home(Model model) {
        model.addAttribute("name", "Antonio");
        return "home-page";
    }

    private List<String> getBestMovies() {
        return List.of("Matrix", "Lord of the Rings", "Terminator");
    }

    private List<String> getBestSongs() {
        return List.of("Money", "The Wall", "The Dark Side of the Moon");
    }

    @GetMapping("movies")
    public String bestMovies(Model model) {
        List<String> movies = getBestMovies();
        String movieList = String.join(", ", movies);
        model.addAttribute("movieList", movieList);
        return "movies";
    }

    @GetMapping("songs")
    public String bestSongs(Model model) {
        List<String> songs = getBestSongs();
        String songList = String.join(", ", songs);
        model.addAttribute("songList", songList);
        return "songs";
    }
}

