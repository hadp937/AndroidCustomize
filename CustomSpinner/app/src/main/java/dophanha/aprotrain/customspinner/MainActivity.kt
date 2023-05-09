package dophanha.aprotrain.customspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var spnCategory: Spinner
    private lateinit var categoryAdapter: CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spnCategory = findViewById(R.id.spn_category)
        categoryAdapter = CategoryAdapter(this, R.layout.item_selected, getListCategory())
        spnCategory.adapter = categoryAdapter
        spnCategory.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>,
                view: View?,
                i: Int,
                l: Long
            ) {
                Toast.makeText(
                    this@MainActivity,
                    categoryAdapter.getItem(i)?.name,
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(adapterView: AdapterView<*>) {

            }
        }
    }
    private fun getListCategory(): List<Category> {
        val list: MutableList<Category> = ArrayList()
        list.add(Category("Học lập trình Android"))
        list.add(Category("Học lập trình IOS"))
        list.add(Category("Học lập trình PHP"))
        list.add(Category("Học lập trình Java"))
        list.add(Category("Học lập trình C++"))
        return list
    }
}