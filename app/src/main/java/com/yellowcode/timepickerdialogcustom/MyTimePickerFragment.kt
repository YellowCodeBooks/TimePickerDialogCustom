package com.yellowcode.timepickerdialogcustom


import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_my_time_picker.view.*
import android.os.Build

class MyTimePickerFragment : DialogFragment() {

    var isMonday = false
    var isTuesday = false
    var isWesnesday = false
    var isThusday = false
    var isFriday = false
    var isSaturday = false
    var isSunday = false

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            // Get the layout inflater
            val inflater = requireActivity().layoutInflater;

            // Inflate and set the layout for the dialog
            // Pass null as the parent view because its going in the dialog layout
            val view = inflater.inflate(R.layout.fragment_my_time_picker, null)
            builder.setView(view)

            view.btnMonday.setOnClickListener {
                if (!isMonday) view.btnMonday.setBackgroundResource(R.drawable.rounded_button_selected) else view.btnMonday.setBackgroundResource(
                    R.drawable.rounded_button
                )
                isMonday = !isMonday
            }
            view.btnTuesday.setOnClickListener {
                if (!isTuesday) view.btnTuesday.setBackgroundResource(R.drawable.rounded_button_selected) else view.btnTuesday.setBackgroundResource(
                    R.drawable.rounded_button
                )
                isTuesday = !isTuesday
            }
            view.btnWednesday.setOnClickListener {
                if (!isWesnesday) view.btnWednesday.setBackgroundResource(R.drawable.rounded_button_selected) else view.btnWednesday.setBackgroundResource(
                    R.drawable.rounded_button
                )
                isWesnesday = !isWesnesday
            }
            view.btnThusday.setOnClickListener {
                if (!isThusday) view.btnThusday.setBackgroundResource(R.drawable.rounded_button_selected) else view.btnThusday.setBackgroundResource(
                    R.drawable.rounded_button
                )
                isThusday = !isThusday
            }
            view.btnFriday.setOnClickListener {
                if (!isFriday) view.btnFriday.setBackgroundResource(R.drawable.rounded_button_selected) else view.btnFriday.setBackgroundResource(
                    R.drawable.rounded_button
                )
                isFriday = !isFriday
            }
            view.btnSaturday.setOnClickListener {
                if (!isSaturday) view.btnSaturday.setBackgroundResource(R.drawable.rounded_button_selected) else view.btnSaturday.setBackgroundResource(
                    R.drawable.rounded_button
                )
                isSaturday = !isSaturday
            }
            view.btnSunday.setOnClickListener {
                if (!isSunday) view.btnSunday.setBackgroundResource(R.drawable.rounded_button_selected) else view.btnSunday.setBackgroundResource(
                    R.drawable.rounded_button
                )
                isSunday = !isSunday
            }
            view.btnOk.setOnClickListener {
                var getHour = 0
                var getMinute = 0
                if (Build.VERSION.SDK_INT < 23) {
                    getHour = view.timePicker.getCurrentHour()
                    getMinute = view.timePicker.getCurrentMinute()
                } else {
                    getHour = view.timePicker.getHour()
                    getMinute = view.timePicker.getMinute()
                }

                var message =
                    "Time selected $getHour:$getMinute - Date"
                if (isMonday)
                    message += " M"
                if (isTuesday)
                    message += " T"
                if (isWesnesday)
                    message += " W"
                if (isThusday)
                    message += " T"
                if (isFriday)
                    message += " F"
                if (isSaturday)
                    message += " S"
                if (isSunday)
                    message += " S"
                Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
                dismiss()
            }
            view.btnCancel.setOnClickListener { dismiss() }

            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}
