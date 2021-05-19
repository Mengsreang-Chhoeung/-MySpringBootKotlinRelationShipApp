package com.cubetiqs.relationshipapp.model

import javax.persistence.*

@Entity
@Table(name = "instructor_detail")
data class InstructorDetail(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_detail_id")
    val id: Long?,

    @Column(name = "youtube_channel")
    val youtubeChannel: String,

    @Column(name = "hobby")
    val hobby: String,
)
