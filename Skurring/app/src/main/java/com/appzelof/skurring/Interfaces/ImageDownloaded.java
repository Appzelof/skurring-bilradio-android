package com.appzelof.skurring.Interfaces;

import android.graphics.Bitmap;

public interface ImageDownloaded {
    void imageDownloaded(Bitmap imageDownloaded);
    void imageJSONURL(String url);
    void errorGettingImageFromJSON();
}
