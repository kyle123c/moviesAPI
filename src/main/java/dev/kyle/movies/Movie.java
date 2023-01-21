package dev.kyle.movies;
 // this helps so you don't have to type out constructors for each object
import lombok.AllArgsConstructor;
 //lombok helps you generate getters and setters
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
//this will be instead of writing getters and setters for each variable
@Data
//this will be instead of writing a constructor for each variable
@AllArgsConstructor
//takes no parameters and creates an empty constructor
@NoArgsConstructor
public class Movie {
    //this @Id annotation is what tells MongoDB that this is the primary key
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String TrailerLink;
    private List<String> genres;
    private String poster;
    private List<String> backdrop;
    @DocumentReference
    private List<Review> reviewIds;
}
