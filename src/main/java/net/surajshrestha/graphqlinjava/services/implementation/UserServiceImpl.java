package net.surajshrestha.graphqlinjava.services.implementation;


import net.surajshrestha.graphqlinjava.models.User;
import net.surajshrestha.graphqlinjava.repositories.UserRepository;
import net.surajshrestha.graphqlinjava.services.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findByIdIn(List<String> ids) {
        return userRepository.findByIdIn(ids);
    }

    @Override
    public List<User> findAllUsers() {
        return (ArrayList) userRepository.findAll();
    }

    @Override
    public User findOneById(ObjectId id) {
//        return userRepository.findOne(id);
        return null;
    }
}
