package com.wkang.www.springtest.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    @Autowired
    private DogRepository dogRepository;


    public String addTwoDogs(){
        return dogRepository.findAll().toString();
    }
}
