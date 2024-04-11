package com.example.lab13;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedInputStream;

public class HttpRequest {
    Activity mainOrig;

    class Student implements Runnable {

        String target;
        public void run() {
            try {
                URL url = new URL(target);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                BufferedInputStream inp = new BufferedInputStream(con.getInputStream());

                byte[] buf = new byte[100];
                String res = "";

                while (true)
                {
                    int n = inp.read(buf);
                    if (n <= 0) break;
                    Log.e("yolo","2");
                    res += new String(buf, 0, n);
                }

                con.disconnect();
                Log.e("yolo","3");
                final String res2 = res;
                mainOrig.runOnUiThread(new Runnable() {public void run() {on_request_complete(res2);}});
            }
            catch (Exception e) {Log.e("Error",e.toString());}
        }
    }
    public void on_request_complete(String response) {
    }
    public void make_request(String endpoint){
        Student s = new Student();
        s.target = endpoint;

        Thread t = new Thread(s);
        t.start();
    }
    public HttpRequest(Activity main){
        this.mainOrig = main;
    }
}
