package com.cubetiqs.relationshipapp.controller

import com.cubetiqs.relationshipapp.model.Instructor
import com.cubetiqs.relationshipapp.service.InstructorService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/instructor")
class InstructorController(private val instructorService: InstructorService) {
    @GetMapping
    fun getAllInstructor(): MutableList<Instructor> = instructorService.getAllInstructor()

    @GetMapping("/{id}")
    fun getInstructorById(@PathVariable("id") instructorId: Long): Instructor = instructorService.getInstructorById(instructorId)

    @PostMapping
    fun createInstructor(@RequestBody instructor: Instructor): Instructor = instructorService.createInstructor(instructor)

    @PutMapping("/{id}")
    fun updateInstructor(@PathVariable("id") instructorId: Long, @RequestBody instructor: Instructor): Instructor = instructorService.updateInstructor(instructorId, instructor)

    @DeleteMapping("/{id}")
    fun deleteInstructor(@PathVariable("id") instructorId: Long): Unit = instructorService.deleteInstructor(instructorId)
}