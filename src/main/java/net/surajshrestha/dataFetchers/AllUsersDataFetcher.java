package net.surajshrestha.dataFetchers;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import net.surajshrestha.graphqlinjava.models.User;
import net.surajshrestha.graphqlinjava.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AllUsersDataFetcher implements DataFetcher<List<User>> {

    private final UserService userService;

    @Autowired
    AllUsersDataFetcher(UserService userService){
        this.userService = userService;
    }

    @Override
    public List<User> get(DataFetchingEnvironment env) {
        User user =  env.getSource();
        List<User> friends = new ArrayList<>();
        if(user !=null){
            friends = userService.findByIdIn(user.getFriendsIds());
        }else {
            friends = userService.findAllUsers();
        }
        return friends;
    }
}
