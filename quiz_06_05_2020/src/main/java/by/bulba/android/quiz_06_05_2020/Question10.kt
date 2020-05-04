package by.bulba.android.quiz_06_05_2020

import android.content.SharedPreferences
import androidx.core.content.edit

class Question10(
    private val sharedPreferences: SharedPreferences
) {

    fun writeData() {
        sharedPreferences.edit {
            putString("key1","value1")
            putLong("key2",12L)
            putStringSet("key3", setOf("some_val"))
            putBoolean("key4", false)
        }
    }

}