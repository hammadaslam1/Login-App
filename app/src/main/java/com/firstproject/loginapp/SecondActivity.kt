package com.firstproject.loginapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val email = findViewById<TextView>(R.id.email_txt2)
        val remarks = findViewById<EditText>(R.id.remarks_txt)
        val btn = findViewById<Button>(R.id.submit_btn)
        val contact = findViewById<TextView>(R.id.contact)
        val wa = findViewById<TextView>(R.id.wa)
        val fb = findViewById<TextView>(R.id.fb)
        val insta = findViewById<TextView>(R.id.insta)
        val github = findViewById<TextView>(R.id.github)
        val linkedin = findViewById<TextView>(R.id.linkedin)
        val portfolio = findViewById<TextView>(R.id.portfolio)

        contact.setOnClickListener{
            val call = Intent(Intent.ACTION_CALL)
            call.data = Uri.parse("tel:03074304204")
            startActivity(call)
        }
        wa.setOnClickListener{
            val fbBrowser = Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/qr/7R7TGR2TSQAEE1"))
            startActivity(fbBrowser)
        }
        fb.setOnClickListener{
            val fbBrowser = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/hammadaslam.308"))
            startActivity(fbBrowser)
        }
        insta.setOnClickListener{
            val fbBrowser = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/hammadaslam10"))
            startActivity(fbBrowser)
        }
        github.setOnClickListener{
            val fbBrowser = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/hammadaslam1"))
            startActivity(fbBrowser)
        }
        linkedin.setOnClickListener{
            val fbBrowser = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/hammadaslam10"))
            startActivity(fbBrowser)
        }
        portfolio.setOnClickListener{
            val fbBrowser = Intent(Intent.ACTION_VIEW, Uri.parse("https://mha-portfolio.web.app"))
            startActivity(fbBrowser)
        }


        val emailText = intent.getStringExtra("email")

        email.text = emailText

        btn.setOnClickListener {
            val i = Intent()
            i.putExtra("remarks", remarks.text.toString())

            setResult(RESULT_OK, i)
            finish()
        }
    }
}