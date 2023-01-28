package com.spinwellness.blog.dto

import com.spinwellness.admin.entities.AdminUser
import jakarta.validation.constraints.NotBlank
import java.util.*

data class PostDto(

    @get:NotBlank(message = "PostDto.title must be provided")
    val title: String,


    @get:NotBlank(message = "PostDto.role content be provided")
    val content: String,

    val imageUrl: String,

    @get:NotBlank(message = "PostDto.author must be provided")
    val author: AdminUser,
)
