package com.spinwellness.admin.repository

import com.spinwellness.admin.entities.AdminUser
import org.springframework.data.repository.CrudRepository

interface AdminUserRepository: CrudRepository<AdminUser, Long> {

    fun findByFirstNameIgnoreCaseOrLastNameIgnoreCase(firstName: String, lastName: String): List<AdminUser>

    fun findByEmail(email: String): AdminUser

    fun findByEmailOrderByEmailDesc(email: String): List<AdminUser>

}