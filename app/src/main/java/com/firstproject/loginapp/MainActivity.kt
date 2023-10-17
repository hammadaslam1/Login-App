package com.firstproject.loginapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginBtn = findViewById<Button>(R.id.login_btn)
        val emailTxt = findViewById<EditText>(R.id.email_txt)

       loginBtn.setOnClickListener {
           val i = Intent(this, SecondActivity::class.java)

           i.putExtra("email", emailTxt.text.toString())

               //startActivity(i)

                editActivityResultLauncher.launch(i)

        }
    }
    var editActivityResultLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        result ->

        if (result.resultCode == Activity.RESULT_OK) {
            val data = result.data
            val feedback = findViewById<TextView>(R.id.textView2)
            val success = findViewById<TextView>(R.id.textView4)
            if (data != null) {
                val remarks = data.extras!!.getString("remarks")
                success.text = "Successfully submitted!"
                feedback.text = remarks
            }
        }
    }

}