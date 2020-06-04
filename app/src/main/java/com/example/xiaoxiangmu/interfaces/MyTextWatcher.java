package com.example.xiaoxiangmu.interfaces;


import android.text.Editable;
import android.text.TextWatcher;

public abstract class MyTextWatcher implements TextWatcher {

    public void beforeTextChanged(CharSequence s, int start, int count, int after){


    };

    public void onTextChanged(CharSequence s, int start, int before, int count){};

    public void afterTextChanged(Editable s){};
    public abstract void onMyTextChanged(CharSequence s, int start, int before, int count);

}
