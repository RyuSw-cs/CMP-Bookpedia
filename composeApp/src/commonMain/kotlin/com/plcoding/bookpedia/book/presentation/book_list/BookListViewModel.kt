package com.plcoding.bookpedia.book.presentation.book_list

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

// [KMP-4] 뷰모델 생성
class BookListViewModel : ViewModel() {
    private val _state = MutableStateFlow(BookListState())
    // UI에서 상태를 직접적으로 변경하지 못하도록 StateFlow로 변경
    val state = _state.asStateFlow()

    // [KMP-5] 정의한 Action을 처리할 메소드 생성
    fun onAction(action : BookListAction){
        when(action){
            is BookListAction.OnBookClick -> {

            }
            is BookListAction.OnSearchQueryChange -> {
                // [KMP-6] 중복 데이터를 방지하기 위해 update 사용
                _state.update {
                   it.copy(searchQuery = action.query)
                }
            }
            is BookListAction.OnTabSelected -> {
                _state.update {
                    it.copy(selectedTabIndex = action.index)
                }
            }
        }
    }
}