package com.mngpics.delegate;

import com.mngpics.api.UsersApiDelegate;
import com.mngpics.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserApiDelegateImpl implements UsersApiDelegate {

    @Override
    public ResponseEntity<List<User>> getUsers(String correlationId) {

        List<User> users = List.of(new User("mockUsername", "mock@mail.com", "mockFN", "mockLn"));
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
