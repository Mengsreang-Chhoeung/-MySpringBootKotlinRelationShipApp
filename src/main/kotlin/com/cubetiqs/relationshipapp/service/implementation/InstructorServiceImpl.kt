package com.cubetiqs.relationshipapp.service.implementation

import com.cubetiqs.relationshipapp.dao.InstructorDao
import com.cubetiqs.relationshipapp.exception.ResourceNotFound
import com.cubetiqs.relationshipapp.exception.SuccessException
import com.cubetiqs.relationshipapp.model.Instructor
import com.cubetiqs.relationshipapp.service.InstructorService
import org.springframework.stereotype.Service

@Service
class InstructorServiceImpl(private val instructorDao: InstructorDao) : InstructorService {
    override fun getAllInstructor(): MutableList<Instructor> = instructorDao.findAll()

    override fun getInstructorById(instructorId: Long): Instructor = instructorDao.findById(instructorId).orElseThrow{ResourceNotFound("Instructor Not Found!")}

    override fun createInstructor(instructor: Instructor): Instructor = instructorDao.save(instructor)

    override fun updateInstructor(instructorId: Long, instructor: Instructor): Instructor {
        return if(instructorDao.existsById(instructorId)){
            instructorDao.save(
                Instructor(
                    id = instructorId,
                    firstName = instructor.firstName,
                    lastName = instructor.lastName,
                    email = instructor.email,
                    instructorDetail = instructor.instructorDetail
                )
            )
        } else throw ResourceNotFound("Instructor Not Found!")
    }

    override fun deleteInstructor(instructorId: Long) {
        return if(instructorDao.existsById(instructorId)) {
            instructorDao.deleteById(instructorId)
            throw SuccessException("Delete Instructor Successfully!")
        } else throw ResourceNotFound("Instructor Not Found!")
    }
}