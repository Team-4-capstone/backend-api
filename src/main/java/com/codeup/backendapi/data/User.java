package com.codeup.backendapi.data;

import javax.persistence.Entity;
import java.time.LocalDateTime;

public class User {
    @Entity

    private long id;
    private String username;
    private String email;
    private String password;
    private LocalDateTime createdAt;
    private Role role;


    public enum Role {USER, ADMIN};


}
