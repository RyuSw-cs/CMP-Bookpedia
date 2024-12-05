package com.plcoding.bookpedia.book.presentation.book_list

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.plcoding.bookpedia.book.domain.Book
import org.koin.compose.viewmodel.koinViewModel


// [KMP-8] 스크린에 표시할 루트 Composable 생성
@Composable
fun BookListScreenRoot(
    viewModel: BookListViewModel = koinViewModel(),
    onBookClick : (Book) -> Unit,
    modifier: Modifier = Modifier
) {
    // 지정한 LifeCycle에서만 데이터를 수집하도록 설정
    // default = Lifecycle.State.STARTED
    // 데이터가 업데이트 되면 리컴포지션 발생
    val state by viewModel.state.collectAsStateWithLifecycle()

    BookListScreen(
        state = state,
        // ::은 런타임 시점에서 검사하도록 설정
        onAction = { action ->
            when(action){
                is BookListAction.OnBookClick -> onBookClick(action.book)
                else -> Unit
            }
            viewModel.onAction(action)
        }
    )
}

// [KMP-7] 화면에 표시할 스크린 생성
@Composable
private fun BookListScreen(
    // 왜 필요 없을까?
    state : BookListState,
    onAction : (BookListAction) -> Unit
) {

}
