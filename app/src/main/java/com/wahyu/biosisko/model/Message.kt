package com.wahyu.biosisko.model

import com.google.firebase.database.IgnoreExtraProperties
import com.google.firebase.database.Exclude

@IgnoreExtraProperties
class Message {

    var author: String? = ""
    var body: String? = ""
    var time: String? = ""

    constructor() {
        // Default constructor required for calls to DataSnapshot.getValue(Message.class)
    }

    constructor(author: String, body: String, time: String) {
        this.author = author
        this.body = body
        this.time = time
    }

    @Exclude
    fun toMap(): Map<String, Any> {
        val result = HashMap<String, Any>()
        result.put("author", author!!)
        result.put("body", body!!)
        result.put("time", time!!)

        return result
    }
}