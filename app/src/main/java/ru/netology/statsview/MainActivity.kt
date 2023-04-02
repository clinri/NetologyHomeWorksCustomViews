package ru.netology.statsview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import ru.netology.statsview.ui.StatsView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<StatsView>(R.id.statsView)
        view.data = listOf(
            2000F,
            500F,
            100F,
            410F,
            120F
        )
        view.setOnClickListener {
            it.startAnimation(
                AnimationUtils.loadAnimation(this, R.anim.animations)
            )
        }
    }
}