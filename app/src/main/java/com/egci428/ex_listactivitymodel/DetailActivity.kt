package com.egci428.ex_listactivitymodel

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val courseNumber = intent.getIntExtra("courseNumber" ,10101)
        val courseCredit = intent.getDoubleExtra("credit", 0.0)
        courseName2.text = intent.getStringExtra("courseName")
        desc.text = intent.getStringExtra("desc")
        creditsText.setText("Credits: $courseCredit")
        courseNoText.setText("Course Number: $courseNumber")

        val res = this.resources.getIdentifier("image1010"+ intent.getIntExtra("impos", 1), "drawable", this.packageName)
        imageCourse2.setImageResource(res)
    }
}
