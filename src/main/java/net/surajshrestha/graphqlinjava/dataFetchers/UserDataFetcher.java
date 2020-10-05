package net.surajshrestha.graphqlinjava.dataFetchers;


import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import net.surajshrestha.graphqlinjava.models.User;
import net.surajshrestha.graphqlinjava.services.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserDataFetcher implements DataFetcher<User> {

    private final UserService userService;

    @Autowired
    UserDataFetcher(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User get(DataFetchingEnvironment env) {
        Map args = env.getArguments();
        User user = userService.findOneById(new ObjectId(String.valueOf(args.get("id"))));
        return user;
    }
}
