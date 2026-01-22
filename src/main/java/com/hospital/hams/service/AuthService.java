package com.hospital.hams.service;

import com.hospital.hams.dto.JwtResponse;
import com.hospital.hams.dto.LoginRequest;
import com.hospital.hams.dto.RegisterRequest;

public interface AuthService {
    String register(RegisterRequest request);
    JwtResponse login(LoginRequest request);
}
