package com.cubetiqs.relationshipapp.dao

import com.cubetiqs.relationshipapp.model.InstructorDetail
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface InstructorDetailDao : JpaRepository<InstructorDetail, Long>