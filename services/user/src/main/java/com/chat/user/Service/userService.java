package com.chat.user.Service;

import com.chat.user.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {

    UserRepo userRepo;

    @Autowired
    userService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


}
