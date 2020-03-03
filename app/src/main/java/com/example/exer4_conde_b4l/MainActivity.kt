package com.example.exer4_conde_b4l

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.exer4_conde_b4l.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Allyza Conde")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName
        binding.doneButton.setOnClickListener{
            showData(it)
        }
    }

    private fun showData(view: View){
        binding.apply{
            appTitle.visibility = View.GONE
            detailName.visibility = View.GONE
            detailNickname.visibility = View.GONE
            detailAge.visibility = View.GONE
            detailBirthday.visibility = View.GONE
            detailCourse.visibility = View.GONE
            detailColor.visibility = View.GONE
            detailCrush.visibility = View.GONE
            detailDream.visibility = View.GONE
            detailMobileno.visibility = View.GONE
            detailMessage.visibility = View.GONE

            editName.visibility = View.GONE
            editNickname.visibility = View.GONE
            editAge.visibility = View.GONE
            editBirthday.visibility = View.GONE
            editCourse.visibility = View.GONE
            editColor.visibility = View.GONE
            editCrush.visibility = View.GONE
            editDream.visibility = View.GONE
            editPhone.visibility = View.GONE
            editMessage.visibility = View.GONE

            doneButton.visibility = View.GONE

            myName?.name = editName.text.toString()
            myName?.nickname = editNickname.text.toString()
            invalidateAll()
            showAge.text = editAge.text.toString()

            showName.visibility = View.VISIBLE
            showNickname.visibility = View.VISIBLE
            showAge.visibility = View.VISIBLE
            showMsg.visibility = View.VISIBLE
        }

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}

