package dophanha.aprotrain.customfoldingcell


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rcvItems: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcvItems = findViewById(R.id.rcv_item)
        val linearLayoutManager = LinearLayoutManager(this)
        rcvItems.layoutManager = linearLayoutManager

        val itemAdapter = ItemAdapter()
        itemAdapter.setData(getListItems())
        rcvItems.adapter = itemAdapter
    }

    private fun getListItems(): List<ItemObject> {
        val list = ArrayList<ItemObject>()
        for (i in 0 until 5) {
            list.add(ItemObject("Open Here $i", "Xin Chào Đây Là Hà thứ $i"))
        }
        return list
    }
}
