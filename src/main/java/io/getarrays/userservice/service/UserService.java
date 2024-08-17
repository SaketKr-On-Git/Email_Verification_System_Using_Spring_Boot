package io.getarrays.userservice.service;

import io.getarrays.userservice.domain.User;

public interface UserService {
    User saveUser(User user);

    Boolean verifyToken(String token);
}