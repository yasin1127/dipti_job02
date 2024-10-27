package com.example.userregisterprofile_dipti_ict_amad_l4_04_11.view_dipti_ict_amad_l4_04_11

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.R
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.adapter_dipti_ict_amad_l4_04_11.ProfileAdapter_dipti_ict_amad_l4_04_11
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.viewmodel_dipti_ict_amad_l4_04_11.UserProfileViewModel_dipti_ict_amad_l4_04_11
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProfileListActivity_dipti_ict_amad_l4_04_11 : AppCompatActivity() {

    private lateinit var profileViewModel: UserProfileViewModel_dipti_ict_amad_l4_04_11
    private lateinit var profileAdapter: ProfileAdapter_dipti_ict_amad_l4_04_11


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_list_dipti_ict_amad_l40411)
        profileViewModel = ViewModelProvider(this).get(UserProfileViewModel_dipti_ict_amad_l4_04_11::class.java)

        val recyclerView = findViewById<RecyclerView>(R.id.profileRecyclerView)
        profileAdapter = ProfileAdapter_dipti_ict_amad_l4_04_11()

        recyclerView.adapter = profileAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        profileViewModel.getUserProfiles().observe(this, Observer { profiles ->
            profileAdapter.submitList(profiles)
        })

        profileAdapter.setOnItemClickListener { userProfile ->
            val intent = Intent(this@ProfileListActivity_dipti_ict_amad_l4_04_11, ProfileDetailsActivity_dipti_ict_amad_l4_04_11::class.java)
            intent.putExtra("USER_PROFILE", userProfile)
            startActivity(intent)
        }

        profileAdapter.setOnDeleteClickListener { userProfile ->
            profileViewModel.deleteUserProfile(userProfile)
        }

        profileAdapter.setOnUpdateClickListener { userProfile ->
            val intent = Intent(this@ProfileListActivity_dipti_ict_amad_l4_04_11, UpdateProfileActivity_dipti_ict_amad_l4_04_11::class.java)
            intent.putExtra("USER_PROFILE", userProfile)
            startActivity(intent)
        }

        findViewById<FloatingActionButton>(R.id.addProfileBtn).setOnClickListener {
            val intent = Intent(this@ProfileListActivity_dipti_ict_amad_l4_04_11, AddProfileActivity_dipti_ict_amad_l4_04_11::class.java)
            startActivity(intent)
        }
    }
}