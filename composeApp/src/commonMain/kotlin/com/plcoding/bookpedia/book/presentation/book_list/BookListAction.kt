package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book

// [KMP-3] 실제 사용자의 액션을 정의
// 화면에서 이뤄지는 모든 액션을 정의해야함 (tab 선택까지..)
sealed interface BookListAction {
    data class OnSearchQueryChange(val query : String) : BookListAction
    data class OnBookClick(val book : Book) : BookListAction
    data class OnTabSelected(val index : Int) : BookListAction
}