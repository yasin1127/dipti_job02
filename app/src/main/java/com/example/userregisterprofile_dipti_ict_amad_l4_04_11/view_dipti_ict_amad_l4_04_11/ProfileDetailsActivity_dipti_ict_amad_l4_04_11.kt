package com.example.userregisterprofile_dipti_ict_amad_l4_04_11.view_dipti_ict_amad_l4_04_11


import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.R
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.model_dipti_ict_amad_l4_04_11.UserProfile_dipti_ict_amad_l4_04_11


class ProfileDetailsActivity_dipti_ict_amad_l4_04_11 : AppCompatActivity() {
    private lateinit var userProfile: UserProfile_dipti_ict_amad_l4_04_11

    private lateinit var nameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var dobTextView: TextView
    private lateinit var districtTextView: TextView
    private lateinit var mobileTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_details_dipti_ict_amad_l40411)
        userProfile = intent.getSerializableExtra("USER_PROFILE") as UserProfile_dipti_ict_amad_l4_04_11

        nameTextView = findViewById(R.id.nameTextView)
        emailTextView = findViewById(R.id.emailTextView)
        dobTextView = findViewById(R.id.dobTextView)
        districtTextView = findViewById(R.id.districtTextView)
        mobileTextView = findViewById(R.id.mobileTextView)

        populateFields()
    }

    private fun populateFields() {
        nameTextView.text = userProfile.name
        emailTextView.text = userProfile.email
        dobTextView.text = userProfile.dob
        districtTextView.text = userProfile.district
        mobileTextView.text = userProfile.mobile
    }
}