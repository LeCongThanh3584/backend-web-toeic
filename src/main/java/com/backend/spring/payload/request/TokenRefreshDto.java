package com.backend.spring.payload.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TokenRefreshDto {

    @NotBlank(message = "Refresh Token không được trống!")
    private String refreshToken;
}
