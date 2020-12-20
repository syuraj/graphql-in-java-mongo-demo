package net.surajshrestha.graphqlinjava.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("articles")
public class Article {
    private ObjectId id;

    private String title;
    private Integer minutesRead;
    private String authorId;
}
