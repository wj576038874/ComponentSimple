package com.joyrun.square

import android.os.Bundle
import com.joyrun.base.BaseActivity
import com.joyrun.square.databinding.SquareActivityBinding

/**
 * author: wenjie
 * date: 2021-08-31 11:31
 * descption:
 */
class SquareActivity : BaseActivity() {
    private lateinit var binding:SquareActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SquareActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.fl_container, SquareFragment.newInstance())
            .commit()
    }
}