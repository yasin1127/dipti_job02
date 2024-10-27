package com.example.userregisterprofile_dipti_ict_amad_l4_04_11.viewmodel_dipti_ict_amad_l4_04_11

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.database_dipti_ict_amad_l4_04_11.UserDatabase_dipti_ict_amad_l4_04_11
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.model_dipti_ict_amad_l4_04_11.UserProfile_dipti_ict_amad_l4_04_11
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.repository_dipti_ict_amad_l4_04_11.UserProfileRepository_dipti_ict_amad_l4_04_11
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserProfileViewModel_dipti_ict_amad_l4_04_11 (application: Application) : AndroidViewModel(application) {
    private val repository: UserProfileRepository_dipti_ict_amad_l4_04_11

    init {
        val userProfileDao = UserDatabase_dipti_ict_amad_l4_04_11.getDatabase(application).userProfileDao()
        repository = UserProfileRepository_dipti_ict_amad_l4_04_11(userProfileDao)
    }

    fun getUserProfiles(): LiveData<List<UserProfile_dipti_ict_amad_l4_04_11>> {
        return repository.getUserProfiles()
    }

    fun insertUserProfile(userProfile: UserProfile_dipti_ict_amad_l4_04_11) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insert(userProfile)
        }
    }

    fun updateUserProfile(userProfile: UserProfile_dipti_ict_amad_l4_04_11) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.update(userProfile)
        }
    }

    fun deleteUserProfile(userProfile: UserProfile_dipti_ict_amad_l4_04_11) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.delete(userProfile)
        }
    }
}