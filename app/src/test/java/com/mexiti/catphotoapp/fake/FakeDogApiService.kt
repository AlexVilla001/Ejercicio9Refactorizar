package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.model.DogPhoto
import com.mexiti.catphotoapp.network.DogApiService

class FakeDogApiService: DogApiService {
    override suspend fun getPhotos(): List<DogPhoto> {
        return FakeDataSource.photoList
    }
}