package com.cy.android.vlc

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.videolan.libvlc.LibVLC
import org.videolan.libvlc.util.VLCVideoLayout
import org.videolan.libvlc.MediaPlayer
import tv.danmaku.ijk.media.example.activities.VideoActivity
import java.io.IOException

class MainActivity : AppCompatActivity() {

//    private val VIDEO_URL = "rtsp://192.168.56.1/camera"
    private val VIDEO_URL = "rtsp://10.154.139.119:8554/output.264"
//    private val VIDEO_URL = "rtsp://admin:zxxd1001@192.168.1.63:554/Streaming/Channels/101"
    private val USE_TEXTURE_VIEW = false
    private val ENABLE_SUBTITLES = true

    private lateinit var mVideoLayout: VLCVideoLayout

    private lateinit var mLibVLC: LibVLC
    private lateinit var mMediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val options = ArrayList<String>()
//        options.add("-vvv")
//        options.add("--rtsp-tcp")
////        options.add("--avcodec-threads=124")
////        options.add("--network-caching=100")
////        options.add("--realrtsp-caching=0")
////        options.add("--tcp-caching=0")
////        options.add("--rtsp-frame-buffer-size=0")
////        options.add("--advanced")
//        mLibVLC = LibVLC(this, options)
//        mMediaPlayer = MediaPlayer(mLibVLC)
//
//        mVideoLayout = findViewById(R.id.video_layout)
//        mVideoLayout.keepScreenOn = true

        VideoActivity.intentTo(this, VIDEO_URL, "视频播放")
        finish()
        return
    }

//    override fun onStart() {
//        super.onStart()
//        if (mMediaPlayer != null) {
//            mMediaPlayer.attachViews(mVideoLayout, null, ENABLE_SUBTITLES, USE_TEXTURE_VIEW)
//
//            try {
//                mMediaPlayer.play(Uri.parse(VIDEO_URL))
//            } catch (e: IOException) {
//                e.printStackTrace()
//            }
//        }
//    }
//
//    override fun onStop() {
//        super.onStop()
//        if (mMediaPlayer != null) {
//            mMediaPlayer.stop();
//            mMediaPlayer.detachViews();
//        }
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        if (mMediaPlayer != null) {
//            mMediaPlayer.release();
//            mLibVLC.release();
//        }
//    }
}
