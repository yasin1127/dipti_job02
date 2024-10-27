package com.example.userregisterprofile_dipti_ict_amad_l4_04_11.dao_dipti_ict_amad_l4_04_11


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.model_dipti_ict_amad_l4_04_11.UserProfile_dipti_ict_amad_l4_04_11

@Dao
interface UserProfileDao_dipti_ict_amad_l4_04_11 {
    @Insert
    suspend fun insert(userProfile: UserProfile_dipti_ict_amad_l4_04_11)

    @Update
    suspend fun update(userProfile: UserProfile_dipti_ict_amad_l4_04_11)

    @Delete
    suspend fun delete(userProfile: UserProfile_dipti_ict_amad_l4_04_11)

    @Query("SELECT * FROM user_profile")
    fun getAllUserProfiles(): LiveData<List<UserProfile_dipti_ict_amad_l4_04_11>>
}