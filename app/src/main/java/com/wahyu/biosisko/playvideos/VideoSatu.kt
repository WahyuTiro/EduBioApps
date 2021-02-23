package com.wahyu.biosisko.playvideos

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerSupportFragment
import com.wahyu.biosisko.R

class VideoSatu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_satu)

        var youTubePlayerFragment = supportFragmentManager.findFragmentById(R.id.youtube_fragment)
                as YouTubePlayerSupportFragment
        youTubePlayerFragment.initialize("AIzaSyDs9HU-22ltIzMgb2ytr4nNiVgC0DsKvgs",object:YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(provider: YouTubePlayer.Provider?, player: YouTubePlayer?, wasRestore: Boolean) {
                if(player == null) return
                if(wasRestore)
                    player.play()
                else{
                    player.cueVideo("WrXkOGeREaw")
                    player.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT)
                }
            }

            override fun onInitializationFailure(provider: YouTubePlayer.Provider?, result: YouTubeInitializationResult?) {
                Log.d("Youtube Player", "Failed to initialize");
            }
        })

    }
}