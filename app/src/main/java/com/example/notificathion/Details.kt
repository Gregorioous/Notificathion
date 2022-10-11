package com.example.notificathion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.notificathion.databinding.ActivityDetailsBinding

class Details : AppCompatActivity() {
    private var binding: ActivityDetailsBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_details)

        binding?.imageButton?.setOnClickListener(View.OnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=UAXhAEMuV24&ab_channel=godofwarhdcollection"))
            startActivity(browserIntent)
        })
    }
}