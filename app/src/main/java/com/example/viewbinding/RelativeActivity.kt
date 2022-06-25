package com.example.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.RelativeMainBinding

class RelativeActivity : AppCompatActivity() {

    private lateinit var binding: RelativeMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RelativeMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar!!.title = "RelativeActivity"

        binding.button9.setOnClickListener {
            navigateToConstrainActivity()
        }
        binding.button10.setOnClickListener {
            navigateToConstrainActivity()
        }
        binding.button11.setOnClickListener {
            navigateToConstrainActivity()
        }
        binding.button12.setOnClickListener {
            navigateToConstrainActivity()
        }
    }
    private fun navigateToConstrainActivity(){
        var intent = Intent(this, ConstrainActivity::class.java)
        startActivity(intent)
    }
}