package com.joyrun.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.joyrun.app.databinding.AppActivityMainBinding
import androidx.fragment.app.Fragment
import com.joyrun.community.CommunityFragment
import com.joyrun.home.HomeFragment
import com.joyrun.mine.MineFragment
import com.joyrun.square.SquareFragment


class MainActivity : AppCompatActivity() {

    private lateinit var mContent: Fragment
    private lateinit var binding: AppActivityMainBinding

    private var homeFragment: HomeFragment? = null
    private var communityFragment: CommunityFragment? = null
    private var squareFragment: SquareFragment? = null
    private var mineFragment: MineFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AppActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        homeFragment = HomeFragment.newInstance()
        mContent = homeFragment!!
        val ft = supportFragmentManager.beginTransaction()
        ft.add(R.id.fl_container, mContent)
        ft.commit()

        binding.navView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    if (homeFragment == null) {
                        homeFragment = HomeFragment.newInstance()
                    }
                    switchContent(homeFragment!!)
                }

                R.id.menu_community -> {
                    if (communityFragment == null) {
                        communityFragment = CommunityFragment.newInstance()
                    }
                    switchContent(communityFragment!!)
                }
                R.id.menu_square -> {
                    if (squareFragment == null) {
                        squareFragment = SquareFragment.newInstance()
                    }
                    switchContent(squareFragment!!)
                }
                R.id.menu_mine -> {
                    if (mineFragment == null) {
                        mineFragment = MineFragment.newInstance()
                    }
                    switchContent(mineFragment!!)
                }
            }
            true
        }
    }


    /**
     * 修改显示的内容 不会重新加载
     */
    private fun switchContent(to: Fragment) {
        if (mContent !== to) {
            val transaction = supportFragmentManager.beginTransaction()
            if (!to.isAdded) { // 先判断是否被add过
                transaction.hide(mContent).add(R.id.fl_container, to)
                    .commit() // 隐藏当前的fragment，add下一个到Activity中
            } else {
                transaction.hide(mContent).show(to).commit() // 隐藏当前的fragment，显示下一个
            }
            mContent = to
        }
    }
}