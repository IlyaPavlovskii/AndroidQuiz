package by.bulba.android.quiz_03_05_2020

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class Question4 : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Create;")
        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Start;")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Stop;")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Destroy;")
    }

    private companion object {
        const val TAG = "Question4"
    }
}
