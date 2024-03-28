package me.ttsys1.com.trigger.application

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import me.ttsys1.com.Trigger
import me.ttsys1.com.Utils

class ApplicationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils(this).fire(Trigger.APPLICATION)
        finishAndRemoveTask()
    }
}