package com.wahyu.biosisko.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.wahyu.biosisko.model.Message
import kotlinx.android.synthetic.main.item_message.view.*

class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindMessage(message: Message?) {
        with(message!!) {
            itemView.tvAuthorItem.text = author
            itemView.tvTimeItem.text = time
            itemView.tvBodyItem.text = body
        }
    }
}
