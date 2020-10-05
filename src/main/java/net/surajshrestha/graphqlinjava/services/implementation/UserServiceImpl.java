package net.surajshrestha.graphqlinjava.services.implementation;


import net.surajshrestha.graphqlinjava.models.User;
import net.surajshrestha.graphqlinjava.services.UserService;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public List<User> findByIdIn(
            List<String> friendsIds) {
        return null;  //TODO: Implement
    }

    @Override
    public List<User> findAllUsers() {
        return null;  //TODO: Implement
    }

    @Override
    public User findOneById(ObjectId id) {
        return null;  //TODO: Implement
    }
}
