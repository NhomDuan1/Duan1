package com.example.duan.modle;

import android.content.Context;

import com.example.duan.R;

import java.util.ArrayList;
import java.util.List;

public class music_dao {
    public static List<music> getAll(Context context){

        List<music>  list = new ArrayList<>();
        list.add(new music(R.drawable.dg,"Bad Boy", "Bigbang", R.raw.badboy));
        list.add(new music(R.drawable.bb,"Bae Bae", "Bigbang", R.raw.baebae));
        list.add(new music(R.drawable.dg,"Bang Bang Bang", "Bigbang", R.raw.bang));
        list.add(new music(R.drawable.bb,"FantasticBaby", "Bigbang", R.raw.fantasticbayby));
        list.add(new music(R.drawable.dg,"Haru Haru", "Bigbang", R.raw.haruharu));
        return list;
    }
}
