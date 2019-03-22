package com.example.jonathan.challenge1_part1_jonathan_sekula;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.widget.ImageView;


public class PhotoHandler implements Camera.PictureCallback {

    private final Context context;
    ImageView image;

    public PhotoHandler(Context context, ImageView imageView) {
        this.context = context;
        image = imageView;
    }

    @Override
    public void onPictureTaken(byte[] data, Camera camera) {
        Bitmap bmp = BitmapFactory.decodeByteArray(data, 0, data.length);
        image.setImageBitmap(bmp);
    }

}
