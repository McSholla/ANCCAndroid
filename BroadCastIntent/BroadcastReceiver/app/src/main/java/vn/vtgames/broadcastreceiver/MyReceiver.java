package vn.vtgames.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        //Toast a message with the string action.
        String action = intent.getAction();
        //Toast a message.
        Toast.makeText(context, "Detected: " + action, Toast.LENGTH_LONG).show();
    }
}
