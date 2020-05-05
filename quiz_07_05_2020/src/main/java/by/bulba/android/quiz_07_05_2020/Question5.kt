package by.bulba.android.quiz_07_05_2020

import android.os.Handler
import android.view.ViewStub
import androidx.appcompat.app.AppCompatActivity

private const val DELAY = 5000L

class Question5 : AppCompatActivity(R.layout.activity_question5) {

    private val handler = Handler()

    override fun onStart() {
        super.onStart()
        handler.postDelayed({
            findViewById<ViewStub>(R.id.viewStub).inflate()
        }, DELAY)
    }
}