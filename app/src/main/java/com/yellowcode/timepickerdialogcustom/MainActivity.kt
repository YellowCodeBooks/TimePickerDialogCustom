package com.yellowcode.timepickerdialogcustom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import android.app.TimePickerDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showTimePickerDialog()
        constraintMain.setOnClickListener { showTimePickerDialog() }
    }

    fun showTimePickerDialog() {
        val newFragment = MyTimePickerFragment()
        newFragment.show(supportFragmentManager, "time picker")
    }
}
