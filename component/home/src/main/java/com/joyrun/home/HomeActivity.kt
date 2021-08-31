package com.joyrun.home

import android.os.Bundle
import com.joyrun.base.BaseActivity
import com.joyrun.home.databinding.HomeActivityBinding

/**
 * author: wenjie
 * date: 2021-08-31 10:49
 * descption:
 */
class HomeActivity : BaseActivity() {

    private lateinit var binding: HomeActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.fl_container, HomeFragment.newInstance())
            .commit()
    }
}