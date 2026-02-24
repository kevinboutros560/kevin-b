package com.example.kevinapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvNews)

        val newsList = listOf(
            News("Android 15 Update",
                "New privacy and performance improvements were announced.",
                R.mipmap.ic_launcher_round),

            News("AI Breakthrough",
                "Researchers achieved record accuracy in benchmarks.",
                R.mipmap.ic_launcher_round),

            News("Space Mission Success",
                "The capsule returned safely after months in orbit.",
                R.mipmap.ic_launcher_round),

            News("Cybersecurity Alert",
                "A major vulnerability is being patched worldwide.",
                R.mipmap.ic_launcher_round),

            News("Tech Stocks Rise",
                "Markets reacted positively to strong earnings.",
                R.mipmap.ic_launcher_round),

            News("New App Trend",
                "Minimal productivity apps are trending this week.",
                R.mipmap.ic_launcher_round)
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = NewsAdapter(newsList)

        // Divider between items (Bonus)
        recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
    }
}