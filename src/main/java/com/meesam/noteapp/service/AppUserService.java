package com.meesam.noteapp.service;

import com.meesam.noteapp.dto.AppUserRequest;
import com.meesam.noteapp.dto.AppUserResponse;
import com.meesam.noteapp.model.AppUser;
import com.meesam.noteapp.repository.AppUserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AppUserService {
    private final AppUserRepository appUserRepository;

    public AppUserResponse saveUser(AppUserRequest appUserRequest){
       AppUser appUser = new AppUser();
       appUser.setName(appUserRequest.name());
       appUser.setEmail(appUserRequest.email());
       appUser.setPassword(appUserRequest.password());
       appUser.setRole(appUserRequest.role());
      AppUser savedUser = appUserRepository.save(appUser);
      return new AppUserResponse(
              savedUser.getId(),
              savedUser.getEmail(),
              savedUser.getName(),
              savedUser.getRole(),
              savedUser.getCreatedBy(),
              savedUser.getLastModifiedBy(),
              savedUser.getCreatedAt(),
              savedUser.getUpdatedAt()
      );
    }

    public Optional<AppUser> findByEmail(String email){
        return appUserRepository.findByEmail(email);
    }

}
