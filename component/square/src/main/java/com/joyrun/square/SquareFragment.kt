package com.joyrun.square

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * author: wenjie
 * date: 2021-08-31 13:25
 * descption:
 */
class SquareFragment : Fragment() {


    companion object {

        @JvmStatic
        fun newInstance() = SquareFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.square_fragment, container, false)
    }
}