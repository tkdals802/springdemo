package com.example.springdemo.controller;


import com.example.springdemo.dto.GetResponseDto;
import com.example.springdemo.dto.PostsSaveRequestDto;
import com.example.springdemo.model.UserRepository;
import com.example.springdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/posts/save")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return userService.save(requestDto);
    }

    @GetMapping("/get/id/{id}")
    public GetResponseDto findById(@PathVariable Long id){
        return userService.findById(id);
    }

}
