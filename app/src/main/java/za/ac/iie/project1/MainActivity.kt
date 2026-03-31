package za.ac.iie.project1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var tvSuggest = findViewById<TextView>(R.id.tvSuggest)
        val btnRS = findViewById<Button>(R.id.btnRS)
        val btnDone = findViewById<Button>(R.id.btnDone)
        val etName = findViewById<EditText>(R.id.etName)
        var tvResult = findViewById<TextView>(R.id.tvResult)

        var name = etName.text.toString()
        var txt = tvSuggest.text.toString()
        var result = ""

        btnDone.setOnClickListener {

            val name = etName.text.toString().trim()

            if (name == "Morning") {
                result =  "Send a \"Good morning\" text to a family member."
            } else if (name == "MidMorning") {
                result = "Reach out to a colleague with a quick \"Thank You\""
            } else if (name == "Afternoon") {
                result = "Share a funny meme or an interesting link with a friend"
            } else if (name == "Afternoon Snacktime") {
                result = "Send a quick \"Thinking of you\" message"
            } else if (name == "Dinnertime") {
                result = "Call a friend or realtive for a 5 minute catch up"
            } else if (name == "After Dinner") {
                result = "Leave a thoughtful comment on a friend's post"
            }

            tvSuggest.text = result
        }

        btnRS.setOnClickListener {

            if (result == "Send a \"Good morning\" text to a family member.") {
                tvResult.text = "Goodmorning"
            } else if (result == "Reach out to a colleague with a quick \"Thank You\"") {
                tvResult.text = "MidMorning"
            } else if (result == "Share a funny meme or an interesting link with a friend") {
                tvResult.text = "Afternoon"
            } else if (result == "Send a quick \"Thinking of you\" message") {
                tvResult.text = "Afternoon Snacktime"
            } else if (result == "Call a friend or realtive for a 5 minute catch up") {
                tvResult.text = "Dinner"
            } else if (result == "Leave a thoughtful comment on a friend's post") {
                tvResult.text = "After Dinner"
            }





    }
}}
