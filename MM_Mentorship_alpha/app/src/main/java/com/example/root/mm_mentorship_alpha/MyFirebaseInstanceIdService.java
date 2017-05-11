package com.example.root.mm_mentorship_alpha;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static android.content.ContentValues.TAG;

/**
 * Created by edwin on 4/27/2017.
 */

public class MyFirebaseInstanceIdService  extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);

    }

    public void sendRegistrationToServer(String refreshedToken) {

        // Log and toast
        Log.d(TAG, "Refreshed token: " + refreshedToken);
    }
}
