package com.digimaster.personalprojectkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.digimaster.personalprojectkotlin.R
import com.digimaster.personalprojectkotlin.model.*

class NewsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var newsList: List<News>? = null

    fun NewsAdapter(newsList: List<News?>?) {
        this.newsList = newsList as List<News>?
    }

    @NonNull
    override fun onCreateViewHolder(@NonNull viewGroup: ViewGroup, i: Int): RecyclerView.ViewHolder {

    }

    override fun onBindViewHolder(@NonNull viewHolder: RecyclerView.ViewHolder, i: Int) {

    }

    override fun getItemCount(): Int {
        return newsList!!.size
    }

    class NewsWithImageViewHolder(@NonNull itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tv_news_with_image_item: TextView
        var desc: TextView
        var source: TextView
        var time: TextView
        var published_at: TextView
        var author: TextView
        var iv_news: ImageView

        init {
            tv_news_with_image_item = itemView.findViewById(R.id.title)
            iv_news = itemView.findViewById(R.id.urlToImage)
            desc = itemView.findViewById(R.id.desc)
            source = itemView.findViewById(R.id.source)
            author = itemView.findViewById(R.id.author)
            time = itemView.findViewById(R.id.time)
            published_at = itemView.findViewById(R.id.publishedAt)
        }
    }
}