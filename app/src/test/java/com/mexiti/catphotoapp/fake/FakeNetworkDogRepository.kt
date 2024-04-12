package com.mexiti.catphotoapp.fake

import DogPhotoRepository
import com.mexiti.catphotoapp.model.DogPhoto

class FakeNetworkDogRepository: DogPhotoRepository{
    override suspend fun getDogPhotos(): List<DogPhoto> {
        return FakeDataSource.photoList
    }

}