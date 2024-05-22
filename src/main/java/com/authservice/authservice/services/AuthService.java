package com.authservice.authservice.services;

import com.authservice.authservice.common.dtos.TokenResponse;
import com.authservice.authservice.common.dtos.UserRequest;

public interface AuthService {

    TokenResponse createUser(UserRequest userRequest);

}
