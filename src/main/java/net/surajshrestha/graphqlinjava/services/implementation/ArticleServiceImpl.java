package net.surajshrestha.graphqlinjava.services.implementation;

import net.surajshrestha.graphqlinjava.models.Article;
import net.surajshrestha.graphqlinjava.services.ArticleService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArticleServiceImpl implements ArticleService {
    @Override
    public List<Article> findAllUserArticles(
            List<String> articleIds) {
        return null;  //TODO: Implement
    }
}
