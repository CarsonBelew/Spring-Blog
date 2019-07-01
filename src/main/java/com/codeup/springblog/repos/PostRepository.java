package com.codeup.springblog.repos;

import com.codeup.springblog.model.Post;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}