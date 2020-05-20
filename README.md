# My-BroadcastReceiver

* make sure that the receiver receive broadcast with a specific keyword
* Beginning with Android 8.0(API level 26), the system imposes additional restrictions on menifest-declared receivers.
    * use context-registered receiver
        1. create an instance of MyBroadcastReceiver, using new
        2. Create an IntentFilter and register by calling registerReceiver(MyBroadcastReceiver, IntentFilter)
