package my.edu.taruc.helloedison

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//Instance Name : Type /Class Name
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Load UI to memory
        // R = Resources
        setContentView(R.layout.activity_main)
        //Linking UI to program code
        //Declare variable here
        //val = value, var = variable
        val imageViewFong: ImageView = findViewById(R.id.imageViewFong)
        val textViewHelloWorld: TextView = findViewById(R.id.textViewHelloWorld)
        val buttonShow : Button = findViewById(R.id.buttonShow)
        val buttonHide : Button = findViewById(R.id.buttonHide)

        buttonShow.setOnClickListener{
            imageViewFong.visibility = View.VISIBLE
            textViewHelloWorld.visibility = View.VISIBLE
        }

        buttonHide.setOnClickListener{
            imageViewFong.visibility = View.INVISIBLE
            textViewHelloWorld.visibility = View.INVISIBLE
        }
    }
}