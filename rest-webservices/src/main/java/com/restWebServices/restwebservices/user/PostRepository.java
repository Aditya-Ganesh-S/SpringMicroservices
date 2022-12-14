package com.restWebServices.restwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface PostRepository extends JpaRepository<Post, Integer> {
}
