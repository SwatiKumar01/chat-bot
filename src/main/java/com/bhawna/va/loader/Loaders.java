package com.bhawna.va.loader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bhawna.va.dto.Users;
import com.bhawna.va.repository.UsersRepository;

@Component
public class Loaders {

    @Autowired
    ElasticsearchOperations operations;

    @Autowired
    UsersRepository usersRepository;

    @Transactional
//    @PostConstruct //
    public void loadAll( String query, String vAresponse){

        operations.putMapping(Users.class);
    
        usersRepository.save(getData(query,vAresponse));
     
    }


    
    private List<Users> getData(String query, String vAresponse) {
    	long leftLimit = 1L;
    	long rightLimit = 1000000000000000000L;
    	long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
    	List<Users> userses = new ArrayList<>();
        userses.add(new Users(query,vAresponse,generatedLong));

        return userses;
    }
}
