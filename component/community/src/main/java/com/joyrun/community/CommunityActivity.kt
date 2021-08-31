package com.joyrun.community

import android.os.Bundle
import com.joyrun.base.BaseActivity
import com.joyrun.community.databinding.CommunityActivityBinding

/**
 * author: wenjie
 * date: 2021-08-31 11:28
 * descption:
 */
class CommunityActivity : BaseActivity() {

    private lateinit var binding: CommunityActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CommunityActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.fl_container, CommunityFragment.newInstance())
            .commit()
    }
}