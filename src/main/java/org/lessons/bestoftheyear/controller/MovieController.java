package org.lessons.bestoftheyear.controller;

import org.lessons.bestoftheyear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{id}")
    public String movieDetail(@PathVariable("id") int movieId, Model model) {
        Movie movie = getMovieById(movieId);
        model.addAttribute("movie", movie);
        return "movie-detail";
    }

    private List<Movie> getBestMovies() {
        Movie[] bestMovies = {
            new Movie(
                    1,
                    "Matrix",
                    "Lana Wachowski and Lilly Wachowski",
                    "Matrix (The Matrix) è un film di fantascienza del 1999 in " +
                            "stile cyberpunk scritto e diretto dai fratelli Andy e Larry Wachowski."),

                new Movie(
                        2,
                        "Lord of the Rings",
                        "Peter Jackson",
                        "Il Signore degli Anelli (The Lord of the Rings) " +
                            "è un romanzo epico high fantasy scritto da J. R." +
                            " R. Tolkien."),

                new Movie(
                        3,
                        "Terminator",
                        "James Cameron",
                        "Terminator (The Terminator) è un film del 1984 diretto da James Cameron."),
        };
        return Arrays.asList(bestMovies);
    }

    private Movie getMovieById(int id) {
        for (Movie movie : getBestMovies()) {
            if (movie.getId() == (id)) {
                return movie;
            }
        }
        return null;
    }
}
