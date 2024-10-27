package com.example.userregisterprofile_dipti_ict_amad_l4_04_11.database_dipti_ict_amad_l4_04_11
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.dao_dipti_ict_amad_l4_04_11.UserProfileDao_dipti_ict_amad_l4_04_11
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.model_dipti_ict_amad_l4_04_11.UserProfile_dipti_ict_amad_l4_04_11

@Database(entities = [UserProfile_dipti_ict_amad_l4_04_11::class], version = 1)
abstract class UserDatabase_dipti_ict_amad_l4_04_11 : RoomDatabase() {
    abstract fun userProfileDao(): UserProfileDao_dipti_ict_amad_l4_04_11

    companion object {
        @Volatile
        private var INSTANCE: UserDatabase_dipti_ict_amad_l4_04_11? = null

        fun getDatabase(context: Context): UserDatabase_dipti_ict_amad_l4_04_11 {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase_dipti_ict_amad_l4_04_11::class.java,
                    "user_profile_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}