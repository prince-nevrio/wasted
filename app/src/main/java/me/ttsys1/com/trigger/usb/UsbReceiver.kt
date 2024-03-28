package me.ttsys1.com.trigger.usb

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.hardware.usb.UsbManager

import me.ttsys1.com.Trigger
import me.ttsys1.com.Utils

class UsbReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action != UsbManager.ACTION_USB_DEVICE_ATTACHED &&
            intent?.action != UsbManager.ACTION_USB_ACCESSORY_ATTACHED) return
        val utils = Utils(context ?: return)
        if (!utils.isDeviceLocked()) return
        utils.fire(Trigger.USB)
    }
}