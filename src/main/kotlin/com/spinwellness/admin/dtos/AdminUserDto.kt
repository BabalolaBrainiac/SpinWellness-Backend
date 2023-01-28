package com.spinwellness.admin.dtos

import com.spinwellness.admin.enums.AdminUserRole
import com.spinwellness.blog.entity.Posts
import jakarta.annotation.Nullable
import jakarta.validation.constraints.NotBlank

data class AdminUserDto(
    val id: Long?,

    @get:NotBlank(message = "AdminUserDto.firstName must be provided")
    val firstName: String,

    @get:NotBlank(message = "AdminUserDto.lastName must be provided")
    val lastName: String,

    @get:NotBlank(message = "AdminUserDto.email must be provided")
    val email: String,

    @get:NotBlank(message = "AdminUserDto.password must be provided")
    val password: String,

    @get:NotBlank(message = "AdminUserDto.role must be provided")
    val role: AdminUserRole,

    @get:Nullable()
    var post: List<Posts>?
)