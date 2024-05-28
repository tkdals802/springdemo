package com.example.springdemo.dto;


import com.example.springdemo.model.Role;
import com.example.springdemo.model.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String name;
    private String email;
    private String picture;
    private Role role;

    @Builder
    public PostsSaveRequestDto(String name, String email, String picture, Role role) {
        this.name = name;
        this.email = email;
        this.picture = picture;
        this.role = role;
    }

    public User toEntity(){
        return User.builder()
                .name(name)
                .email(email)
                .picture(picture)
                .role(role)
                .build();
    }


}
