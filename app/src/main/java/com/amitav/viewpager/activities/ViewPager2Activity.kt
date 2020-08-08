package com.amitav.viewpager.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amitav.viewpager.R
import com.amitav.viewpager.adapters.ScreenSlidePagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_viewpager2.*
import kotlinx.android.synthetic.main.toolbar.*

class ViewPager2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager2)
        setSupportActionBar(toolbar)

        val adapter = ScreenSlidePagerAdapter(this)
        viewPager2.adapter = adapter
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->

        }.attach()
    }
}