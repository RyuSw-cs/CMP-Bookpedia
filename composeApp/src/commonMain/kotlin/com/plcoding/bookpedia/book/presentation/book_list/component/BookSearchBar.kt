package com.plcoding.bookpedia.book.presentation.book_list.component

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.room.util.appendPlaceholders
import cmp_bookpedia.composeapp.generated.resources.Res
import cmp_bookpedia.composeapp.generated.resources.search_hint
import com.plcoding.bookpedia.core.presentation.DarkBlue
import com.plcoding.bookpedia.core.presentation.SandYellow
import org.jetbrains.compose.resources.stringResource

// [KMP-9] 컴포넌트 생성
@Composable
fun BookSearchbar(
    searchQuery : String,
    onSearchQueryChange : (String) -> Unit,
    onImeSearch : () -> Unit,
    modifier: Modifier = Modifier
) {
    // outline이 그려져있는 text fied
    OutlinedTextField(
        // textField에 들어가있는 값
        value = searchQuery,
        // 값이 변화될때 실행되는 리스너
        onValueChange = onSearchQueryChange,
        // corner radius
        shape = RoundedCornerShape(100),
        // 내부 색상 값
        colors = TextFieldDefaults.outlinedTextFieldColors(
            // 커서
            cursorColor = DarkBlue,
            // 포커스 시 포더 색상
            focusedBorderColor = SandYellow
        ),
        //
        placeholder = {
            Text(
                // [KMP-11] 리소스를 가져온 후 build를 해야함
                text = stringResource(Res.string.search_hint)
            )
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = MaterialTheme.colors.
            )
        }
    )

}