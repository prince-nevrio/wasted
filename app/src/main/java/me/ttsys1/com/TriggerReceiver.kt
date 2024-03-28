package me.ttsys1.com

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class TriggerReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        me.ttsys1.com.trigger.broadcast.BroadcastReceiver().onReceive(context, intent)
    }
}