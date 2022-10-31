package com.example.springjpa.controller;

import com.example.springjpa.model.entity.Profile;
import com.example.springjpa.model.entity.User;
import com.example.springjpa.model.request.ProfileRequest;
import com.example.springjpa.model.request.UserRequest;
import com.example.springjpa.model.response.AccountResponse;
import com.example.springjpa.model.response.UploadFileResponse;
import com.example.springjpa.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("accounts")
public class AccountController {
    @Autowired
    private IProfileService service;

    @GetMapping("/all")
    ResponseEntity<List<Profile>> getAll() {
        List<Profile> accounts = service.getAll();
        return ResponseEntity.ok(accounts);
    }
    @GetMapping("/alll")
    ResponseEntity<List<User>> getAlll() {
        List<User> users = service.getAlll();
        return ResponseEntity.ok(users);
    }
    @PostMapping("/profile/create")
    ResponseEntity<Profile> create(@RequestBody ProfileRequest request) {
        Profile profile = service.create(request);
        return ResponseEntity.ok(profile);
    }
    @PostMapping("/user/cre")
    ResponseEntity<User> cre(@RequestBody UserRequest userRequest) {
        User user = service.cre(userRequest);
        return ResponseEntity.ok(user);
    }
    @PostMapping("/up/{id}")
    public ResponseEntity<UploadFileResponse> upload(@RequestParam("file") MultipartFile file, @PathVariable(name = "id") Long id) throws Exception {
        return ResponseEntity.ok(service.upload(file, id));
    }
}
