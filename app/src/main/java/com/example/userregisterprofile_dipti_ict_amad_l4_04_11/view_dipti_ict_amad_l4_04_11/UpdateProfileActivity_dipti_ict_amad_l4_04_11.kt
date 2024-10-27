package com.example.userregisterprofile_dipti_ict_amad_l4_04_11.view_dipti_ict_amad_l4_04_11

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.R
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.model_dipti_ict_amad_l4_04_11.UserProfile_dipti_ict_amad_l4_04_11
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.viewmodel_dipti_ict_amad_l4_04_11.UserProfileViewModel_dipti_ict_amad_l4_04_11

class UpdateProfileActivity_dipti_ict_amad_l4_04_11 : AppCompatActivity() {

    private lateinit var profileViewModel: UserProfileViewModel_dipti_ict_amad_l4_04_11
    private lateinit var userProfile: UserProfile_dipti_ict_amad_l4_04_11

    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var dobEditText: EditText
    private lateinit var districtEditText: EditText
    private lateinit var mobileEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_profile_dipti_ict_amad_l40411)

        profileViewModel = ViewModelProvider(this).get(UserProfileViewModel_dipti_ict_amad_l4_04_11::class.java)

        userProfile = intent.getSerializableExtra("USER_PROFILE") as UserProfile_dipti_ict_amad_l4_04_11

        nameEditText = findViewById(R.id.profileNameEt)
        emailEditText = findViewById(R.id.profileEmailEt)
        dobEditText = findViewById(R.id.profileDOBEt)
        districtEditText = findViewById(R.id.profileDistrictEt)
        mobileEditText = findViewById(R.id.profilemobileEt)

        populateFields()

        findViewById<Button>(R.id.updateBtn).setOnClickListener {
            updateUserProfile()
        }
    }

    private fun populateFields() {
        nameEditText.setText(userProfile.name)
        emailEditText.setText(userProfile.email)
        dobEditText.setText(userProfile.dob)
        districtEditText.setText(userProfile.district)
        mobileEditText.setText(userProfile.mobile)
    }

    private fun updateUserProfile() {
        val name = nameEditText.text.toString()
        val email = emailEditText.text.toString()
        val dob = dobEditText.text.toString()
        val district = districtEditText.text.toString()
        val mobile = mobileEditText.text.toString()

        val updatedUserProfile = UserProfile_dipti_ict_amad_l4_04_11(
            id = userProfile.id,
            name = name,
            email = email,
            dob = dob,
            district = district,
            mobile = mobile
        )

        profileViewModel.updateUserProfile(updatedUserProfile)

        finish()
    }
}