package com.example.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.ActivityLinearBinding

class LinearActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLinearBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLinearBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar!!.title = "LinearActivity"

        binding.button5.setOnClickListener {
            navigateToRelativeActivity()
        }
        binding.button6.setOnClickListener {
            navigateToRelativeActivity()
        }
        binding.button7.setOnClickListener {
            navigateToRelativeActivity()
        }
        binding.button8.setOnClickListener {
            navigateToRelativeActivity()
        }
    }
    private fun navigateToRelativeActivity() {
        val intent = Intent(this, RelativeActivity::class.java)
        startActivity(intent)
    }
}