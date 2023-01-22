package dev.kyle.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
//this is the interface that will be used to interact with the Mongo database and the Movie class
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //this will find a movie by its imbdId because we dont want the public to see our original id
    Optional<Movie> findByImdbId(String imdbId);
}
