package com.example.simplemvc.domain

data class Item(
    var name: String,
    var price: Int,
    var quantity: Int,
) {
    var id: Long? = null
}
