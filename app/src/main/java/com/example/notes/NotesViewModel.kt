package com.example.notes

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class NotesViewModel : ViewModel() {
    val itemTextState = mutableStateOf("")
    val itemListState = mutableStateListOf<String>()

    fun addItem() {
        if (itemTextState.value.isNotEmpty()) {
            itemListState.add(itemTextState.value)
            itemTextState.value = ""
        }
    }

    fun removeItem(item: String) {
        itemListState.remove(item)
    }
}