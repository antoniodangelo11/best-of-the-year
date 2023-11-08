package org.lessons.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public String bestMovies(Model model) {
        List<String> movies = getBestMovies();
        String movieList = String.join(", ", movies);
        model.addAttribute("movieList", movieList);
        return "movie-list";
    }

    private List<String> getBestMovies() {
        return List.of("Matrix", "Lord of the Rings", "Terminator");
    }
}
