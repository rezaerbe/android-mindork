package com.erbe.rxjava3.ui.operators

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.erbe.rxjava3.R
import com.erbe.rxjava3.utils.AppConstant
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

class ConcatExampleActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "ConcatExampleActivity"
    }

    private lateinit var btn: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)
        btn = findViewById(R.id.btn)
        textView = findViewById(R.id.textView)
        btn.setOnClickListener {
            doSomeWork()
        }
    }

    /*
     * Using concat operator to combine Observable : concat maintain
     * the order of Observable.
     * It will emit all the 7 values in order
     * here - first "A1", "A2", "A3", "A4" and then "B1", "B2", "B3"
     * first all from the first Observable and then
     * all from the second Observable all in order
     */
    private fun doSomeWork() {
        val observableA = Observable.fromArray("A1", "A2", "A3", "A4")
        val observableB = Observable.fromArray("B1", "B2", "B3", "B4")

        Observable.concat(observableA, observableB)
            .subscribe(getObserver())
    }

    private fun getObserver(): Observer<String> {
        return object : Observer<String> {

            override fun onSubscribe(d: Disposable) {
                Log.d(TAG, " onSubscribe : " + d.isDisposed)
            }

            override fun onNext(value: String) {
                textView.append(" onNext : value : $value")
                textView.append(AppConstant.LINE_SEPARATOR)
                Log.d(TAG, " onNext : value : $value")
            }

            override fun onError(e: Throwable) {
                textView.append(" onError : " + e.message)
                textView.append(AppConstant.LINE_SEPARATOR)
                Log.d(TAG, " onError : " + e.message)
            }

            override fun onComplete() {
                textView.append(" onComplete")
                textView.append(AppConstant.LINE_SEPARATOR)
                Log.d(TAG, " onComplete")
            }
        }
    }
}