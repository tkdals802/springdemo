package com.example.springdemo.service;


import com.example.springdemo.dto.GetResponseDto;
import com.example.springdemo.dto.PostsSaveRequestDto;
import com.example.springdemo.model.User;
import com.example.springdemo.model.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return userRepository.save(requestDto.toEntity()).getId();
    }

    public GetResponseDto findById(Long id){
        User entity = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다.id = "+id));
        return new GetResponseDto(entity);
    }




}
