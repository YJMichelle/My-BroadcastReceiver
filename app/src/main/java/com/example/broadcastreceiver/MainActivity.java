package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send = (Button)findViewById(R.id.buttonSend);

        MyBroadcastReiceiver receiver = new MyBroadcastReiceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.example.broadcastreceiver");
        registerReceiver(receiver, filter);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendOutBroadcast(v);
            }
        });
    }

    public void sendOutBroadcast(View view) {
            // it doesn't have any explicit class going to call, so here we don't have to throw class in there
            Intent intent = new Intent();
            intent.setAction("com.example.broadcastreceiver"); // specific keyword for this broadcast
            intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES); // remember to add this
            sendBroadcast(intent);
    }
}
