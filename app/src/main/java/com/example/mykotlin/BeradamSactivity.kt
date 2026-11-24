package com.example.mykotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BeradamSactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beradas)

        findViewById<Button>(R.id.tombollaptop)?.setOnClickListener {
            startActivity(Intent(this, DatalaptopActivity::class.java))
        }
        findViewById<Button>(R.id.tombolpembeli )?.setOnClickListener {
            startActivity(Intent(this, DataPembeliActivity::class.java))
        }
        findViewById<Button>(R.id.tombolpaket)?.setOnClickListener {
            startActivity(Intent(this, DataPaketActivity::class.java))
        }
        findViewById<Button>(R.id.tombolbeli)?.setOnClickListener {
            startActivity(Intent(this, DataBeliCashActivity::class.java))
        }
        findViewById<Button>(R.id.tombolkredit)?.setOnClickListener {
            startActivity(Intent(this, DataBeliKreditActivity::class.java))
        }
        findViewById<Button>(R.id.tombolcicilan)?.setOnClickListener {
            startActivity(Intent(this, DataBayarCicilanActivity::class.java))
        }
    }
}
