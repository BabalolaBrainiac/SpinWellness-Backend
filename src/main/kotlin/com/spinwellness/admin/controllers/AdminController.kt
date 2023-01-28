package com.spinwellness.admin.controllers

import com.spinwellness.admin.dtos.AdminUserDto
import com.spinwellness.admin.entities.AdminUser
import com.spinwellness.admin.services.AdminServices
import mu.KLogging
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/admin")
class AdminController(val adminServices: AdminServices) {

    companion object: KLogging()

    @PostMapping("/{status}")
    fun TestAPI(@PathVariable("status") status: String): String {

        logger.info("Application works")
        return adminServices.testImplementation(status)
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    fun createNewUser(@RequestBody adminUserDto: AdminUserDto): AdminUserDto {

        logger.info("User created")
        return adminServices.createNewAdminUser(adminUserDto)
    }

    @GetMapping("/")
    fun getAllAdminUsers(): List<AdminUserDto> = adminServices.getAllAdminUser();
}