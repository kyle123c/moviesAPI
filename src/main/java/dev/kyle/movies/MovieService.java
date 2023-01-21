package dev.kyle.movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    //variable from MovieRepository class that will be used in this class to call the methods
    private MovieRepository movieRepository;
    //this will return a list of movies
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
}