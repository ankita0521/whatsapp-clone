package com.example.whatsapp.Adapter;


import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.whatsapp.CallFragment;
import com.example.whatsapp.ChatFragment;
import com.example.whatsapp.StatusFragment;

import javax.net.ssl.SSLEngineResult;

public class FragAdapter extends FragmentPagerAdapter {
    private Context mCOntext;
    private int tabCount;


    public FragAdapter(FragmentManager fm , Context context, int tabs) {
        super(fm);
        this.mCOntext = context;
        this.tabCount = tabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:

                CallFragment callFragment = new CallFragment();
                return callFragment;
            case 1:
                ChatFragment chatFragment =new ChatFragment();
                return chatFragment;
            case 2:
                StatusFragment statusFragment=new StatusFragment();
                return statusFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;

    }
}
