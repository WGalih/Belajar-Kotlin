package com.digimaster.personalprojectkotlin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class News {
    @SerializedName("title")
    @Expose
    private var mTitle: String? = null

    @SerializedName("author")
    @Expose
    private var mAuthor: String? = null

    @SerializedName("url")
    @Expose
    private var mUrl: String? = null

    @SerializedName("urlToImage")
    @Expose
    private var mUrlToImage: String? = null

    @SerializedName("description")
    @Expose
    private var description: String? = null

    @SerializedName("source")
    @Expose
    private var source: Source? = null

    @SerializedName("publishedAt")
    @Expose
    private var publishedAt: String? = null

    val NEWS_IMAGE_TYPE = 0
    val NEWS_WITHOUT_IMAGE_TYPE = 1
    private var type = 0

    fun News(mTitle: String?, mUrl: String?, mUrlToImage: String?, type: Int) {
        this.mTitle = mTitle
        this.mUrl = mUrl
        this.mUrlToImage = mUrlToImage
        this.type = type
    }

    fun getType(): Int {
        return if (mUrlToImage == null) {
            NEWS_WITHOUT_IMAGE_TYPE
        } else {
            NEWS_IMAGE_TYPE
        }
    }

    fun getTitle(): String? {
        return mTitle!!.replace("/<(.*?)\\>", "")
    }


    fun getUrlToImage(): String? {
        return if (mUrlToImage == "") {
            null.also { mUrlToImage = it }
        } else {
            mUrlToImage
        }
    }
}