package com.example.flag

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.View

import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.widget.Chronometer

import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz_questions.*

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        var chronometer=findViewById<Chronometer>(R.id.view_timer)
        chronometer.setCountDown(true)
        chronometer.setBase(SystemClock.elapsedRealtime()+1000*5)
        fun onClick(view: View){
        chronometer.setBase(SystemClock.elapsedRealtime()+1000*5)
        Log.i("Timer","Uaqyt ketti"+chronometer.isCountDown())
        chronometer.start()
        }
        */



        window.decorView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        btn_start.setOnClickListener{
            if (et_name.text.toString().isEmpty()){
                Toast.makeText(this,"Atynyzdy zhazynyz",Toast.LENGTH_SHORT).show()
            } else{
                val intent=Intent(this,QuizQuestionsActivity::class.java)


                intent.putExtra(Constants.USER_NAME,et_name.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}
