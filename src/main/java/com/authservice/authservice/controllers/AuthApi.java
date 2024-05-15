package com.authservice.authservice.controllers;

import com.authservice.authservice.common.constants.ApiPathConstants;
import com.authservice.authservice.common.dtos.TokenResponse;
import com.authservice.authservice.common.dtos.UserRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(ApiPathConstants.V1_ROUTE + ApiPathConstants.AUTH_ROUTE)
public interface AuthApi {
    @PostMapping(ApiPathConstants.REGISTER_PATH)
    ResponseEntity<TokenResponse> createUser(@RequestBody @Valid UserRequest userRequest);

}
