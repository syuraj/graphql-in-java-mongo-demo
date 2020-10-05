
package net.surajshrestha.graphqlinjava.services;

import net.surajshrestha.graphqlinjava.models.User;
import org.bson.types.ObjectId;

import java.util.List;

public interface UserService {

    List<User> findByIdIn(List<String> friendsIds);

    List<User> findAllUsers();

    User findOneById(ObjectId id);
}
