package com.meesam.noteapp.controller;

import com.meesam.noteapp.dto.AppUserRequest;
import com.meesam.noteapp.dto.AppUserResponse;
import com.meesam.noteapp.model.AppUser;
import com.meesam.noteapp.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class AppUserController {
  private final AppUserService appUserService;

  @PostMapping("/add")
  public ResponseEntity<AppUserResponse> save(@RequestBody AppUserRequest appUserRequest) {
      return new ResponseEntity<>(appUserService.saveUser(appUserRequest), HttpStatus.CREATED);
  }

  @GetMapping("/getall")
  public ResponseEntity<List<AppUserResponse>> getAll() {

  }
}
