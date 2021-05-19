package com.cubetiqs.relationshipapp.model

import javax.persistence.*

@Entity
@Table(name = "instructor")
data class Instructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_id")
    val id: Long?,

    @Column(name = "instructor_first_name")
    val firstName: String,

    @Column(name = "instructor_last_name")
    val lastName: String,

    @Column(name = "instructor_email")
    val email: String,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "instructor_detail_id")
    val instructorDetail: InstructorDetail
)
