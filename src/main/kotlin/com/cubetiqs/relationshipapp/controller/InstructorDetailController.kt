package com.cubetiqs.relationshipapp.controller

import com.cubetiqs.relationshipapp.model.InstructorDetail
import com.cubetiqs.relationshipapp.service.InstructorDetailService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/instructor-detail")
class InstructorDetailController(private val instructorDetailService: InstructorDetailService) {
    @GetMapping
    fun getAllInstructorDetail() = instructorDetailService.getAllInstructorDetail()

    @GetMapping("/{id}")
    fun getInstructorDetailById(@PathVariable("id") instructorDetailId: Long) = instructorDetailService.getInstructorDetailById(instructorDetailId)

    @PostMapping
    fun createInstructorDetail(@RequestBody instructorDetail: InstructorDetail) = instructorDetailService.createInstructorDetail(instructorDetail)

    @PutMapping("/{id}")
    fun updateInstructorDetail(@PathVariable("id") instructorDetailId: Long, instructorDetail: InstructorDetail) = instructorDetailService.updateInstructorDetail(instructorDetailId, instructorDetail)

    @DeleteMapping("/{id}")
    fun deleteInstructorDetail(@PathVariable("id") instructorDetailId: Long) = instructorDetailService.deleteInstructorDetail(instructorDetailId)
}