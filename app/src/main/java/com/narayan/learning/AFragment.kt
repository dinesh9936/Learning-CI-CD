package com.narayan.learning

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment

private const val TAG = "AFragment"

class AFragment : Fragment(R.layout.fragment_a){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val someInt = requireArguments().getString("some_int")
        Log.d(TAG, "onViewCreated: $someInt")
    }
}