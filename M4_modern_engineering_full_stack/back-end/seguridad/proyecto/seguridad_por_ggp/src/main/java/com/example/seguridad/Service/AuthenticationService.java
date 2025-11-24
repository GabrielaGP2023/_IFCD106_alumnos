package com.example.seguridad.Service;

import com.example.seguridad.dao.request.SignUpRequest;
import com.example.seguridad.dao.request.SignInRequest;
import com.example.seguridad.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);

}
