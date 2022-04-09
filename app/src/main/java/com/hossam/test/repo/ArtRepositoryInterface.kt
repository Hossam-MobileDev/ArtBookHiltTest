package com.hossam.test.repo

import androidx.lifecycle.LiveData
import com.hossam.test.model.ImageResponse
import com.hossam.test.roomdb.Art
import com.hossam.test.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art : Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString : String) : Resource<ImageResponse>

}