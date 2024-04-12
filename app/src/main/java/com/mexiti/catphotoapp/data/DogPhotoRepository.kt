/*package com.mexiti.catphotoapp.data

import com.mexiti.catphotoapp.model.DogPhoto


interface  DogPhotoRepository{
    suspend fun getDogPhotos(): List<DogPhoto>
}
class NetworkDogPhotoRepository : DogPhotoRepository {
    override suspend fun getDogPhotos(): List<DogPhoto> {
        return

    }
}*/
import com.mexiti.catphotoapp.model.DogPhoto
import com.mexiti.catphotoapp.network.DogApiService
import retrofit2.Retrofit
import retrofit2.http.GET

interface DogPhotoRepository {
    @GET("dogs/photos")
    suspend fun getDogPhotos(): List<DogPhoto>
}

class NetworkDogPhotoRepository(private val dogPhotoApi: DogApiService) : DogPhotoRepository {
    override suspend fun getDogPhotos(): List<DogPhoto> {
        return dogPhotoApi.getPhotos()
    }
}
