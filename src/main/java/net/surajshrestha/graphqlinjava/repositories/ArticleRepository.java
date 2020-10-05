package net.surajshrestha.graphqlinjava.repositories;


import net.surajshrestha.graphqlinjava.models.Article;
import org.bson.types.ObjectId;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ArticleRepository extends PagingAndSortingRepository<Article, ObjectId> {
}

