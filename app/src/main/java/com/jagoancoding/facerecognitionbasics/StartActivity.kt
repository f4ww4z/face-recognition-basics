package com.jagoancoding.facerecognitionbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jagoancoding.facerecognitionbasics.ui.start.StartFragment

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, StartFragment.newInstance())
                .commitNow()
        }
    }

}
