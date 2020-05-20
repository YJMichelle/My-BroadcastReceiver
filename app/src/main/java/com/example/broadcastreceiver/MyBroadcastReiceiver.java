package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import  android.widget.Toast;

public class MyBroadcastReiceiver extends BroadcastReceiver {
    public MyBroadcastReiceiver() {

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // pop up on the screen
        Toast.makeText(context, "Broadcast has been received!", Toast.LENGTH_LONG).show();
    }
}
