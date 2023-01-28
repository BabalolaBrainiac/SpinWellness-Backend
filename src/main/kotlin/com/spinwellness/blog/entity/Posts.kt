package com.spinwellness.blog.entity

import com.spinwellness.admin.entities.AdminUser
import jakarta.persistence.*
import org.jetbrains.annotations.NotNull
import java.util.Date


@Entity
@Table(name = "posts")
data class Posts(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    val id: Long? = null,

    @NotNull
    val title: String = "",
    val content: String = "",
    val imageUrl: String = "",
    val created: Date = Date(),
    var categories: String? = "",
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_user_id", nullable = true)
    var createdBy: AdminUser? = null
)
