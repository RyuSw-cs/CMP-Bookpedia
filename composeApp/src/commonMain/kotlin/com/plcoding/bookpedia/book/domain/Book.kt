package com.plcoding.bookpedia.book.domain

// [KMP-1] 도메인 모델 생성
data class Book (
    val id : String,
    val title : String,
    val imageUrl : String,
    val authors : List<String>,
    val description : String?,
    val languages : List<String>,
    val firstPublishYear : String?,
    val averageRating : Double?,
    val ratingCount : Int?,
    val numPages: Int?,
    val numEditions : Int
)