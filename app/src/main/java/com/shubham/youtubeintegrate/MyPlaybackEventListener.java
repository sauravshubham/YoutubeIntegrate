package com.shubham.youtubeintegrate;

import android.widget.Toast;

import com.google.android.youtube.player.YouTubePlayer;

 final class MyPlaybackEventListener implements YouTubePlayer.PlaybackEventListener {

    @Override
    public void onPlaying() {
        // Called when playback starts, either due to user action or call to play().

    }

    @Override
    public void onPaused() {
        // Called when playback is paused, either due to user action or call to pause().

    }

    @Override
    public void onStopped() {
        // Called when playback stops for a reason other than being paused.

    }

    @Override
    public void onBuffering(boolean b) {
        // Called when buffering starts or ends.
    }

    @Override
    public void onSeekTo(int i) {
        // Called when a jump in playback position occurs, either
        // due to user scrubbing or call to seekRelativeMillis() or seekToMillis()
    }
}
