package lat.pam.recyclerviewsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Ambil RecyclerView berdasarkan ID
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // 2. Buat Layout Manager (vertikal)
        recyclerview.layoutManager = LinearLayoutManager(this)

        // 3. Siapkan data
        val data = ArrayList<ItemsViewModel>()
        for (i in 1..20) {
            data.add(ItemsViewModel("Item " + i))
        }

        // 4. Masukkan data ke Adapter
        val adapter = CustomAdapter(data)
        Log.d("test string", "Jumlah data: " + data.size)

        // 5. Pasang Adapter ke RecyclerView
        recyclerview.adapter = adapter
    }
}