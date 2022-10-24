package com.saeed.springbank.user.query.api.repositories;

import com.saeed.springbank.user.core.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
