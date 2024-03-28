package me.ttsys1.com.trigger.shortcut

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import me.ttsys1.com.Trigger
import me.ttsys1.com.trigger.broadcast.BroadcastReceiver

class ShortcutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BroadcastReceiver.panic(this, intent, Trigger.SHORTCUT)
        finishAndRemoveTask()
    }
}