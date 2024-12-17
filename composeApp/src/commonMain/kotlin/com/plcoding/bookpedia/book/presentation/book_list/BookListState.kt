package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.core.presentation.UiText

// [KMP-2] MVI를 위한 State 생성
data class BookListState(
    val searchQuery : String = "Kotlin",
    val searchResults : List<Book> = emptyList(),
    val favoriteBooks : List<Book> = emptyList(),
    val isLoading : Boolean = false,
    // 선택된 탭의 인덱스(0,1)
    val selectedTabIndex : Int = 0,
    // 에러 상태
    val errorMessage : UiText? = null
)

val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test.com",
        authors = listOf("Author $it"),
        description = "Description $it",
        averageRating = 4.9393,
        languages = emptyList(),
        firstPublishYear = null,
        ratingCount = 5,
        numPages = 100,
        numEditions = 3
    )
}