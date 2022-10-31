package com.example.springjpa.service;

import com.example.springjpa.model.entity.Profile;
import com.example.springjpa.model.entity.User;
import com.example.springjpa.model.request.ProfileRequest;
import com.example.springjpa.model.request.UserRequest;
import com.example.springjpa.model.response.UploadFileResponse;
import org.springframework.web.multipart.MultipartFile;


import java.util.List;

public interface IProfileService {
    Profile getAccount(Long id);

    List<Profile> getAll();

    List<User> getAlll();

    Profile create(ProfileRequest request);

    User cre(UserRequest userRequest);

    UploadFileResponse upload(MultipartFile file, Long id) throws  Exception;



}
