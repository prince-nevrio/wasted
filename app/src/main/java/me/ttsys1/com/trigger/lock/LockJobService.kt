package me.ttsys1.com.trigger.lock

import android.app.job.JobParameters
import android.app.job.JobService

import me.ttsys1.com.Trigger
import me.ttsys1.com.Utils

class LockJobService : JobService() {
    override fun onStartJob(params: JobParameters?): Boolean {
        Utils(this).fire(Trigger.LOCK)
        return false
    }

    override fun onStopJob(params: JobParameters?): Boolean { return true }
}