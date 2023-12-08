package com.example.firebasepush.Services;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseInstanceIDService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        Tools.getNotificationsMenssagens(this,message.getNotification().getTitle(),
                message.getNotification().getBody());
    }

}

