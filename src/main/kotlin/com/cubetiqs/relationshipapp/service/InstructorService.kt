package com.cubetiqs.relationshipapp.service

import com.cubetiqs.relationshipapp.model.Instructor

interface InstructorService {
    fun getAllInstructor(): MutableList<Instructor>
    fun getInstructorById(instructorId: Long): Instructor
    fun createInstructor(instructor: Instructor): Instructor
    fun updateInstructor(instructorId: Long, instructor: Instructor): Instructor
    fun deleteInstructor(instructorId: Long)
}