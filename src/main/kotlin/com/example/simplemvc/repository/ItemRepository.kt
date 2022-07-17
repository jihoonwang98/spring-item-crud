package com.example.simplemvc.repository

import com.example.simplemvc.domain.Item
import org.springframework.stereotype.Repository

@Repository
object ItemRepository {
    private val store: MutableMap<Long, Item> = HashMap()
    private var sequence: Long = 0L

    fun save(item: Item): Item {
        item.id = ++sequence
        store[sequence] = item
        return item
    }

    fun findById(id: Long): Item? {
        return store[id]
    }

    fun findAll(): List<Item> {
        return store.values.toList()
    }

    fun update(id: Long, item: Item) {
        val foundItem = findById(id) ?: throw IllegalStateException("item not found")
        foundItem.apply {
            name = item.name
            price = item.price
            quantity = item.quantity
        }.also {
            store[id] = it
        }
    }

    fun clearStore() {
        store.clear()
    }
}
