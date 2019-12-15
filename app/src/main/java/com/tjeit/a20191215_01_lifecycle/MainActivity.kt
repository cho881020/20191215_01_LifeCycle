package com.tjeit.a20191215_01_lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        callActivityBtn.setOnClickListener {

            val intent = Intent(mContext, SecondActivity::class.java)
            startActivity(intent)

        }

    }

    override fun setValues() {

    }
}
