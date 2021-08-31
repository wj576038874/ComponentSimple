package com.joyrun.mine

import android.os.Bundle
import com.joyrun.base.BaseActivity
import com.joyrun.mine.databinding.MineActivityBinding

/**
 * author: wenjie
 * date: 2021-08-31 11:30
 * descption:
 */
class MineActivity : BaseActivity() {

    private lateinit var binding: MineActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MineActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.fl_container, MineFragment.newInstance())
            .commit()
    }
}