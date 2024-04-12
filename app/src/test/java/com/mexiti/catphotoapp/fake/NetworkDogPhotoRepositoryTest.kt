package com.mexiti.catphotoapp.fake

import NetworkDogPhotoRepository
import com.mexiti.catphotoapp.network.DogApiService
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test

class NetworkDogPhotoRepositoryTest {
    @Test
    fun NetworkDogPhotoRepository_getDogPhotos_verifyPhotoList(){
        runTest {
            val repository = NetworkDogPhotoRepository(
                dogPhotoApi = FakeDogApiService()
            )
            assertEquals(FakeDataSource.photoList,repository.getDogPhotos())
        }
    }
}