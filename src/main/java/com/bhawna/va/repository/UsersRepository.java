package com.bhawna.va.repository;


import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.bhawna.va.dto.Users;

public interface UsersRepository extends ElasticsearchRepository<Users, Long> {
    List<Users> findByMessages(String text);

    
}
