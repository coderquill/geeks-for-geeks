package com.rupali.alarmmanagersample

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.support.v4.app.NotificationCompat
import android.support.v4.app.NotificationManagerCompat


class AlarmBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        // Create the notification to be shown
        val mBuilder = NotificationCompat.Builder(context!!, "my_app")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Alarm Manager")
                .setContentText("Its your alarm!.")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        // Get the Notification manager service
        val am = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // Generate an Id for each notification
        val id = System.currentTimeMillis()/1000

        // Show a notification
        am.notify(id.toInt(), mBuilder.build())
    }
}