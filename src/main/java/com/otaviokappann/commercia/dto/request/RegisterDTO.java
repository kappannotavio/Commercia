package com.otaviokappann.commercia.dto.request;

import com.otaviokappann.commercia.enums.Role;

public record RegisterDTO(String email, String password, Role role) {
}
