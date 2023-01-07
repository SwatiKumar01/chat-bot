package com.bhawna.va.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhawna.va.dto.Users;
import com.bhawna.va.repository.UsersRepository;

@RestController
@RequestMapping("/rest/search")
public class SearchResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/message/{text}")
    public List<Users> searchName(@PathVariable final String text) {
        return usersRepository.findByMessages(text);
    }


    @GetMapping(value = "/all")
    public List<Users> searchAll() {
        List<Users> usersList = new ArrayList<>();
        Iterable<Users> userses = usersRepository.findAll();
        userses.forEach(usersList::add);
        return usersList;
    }


}
