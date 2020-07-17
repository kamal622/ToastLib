package com.kp.mytestlibrary;

import android.app.Activity;
import android.app.ProgressDialog;

public class Globals {

    private static android.app.ProgressDialog progressDialog;

    /* Show progress dialog. */
    public static void showProgressDialog(Activity context) {
        progressDialog = new android.app.ProgressDialog(context);
        progressDialog.setTitle("Loading...");
        progressDialog.setMessage("Please wait...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
    }

    /* Hide progress dialog. */
    public static void hideProgressDialog() {
        // Close it.
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
            progressDialog = null;
        }
    }

}