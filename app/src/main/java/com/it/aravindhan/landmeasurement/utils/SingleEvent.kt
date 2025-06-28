package com.it.aravindhan.landmeasurement.utils

open class SingleEvent<out T>(private val content: T) {
    var hasBeenHandled = false
    fun contentIfNotHandled():T?{
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }
}