package com.satishlabs.service;


import org.springframework.web.multipart.MultipartFile;

import com.satishlabs.dto.AuthRequest;
import com.satishlabs.dto.RegisterRequest;
import com.satishlabs.dto.UserResponseDto;

public interface AuthService {
    String register(RegisterRequest request, MultipartFile avatar);
    String login(AuthRequest request);
    UserResponseDto getProfile(String username);
}
