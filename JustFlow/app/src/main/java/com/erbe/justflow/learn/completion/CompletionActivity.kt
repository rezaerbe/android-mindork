package com.erbe.justflow.learn.completion

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.erbe.justflow.R
import com.erbe.justflow.data.api.ApiHelperImpl
import com.erbe.justflow.data.api.RetrofitBuilder
import com.erbe.justflow.data.local.DatabaseBuilder
import com.erbe.justflow.data.local.DatabaseHelperImpl
import com.erbe.justflow.learn.base.ApiUserAdapter
import com.erbe.justflow.utils.Status
import com.erbe.justflow.utils.ViewModelFactory
import kotlinx.android.synthetic.main.activity_long_running_task.*
import kotlinx.android.synthetic.main.activity_recycler_view.progressBar

class CompletionActivity : AppCompatActivity() {

    private lateinit var viewModel: CompletionViewModel
    private lateinit var adapter: ApiUserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_completion)
        setupViewModel()
        setupObserver()
    }

    private fun setupObserver() {
        viewModel.getStatus().observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    progressBar.visibility = View.GONE
                    textView.text = it.data
                    textView.visibility = View.VISIBLE
                }
                Status.LOADING -> {
                    progressBar.visibility = View.VISIBLE
                    textView.visibility = View.GONE
                }
                Status.ERROR -> {
                    //Handle Error
                    progressBar.visibility = View.GONE
                    Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

    private fun setupViewModel() {
        viewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(
                ApiHelperImpl(RetrofitBuilder.apiService),
                DatabaseHelperImpl(DatabaseBuilder.getInstance(applicationContext))
            )
        ).get(CompletionViewModel::class.java)
    }
}