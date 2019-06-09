package com.nyasai.surveillancecamera

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class CameraView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera_view)

        // 戻るボタンを有効化
        var actionBar = getSupportActionBar()
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when{
            item?.getItemId() == android.R.id.home -> {}
            else -> {}
        }
        return super.onOptionsItemSelected(item)
    }
}
