package com.kotlinliza.todoapp
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract.Calendars
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.TimePicker
import java.util.Calendar

class AddMore : AppCompatActivity(),DatePickerDialog.OnDateSetListener,TimePickerDialog.OnTimeSetListener {

    var day=0
    var month=0
    var year=0
    var hour=0
    var minute=0

    var savedday=0
    var savedmonth=0
    var savedyear=0
    var savedhour=0
    var savedminute=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_more)
        val capture=findViewById<Button>(R.id.cameraBtn)
        capture.setOnClickListener {
            dispatchTakePictureIntent()
        }

        pickdate()
    }
    val REQUEST_IMAGE_CAPTURE = 1

    private fun dispatchTakePictureIntent() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        try {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
        } catch (e: ActivityNotFoundException) {
            // display error state to the user
        }
    }

    private fun getDateTimeCalender(){
        val cal= Calendar.getInstance()
        day=cal.get(Calendar.DAY_OF_MONTH)
        month=cal.get(Calendar.MONTH)
        year=cal.get(Calendar.YEAR)
        hour=cal.get(Calendar.HOUR)
        minute=cal.get(Calendar.MINUTE)
    }
    private fun pickdate(){
        val timebtn=findViewById<Button>(R.id.timebtn)
        timebtn.setOnClickListener {
            getDateTimeCalender()
            DatePickerDialog(this,this,year,month,day).show()
        }
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
      savedday=dayOfMonth
      savedmonth=month
      savedyear=year
      getDateTimeCalender()
      TimePickerDialog(this,this,hour,minute,true).show()
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
       savedhour=hourOfDay
        savedminute=minute

        val timeTv=findViewById<TextView>(R.id.timeTv)
        timeTv.text="Date:$savedday-$savedmonth-$savedyear\n Time:$savedhour:$savedminute"
    }









}
