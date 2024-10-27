package com.example.userregisterprofile_dipti_ict_amad_l4_04_11.adapter_dipti_ict_amad_l4_04_11

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.R
import com.example.userregisterprofile_dipti_ict_amad_l4_04_11.model_dipti_ict_amad_l4_04_11.UserProfile_dipti_ict_amad_l4_04_11


class ProfileAdapter_dipti_ict_amad_l4_04_11 : ListAdapter<UserProfile_dipti_ict_amad_l4_04_11, ProfileAdapter_dipti_ict_amad_l4_04_11.ProfileViewHolder>(DiffCallback()) {

    private var onItemClickListener: ((UserProfile_dipti_ict_amad_l4_04_11) -> Unit)? = null
    private var onDeleteClickListener: ((UserProfile_dipti_ict_amad_l4_04_11) -> Unit)? = null
    private var onUpdateClickListener: ((UserProfile_dipti_ict_amad_l4_04_11) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.profile_item_layout_dipti_ict_amad_l4_04_11, parent, false)
        return ProfileViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }

    fun setOnItemClickListener(listener: (UserProfile_dipti_ict_amad_l4_04_11) -> Unit) {
        onItemClickListener = listener
    }

    fun setOnDeleteClickListener(listener: (UserProfile_dipti_ict_amad_l4_04_11) -> Unit) {
        onDeleteClickListener = listener
    }

    fun setOnUpdateClickListener(listener: (UserProfile_dipti_ict_amad_l4_04_11) -> Unit) {
        onUpdateClickListener = listener
    }

    inner class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val profileName: TextView = itemView.findViewById(R.id.userNameTxt)
        private val profileEmail: TextView = itemView.findViewById(R.id.userEmailTxt)
        private val profileDOB: TextView = itemView.findViewById(R.id.userDOBTxt)
        private val profileDistrict: TextView = itemView.findViewById(R.id.userDistritTxt)
        private val profileMobile: TextView = itemView.findViewById(R.id.userMobileTxt)
        private val deleteButton: ImageButton = itemView.findViewById(R.id.deleteBtn)
        private val updateButton: ImageButton = itemView.findViewById(R.id.editBtn)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val profile = getItem(position)
                    onItemClickListener?.invoke(profile)
                }
            }

            deleteButton.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val profile = getItem(position)
                    onDeleteClickListener?.invoke(profile)
                }
            }

            updateButton.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val profile = getItem(position)
                    onUpdateClickListener?.invoke(profile)
                }
            }
        }

        fun bind(userProfile: UserProfile_dipti_ict_amad_l4_04_11) {
            profileName.text = userProfile.name
            profileEmail.text = userProfile.email
            profileDOB.text = userProfile.dob
            profileDistrict.text = userProfile.district
            profileMobile.text = userProfile.mobile
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<UserProfile_dipti_ict_amad_l4_04_11>() {
        override fun areItemsTheSame(oldItem: UserProfile_dipti_ict_amad_l4_04_11, newItem: UserProfile_dipti_ict_amad_l4_04_11): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: UserProfile_dipti_ict_amad_l4_04_11, newItem: UserProfile_dipti_ict_amad_l4_04_11): Boolean {
            return oldItem == newItem
        }
    }
}