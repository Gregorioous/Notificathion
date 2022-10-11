package com.example.notificathion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.notificathion.databinding.ActivityPriceBinding

class Price : AppCompatActivity() {
    private var binding: ActivityPriceBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_price)
    }
}