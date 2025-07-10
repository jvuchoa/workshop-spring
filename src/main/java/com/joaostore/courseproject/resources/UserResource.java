package com.joaostore.courseproject.resources;

import com.joaostore.courseproject.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Joao","joao@gmail.com","83999887766","g0825");
        return ResponseEntity.ok().body(u);
    }
}
