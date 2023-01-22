package dev.kyle.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


// "Most of business" logic usually goes in the service layer
@Service
public class MovieService {
    @Autowired
    //variable from MovieRepository class that will be used in this class to call the methods
    private MovieRepository movieRepository;
    //this will return a list of movies
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

//     this will get a single movie by id and return it as an optional object, the only reason it is optional is because it is possible
//     that the id does not exist in the database and if it doesn't it will return an empty optional object
    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }



} // end of MovieService class