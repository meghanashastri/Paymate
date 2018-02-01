package com.example.meg.paymate.utils;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by meg on 01/02/18.
 */

public class FontManager {

    public static final String ROOT = "fonts/",
            FONTAWESOME = ROOT + "fontawesome-webfont.ttf";

    public static final String SIMPLELINE = ROOT + "Simple-Line-Icons.ttf";

    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }
}