package com.example.compose_practice.viewmodel.plus

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PlusViewModel :ViewModel() {
    private val _thinkCards = MutableStateFlow<List<String>>(emptyList())
    val thinkCards: StateFlow<List<String>> = _thinkCards

    init {
        fetchThinkCards()
    }

    private fun fetchThinkCards() {
        viewModelScope.launch {
            val dummyData = listOf(
                "테슬라의 기술 혁신",
                "테슬라의 전기차 발명",
                "테슬라의 기술 혁신",
                "테슬라의 기술 혁신"
            )

            _thinkCards.value = dummyData
        }
    }
}