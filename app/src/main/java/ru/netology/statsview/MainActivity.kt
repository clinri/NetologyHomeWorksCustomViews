package ru.netology.statsview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.netology.statsview.ui.StatsView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<StatsView>(R.id.statsView).data = listOf(
            2000F,
            500F,
            100F,
            410F,
            120F
        )
    }
}