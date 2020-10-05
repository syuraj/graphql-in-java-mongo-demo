package net.surajshrestha.graphqlinjava.services;


import net.surajshrestha.graphqlinjava.models.Article;

import java.util.List;

public interface ArticleService {

    List<Article> findAllUserArticles(List<String> articleIds);
}
