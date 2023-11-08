package org.lessons.bestoftheyear.controller;

import org.lessons.bestoftheyear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public String bestMovies(Model model) {
        List<Movie> movies = getBestMovies();
        model.addAttribute("movieList", movies);
        return "movie-list";
    }

    private List<Movie> getBestMovies() {
        Movie[] bestMovies = {
            new Movie(1,"Matrix"),
            new Movie(2,"Lord of the Rings"),
            new Movie(3,"Terminator")
        };
        return Arrays.asList(bestMovies);
    }
}
