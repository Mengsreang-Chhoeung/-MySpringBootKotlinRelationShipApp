package com.cubetiqs.relationshipapp.dao

import com.cubetiqs.relationshipapp.model.Instructor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface InstructorDao : JpaRepository<Instructor, Long>