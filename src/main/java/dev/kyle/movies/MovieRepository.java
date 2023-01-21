package dev.kyle.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
//this is the interface that will be used to interact with the database and the Movie class
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}
