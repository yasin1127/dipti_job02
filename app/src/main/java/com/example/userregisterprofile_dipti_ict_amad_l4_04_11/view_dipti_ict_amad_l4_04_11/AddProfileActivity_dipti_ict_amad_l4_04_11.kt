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

class AddProfileActivity_dipti_ict_amad_l4_04_11 : AppCompatActivity() {
    private lateinit var profileViewModel: UserProfileViewModel_dipti_ict_amad_l4_04_11
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_profile_dipti_ict_amad_l40411)

        profileViewModel = ViewModelProvider(this).get(UserProfileViewModel_dipti_ict_amad_l4_04_11::class.java)

        val nameEditText = findViewById<EditText>(R.id.profileNameEt)
        val emailEditText = findViewById<EditText>(R.id.profileEmailEt)
        val dobEditText = findViewById<EditText>(R.id.profileDOBEt)
        val districtEditText = findViewById<EditText>(R.id.profileDistrictEt)
        val mobileEditText = findViewById<EditText>(R.id.profilemobileEt)

        findViewById<Button>(R.id.addBtn).setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val dob = dobEditText.text.toString()
            val district = districtEditText.text.toString()
            val mobile = mobileEditText.text.toString()

            val userProfile = UserProfile_dipti_ict_amad_l4_04_11(name = name, email = email, dob = dob, district = district, mobile = mobile)
            profileViewModel.insertUserProfile(userProfile)

            finish()
        }
    }
}
