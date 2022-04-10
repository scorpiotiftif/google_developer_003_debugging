package fr.francoisgaucher.googledeveloper_debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
        division()
    }

    private fun logging(){
        Log.v(TAG, "Hello world !")
    }

    private fun division(){
        val numerator = 60
        var denominator = 4
        findViewById<TextView>(R.id.division_textview).text = "${numerator / denominator}"

        repeat(4){
            Thread.sleep(1)
            Log.d(TAG, "Denominator = $denominator")
            Log.v(TAG, "Result = ${numerator / denominator}")
            denominator--
        }
    }
}