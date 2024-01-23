package com.example.myapplication
import android.annotation.SuppressLint
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    // declaring views here
    lateinit var imageView: Image
    lateinit var nameEditText: EditText
    lateinit var editTextlanguage: EditText
    lateinit var textView: TextView
    lateinit var btn: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Initializing Views here
        val  imageView: ImageView = findViewById(R.id.imageView)
        val  nameEditText: EditText = findViewById(R.id.editText)
        val  editTextLanguage: EditText = findViewById(R.id.editTextlanguage)
        val  textView: TextView = findViewById(R.id.textView)

        btn = findViewById(R.id.button)


        // handling user interactions
        btn.setOnClickListener{

            //Getting the name of the user
            var userName = nameEditText.text.toString() // this is the attribute or function that allows us to get the name from the edit text.


            // Getting the language specified by the user
            var languageSelected  =  editTextLanguage.text.toString()


            // Say hello to the user
            Toast.makeText(this,

                "Hello $userName",
                Toast.LENGTH_SHORT
                ).show()



            // Display Java or Kotlin
            when (languageSelected == languageSelected) {

                ((languageSelected == "English")) -> imageView.setImageResource(R.drawable.englishlgo)
                ((languageSelected == "Hindi")) -> imageView.setImageResource(R.drawable.hindilogo)
                ((languageSelected == "Urdu")) -> imageView.setImageResource(R.drawable.urdu_logo)

                else -> imageView.setImageResource(R.drawable.background2)
            }

            }




    }






}

