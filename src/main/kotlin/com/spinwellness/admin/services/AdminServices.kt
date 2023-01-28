package com.spinwellness.admin.services

import com.spinwellness.admin.dtos.AdminUserDto
import com.spinwellness.admin.entities.AdminUser
import com.spinwellness.admin.repository.AdminUserRepository
import mu.KLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service


@Service
class AdminServices(val adminUserRepository: AdminUserRepository) {

    companion object: KLogging()

    @Value("\${spring.message}")
    lateinit var message: String

    fun testImplementation(status: String) = "Spinwellness and Yoga Backend Services is $status, $message"

    fun createNewAdminUser(createAdminDto: AdminUserDto): AdminUserDto {
        var newAdmin = createAdminDto.let {
            AdminUser(null, it.firstName, it.lastName, it.email, it.password)
        }
        adminUserRepository.save(newAdmin);

        logger.info("New Admin User Saved $newAdmin")

        return newAdmin.let {
            AdminUserDto(it.id, it.firstName, it.lastName, it.email, it.password, it.role, it.blogPosts)
        }
    }

    fun getAllAdminUser(): List<AdminUserDto> {

        logger.info("fetching all users")
        return adminUserRepository.findAll()
            .map {
                AdminUserDto(it.id, it.lastName, it.firstName, it.email, it.password, it.role, it.blogPosts);
            }
    }

    fun getAdminUserById() {
        return
    }
}