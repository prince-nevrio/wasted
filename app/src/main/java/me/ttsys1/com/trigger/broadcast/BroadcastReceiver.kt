package me.ttsys1.com.trigger.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

import me.ttsys1.com.Preferences
import me.ttsys1.com.Trigger
import me.ttsys1.com.Utils

class BroadcastReceiver : BroadcastReceiver() {
    companion object {
        const val KEY = "code"
        const val ACTION = "me.lucky.wasted.action.TRIGGER"

        fun panic(context: Context, intent: Intent?, trigger: Trigger) {
            if (intent?.action != ACTION) return
            val secret = Preferences.new(context).secret
            assert(secret.isNotEmpty())
            if (intent.getStringExtra(KEY)?.trim() != secret) return
            Utils(context).fire(trigger)
        }
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        panic(context ?: return, intent, Trigger.BROADCAST)
    }
}