package com.nyasai.surveillancecamera

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // イベントリスナ登録
        btnStart.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                onClickBtnStart(v)
            }
        })
    }

    /**
     * 開始ボタンクリック時処理
     */
    fun onClickBtnStart(v: View?) {
        var intent = Intent(this, CameraView::class.java)
        startActivity(intent)

    }
}
