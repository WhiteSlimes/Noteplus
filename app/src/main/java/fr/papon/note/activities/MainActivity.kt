package fr.papon.note.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import fr.papon.note.R

class MainActivity : AppCompatActivity() {

    val REQUEST_CODE_ADD_NOTE = 1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageAddNoteMain = findViewById<ImageView>(R.id.imageAddNoteMain)
        imageAddNoteMain.setOnClickListener{
            val i = Intent(applicationContext, CreateNoteActivity::class.java)
            REQUEST_CODE_ADD_NOTE
            startActivity(i)
        }
    }
}