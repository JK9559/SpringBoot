package com.wkang.www.springtest.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog,Integer> {
}
