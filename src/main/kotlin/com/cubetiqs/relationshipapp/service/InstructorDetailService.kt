package com.cubetiqs.relationshipapp.service

import com.cubetiqs.relationshipapp.model.InstructorDetail

interface InstructorDetailService {
    fun getAllInstructorDetail(): MutableList<InstructorDetail>
    fun getInstructorDetailById(instructorDetailId: Long): InstructorDetail
    fun createInstructorDetail(instructorDetail: InstructorDetail): InstructorDetail
    fun updateInstructorDetail(instructorDetailId: Long, instructorDetail: InstructorDetail): InstructorDetail
    fun deleteInstructorDetail(instructorDetailId: Long)
}