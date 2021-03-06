package org.wordpress.mediapickersample.source;

import android.content.Context;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.toolbox.ImageLoader;

import org.wordpress.mediapicker.MediaItem;
import org.wordpress.mediapicker.source.MediaSource;

/**
 * Demo class that contains no media data.
 */

public class MediaSourceEmpty implements MediaSource {
    private OnMediaChange mListener;

    @Override
    public void gather(Context context) {
        if (mListener != null) {
            mListener.onMediaLoaded(true);
        }
    }

    @Override
    public void cleanup() {
    }

    @Override
    public void setListener(OnMediaChange listener) {
        mListener = listener;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public MediaItem getMedia(int position) {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent, LayoutInflater inflater, ImageLoader.ImageCache cache) {
        return null;
    }

    @Override
    public boolean onMediaItemSelected(MediaItem mediaItem, boolean selected) {
        return false;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
