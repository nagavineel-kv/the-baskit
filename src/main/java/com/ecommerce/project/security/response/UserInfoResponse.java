package com.ecommerce.project.security.response;

import java.util.List;

public class UserInfoResponse {
    private Long id;
    private String jwtToken;

    private String username;
    private List<String> role;

    public UserInfoResponse(Long id, String jwtToken, String username, List<String> role) {
        this.id = id;
        this.jwtToken = jwtToken;
        this.username = username;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
