package com.erbe.jetpack.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.Navigation.findNavController
import com.erbe.jetpack.R

class SplashFragment : Fragment() {
    private lateinit var viewModel: SplashViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)
        return view.rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = SplashViewModel(this.activity?.applicationContext)
        viewModel.isUserLoggedIn.observe(viewLifecycleOwner, Observer { isUserLoggedIn ->
            if (isUserLoggedIn) {
                view?.let {
                    findNavController(it).navigate(R.id.show_home_screen)
                }
            } else {
                view?.let {
                    findNavController(it).navigate(R.id.show_login_screen)
                }
            }
        })
    }
}