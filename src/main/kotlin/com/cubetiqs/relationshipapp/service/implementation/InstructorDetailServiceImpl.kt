package com.cubetiqs.relationshipapp.service.implementation

import com.cubetiqs.relationshipapp.dao.InstructorDetailDao
import com.cubetiqs.relationshipapp.exception.ResourceNotFound
import com.cubetiqs.relationshipapp.exception.SuccessException
import com.cubetiqs.relationshipapp.model.InstructorDetail
import com.cubetiqs.relationshipapp.service.InstructorDetailService
import org.springframework.stereotype.Service

@Service
class InstructorDetailServiceImpl(private val instructorDetailDao: InstructorDetailDao) : InstructorDetailService {
    override fun getAllInstructorDetail(): MutableList<InstructorDetail> = instructorDetailDao.findAll()

    override fun getInstructorDetailById(instructorDetailId: Long): InstructorDetail = instructorDetailDao.findById(instructorDetailId).orElseThrow{ResourceNotFound("Instructor Detail Not Found!")}

    override fun createInstructorDetail(instructorDetail: InstructorDetail): InstructorDetail = instructorDetailDao.save(instructorDetail)

    override fun updateInstructorDetail(
        instructorDetailId: Long,
        instructorDetail: InstructorDetail
    ): InstructorDetail {
        return if(instructorDetailDao.existsById(instructorDetailId)) {
            instructorDetailDao.save(
                InstructorDetail(
                    id = instructorDetailId,
                    youtubeChannel = instructorDetail.youtubeChannel,
                    hobby = instructorDetail.hobby
                )
            )
        } else throw ResourceNotFound("Instructor Detail Not Found!")
    }

    override fun deleteInstructorDetail(instructorDetailId: Long) {
        return if(instructorDetailDao.existsById(instructorDetailId)) {
            instructorDetailDao.deleteById(instructorDetailId)
            throw SuccessException("Delete Instructor Detail Successfully!")
        } else throw ResourceNotFound("Instructor Detail Not Found!")
    }
}