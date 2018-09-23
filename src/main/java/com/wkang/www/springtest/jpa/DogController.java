package com.wkang.www.springtest.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DogController {
    @Autowired
    private DogRepository dogRepository;
    @Autowired
    private DogService dogService;

    /**
     * 查询所有女生列表
     * @return
     */
    @GetMapping(value="/dogs")
    public List<Dog> dogList(){
        return dogRepository.findAll();//findAll()方法是底层帮我没实现好的
    }

    @GetMapping(value="/dogs/{id}")
    public Optional<Dog> findDogById(@PathVariable("id") Integer id){
        return dogRepository.findById(id);//注意这个方法的返回值
    }

    @GetMapping(value = "/dogs/tx")
    public String txTest(){
        return dogService.addTwoDogs();
    }

}
