package net.surajshrestha.dataFetchers;


import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import net.surajshrestha.graphqlinjava.models.Article;
import net.surajshrestha.graphqlinjava.models.User;
import net.surajshrestha.graphqlinjava.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ArticlesDataFetcher implements DataFetcher<List<Article>>{

    private final ArticleService articleService;

    @Autowired
    ArticlesDataFetcher(ArticleService articleService){
        this.articleService = articleService;
    }

    @Override
    public List<Article> get(DataFetchingEnvironment env) {
        User user = env.getSource();
        List<String> articleIds = new ArrayList<>();
        if(user!=null){
            articleIds = user.getArticlesIds();
        }
        List<Article> articles = articleService.findAllUserArticles(articleIds);
        return articles;
    }
}
