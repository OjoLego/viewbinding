package com.example.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.ConstrainMainBinding

class ConstrainActivity : AppCompatActivity() {

    private lateinit var binding: ConstrainMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ConstrainMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar!!.title = "ConstrainActivity"

        binding.button1.setOnClickListener {
            navigateToLinearActivity()
        }
        binding.button2.setOnClickListener {
            navigateToLinearActivity()
        }
        binding.button3.setOnClickListener {
            navigateToLinearActivity()
        }
        binding.button4.setOnClickListener {
            navigateToLinearActivity()
        }
    }
    private fun navigateToLinearActivity(){
        val intent = Intent(this, LinearActivity::class.java)
        startActivity(intent)
    }
}