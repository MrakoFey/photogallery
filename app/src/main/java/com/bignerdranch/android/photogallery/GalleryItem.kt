package com.bignerdranch.android.photogallery

import com.google.gson.annotations.SerializedName

data class GalleryItem (
    var ispublic: String = "",
    var id: String = "",
    @SerializedName("url_s") var url: String = ""
)
