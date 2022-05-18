package com.qianyue.preparedemos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.qianyue.preparedemos.test.StringTest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit = findViewById<EditText>(R.id.edit_text)
        findViewById<Button>(R.id.button).setOnClickListener {
            Toast.makeText(
                this@MainActivity,
//                "是不是一样的：" + StringTest.test(edit.text.toString()),
                "int class "+ (StringTest.getIntClz()),
                Toast.LENGTH_LONG
            ).show()
        }
    }
}