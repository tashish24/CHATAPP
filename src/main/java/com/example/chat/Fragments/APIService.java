package com.example.chat.Fragments;

import com.example.chat.Notification.MyResponse;
import com.example.chat.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAf0ZHeR8:APA91bFcFtgwjsuNGlUaOS0e_vAz_Pg9RcrkA_evImEjgKDx_bRRZhAQlvPlxZy5c4n-wHFR6Jsb975tTl8I1cM9AuFIs30NbQVQfxI0mmMtlcteO0qAZ8TfzQxhsBu1PYxvTRRagEpx"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}