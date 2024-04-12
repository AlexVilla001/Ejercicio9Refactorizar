package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.fake.rules.TestDispatcherRule
import com.mexiti.catphotoapp.viewmodel.DogUiState
import com.mexiti.catphotoapp.viewmodel.DogViewModel
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test

class DogViewModelTest {
    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun dogViewModel_getDogPhotos_verifyDogUIStateSuccess(){
        runTest {
            val dogViewModel = DogViewModel(
                dogPhotoRepository = FakeNetworkDogRepository()
            )
            assertEquals(DogUiState.Success(FakeDataSource.photoList),dogViewModel.dogUiState)
        }

    }
}