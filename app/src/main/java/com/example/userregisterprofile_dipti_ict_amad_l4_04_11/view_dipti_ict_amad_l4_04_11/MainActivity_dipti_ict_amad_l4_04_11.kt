package com.example.userregisterprofile_dipti_ict_amad_l4_04_11.view_dipti_ict_amad_l4_04_11


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.R


class MainActivity_dipti_ict_amad_l4_04_11 : AppCompatActivity() {
    private lateinit var listButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dipti_ict_amad_l4_04_11)
        listButton = findViewById(R.id.profileListBtn)

        listButton.setOnClickListener {
            startActivity(Intent(this, ProfileListActivity_dipti_ict_amad_l4_04_11::class.java))
            finish()
        }
    }
}