package com.example.animatednavigationbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animatednavigationbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomNavigation.setOnItemSelectedListener { nav_menu ->
            when (nav_menu.itemId) {
                R.id.news -> showToast("News")
                R.id.global -> showToast("Global")
                R.id.foryou -> showToast("For You")
                R.id.archive -> showToast("Archive")
                R.id.trending -> showToast("Trending")

                else -> {
                    false
                }
            }
        }
    }
}