package com.spinwellness.blog.repositories

import com.spinwellness.blog.entity.Posts
import org.springframework.data.repository.CrudRepository

interface PostRepository: CrudRepository<Posts, Long> {
}