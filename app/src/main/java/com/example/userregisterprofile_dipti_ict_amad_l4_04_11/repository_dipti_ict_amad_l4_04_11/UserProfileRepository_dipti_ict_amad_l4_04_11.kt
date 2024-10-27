package com.example.userregisterprofile_dipti_ict_amad_l4_04_11.repository_dipti_ict_amad_l4_04_11



import androidx.lifecycle.LiveData
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.dao_dipti_ict_amad_l4_04_11.UserProfileDao_dipti_ict_amad_l4_04_11
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.model_dipti_ict_amad_l4_04_11.UserProfile_dipti_ict_amad_l4_04_11


class UserProfileRepository_dipti_ict_amad_l4_04_11 (private val userProfileDao: UserProfileDao_dipti_ict_amad_l4_04_11) {
    fun getUserProfiles(): LiveData<List<UserProfile_dipti_ict_amad_l4_04_11>> {
        return userProfileDao.getAllUserProfiles()
    }

    suspend fun insert(userProfile: UserProfile_dipti_ict_amad_l4_04_11) {
        userProfileDao.insert(userProfile)
    }

    suspend fun update(userProfile: UserProfile_dipti_ict_amad_l4_04_11) {
        userProfileDao.update(userProfile)
    }

    suspend fun delete(userProfile: UserProfile_dipti_ict_amad_l4_04_11) {
        userProfileDao.delete(userProfile)
    }
}