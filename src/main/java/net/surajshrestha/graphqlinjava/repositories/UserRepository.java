package net.surajshrestha.graphqlinjava.repositories;

import net.surajshrestha.graphqlinjava.models.User;
import org.bson.types.ObjectId;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, ObjectId> {
}
