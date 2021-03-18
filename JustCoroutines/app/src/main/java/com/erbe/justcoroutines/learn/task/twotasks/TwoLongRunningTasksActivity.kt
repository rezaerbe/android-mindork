package com.erbe.justcoroutines.learn.task.twotasks

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.erbe.justcoroutines.R
import com.erbe.justcoroutines.data.api.ApiHelperImpl
import com.erbe.justcoroutines.data.api.RetrofitBuilder
import com.erbe.justcoroutines.data.local.DatabaseBuilder
import com.erbe.justcoroutines.data.local.DatabaseHelperImpl
import com.erbe.justcoroutines.utils.Status
import com.erbe.justcoroutines.utils.ViewModelFactory
import kotlinx.android.synthetic.main.activity_long_running_task.*
import kotlinx.android.synthetic.main.activity_recycler_view.progressBar

class TwoLongRunningTasksActivity : AppCompatActivity() {

    private lateinit var viewModel: TwoLongRunningTasksViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_long_running_task)
        setupViewModel()
        setupLongRunningTask()
    }

    private fun setupLongRunningTask() {
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
                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                }
            }
        })
        viewModel.startLongRunningTask()
    }

    private fun setupViewModel() {
        viewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(
                ApiHelperImpl(RetrofitBuilder.apiService),
                DatabaseHelperImpl(DatabaseBuilder.getInstance(applicationContext))
            )
        ).get(TwoLongRunningTasksViewModel::class.java)
    }
}
