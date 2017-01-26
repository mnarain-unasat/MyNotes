package com.example.mnarain.mynotes.util;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;


import com.example.mnarain.mynotes.R;
import com.example.mnarain.mynotes.activities.AboutUsActivity;
import com.example.mnarain.mynotes.activities.ContactUsActivity;
import com.example.mnarain.mynotes.activities.LoginActivity;

/**
 * Created by mnarain on 1/25/2017.
 */

public class MenuUtil{

    public static Intent getSelectedItemIntent(Context context, int itemId) {
        Intent intent = null;
        switch (itemId) {
            case R.id.aboutUs:
                intent = new Intent(context, AboutUsActivity.class);
                break;
            case R.id.contactUs:
                intent = new Intent(context, ContactUsActivity.class);
                break;
            case R.id.logoutUser:
                intent = new Intent(context, LoginActivity.class);
                break;
        }
        return  intent;
    }


}
