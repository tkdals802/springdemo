package com.example.springdemo.dto;

import com.example.springdemo.model.Role;
import com.example.springdemo.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GetResponseDto {
    private Long id;
    private String name;
    private String email;
    private String picture;
    private Role role;

    public GetResponseDto(User entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.picture = entity.getPicture();
        this.role = entity.getRole();
    }
}


