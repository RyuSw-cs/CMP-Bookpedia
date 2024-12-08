package com.plcoding.bookpedia.core.presentation

import androidx.compose.runtime.Composable
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource

sealed interface UiText {
    // 동적 문자열을 만들 수 있는 클래스
    data class DynamicString(val value: String): UiText
    // 문자열 리소스를 통해 문자를 표시할 수 있는 클래스
    class StringResourceId(
        val id: StringResource,
        val args: Array<Any> = arrayOf()
    ): UiText

    // 컴포즈로 표시
    @Composable
    fun asString(): String {
        return when(this) {
            is DynamicString -> value
            is StringResourceId -> stringResource(resource = id, formatArgs = args)
        }
    }
}