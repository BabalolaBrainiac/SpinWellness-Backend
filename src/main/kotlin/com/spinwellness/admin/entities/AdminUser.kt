package com.spinwellness.admin.entities

import com.spinwellness.admin.enums.AdminUserRole
import com.spinwellness.blog.entity.Posts
import jakarta.persistence.*


@Entity
@Table(name = "admin_users")
data class AdminUser(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    val id: Long? = null,
    var firstName: String = "",
    var lastName: String = "",
    var email: String = "",
    var password: String = "",
    var role: AdminUserRole = AdminUserRole.BASIC_USER,
    @OneToMany(
        mappedBy = "createdBy",
        cascade = [CascadeType.ALL],
        orphanRemoval = true
    )
    var blogPosts: List<Posts> = mutableListOf()
)