package com.digimaster.personalprojectkotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.digimaster.personalprojectkotlin.R
import com.digimaster.personalprojectkotlin.adapter.NewsAdapter
import com.digimaster.personalprojectkotlin.model.News
import java.util.*

class Top_HeadlinesFragment : Fragment() {

    var view: View? = null
    private val swipeRefreshLayout: SwipeRefreshLayout? = null
    private val newsArrayList: ArrayList<News> = ArrayList<News>()
    private val mAdapter: NewsAdapter? = null
    private val recyclerView: RecyclerView? = null
    private val errorLayout: RelativeLayout? = null

    fun Top_HeadlinesFragment() {

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false)
    }
}