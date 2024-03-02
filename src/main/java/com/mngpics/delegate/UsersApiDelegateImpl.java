package com.mngpics.delegate;

import com.mngpics.api.UsersApiDelegate;
import com.mngpics.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsersApiDelegateImpl implements UsersApiDelegate {

    @Override
    public ResponseEntity<List<User>> getUsers(String correlationId) {

        List<User> users = List.of(new User("abc","abc@email.com", "fn","ln"));

        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> createUser(String correlationId, User user) {

        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
