package net.surajshrestha.dataLoader;

import net.surajshrestha.graphqlinjava.models.User;
import net.surajshrestha.graphqlinjava.repositories.ArticleRepository;
import net.surajshrestha.graphqlinjava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DataLoader {
    private final UserRepository userRepository;
    private final ArticleRepository articleRepository;

    @Autowired
    public DataLoader(UserRepository userRepository, ArticleRepository articleRepository) {
        this.userRepository = userRepository;
        this.articleRepository = articleRepository;
    }

    @PostConstruct
    private void generateData() {
        List<User> users = new ArrayList<>();
        users.add(User.builder().name("jj").createdAt(new Date()).age(22).articlesIds(new ArrayList<>()).build());
        users.add(User.builder().name("aa").createdAt(new Date()).age(22).articlesIds(new ArrayList<>()).build());
        users= (List<User>) userRepository.saveAll(users);

        // users.add(User);
    }
}
