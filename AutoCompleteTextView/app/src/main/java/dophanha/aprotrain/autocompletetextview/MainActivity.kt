package dophanha.aprotrain.autocompletetextview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTV)

        val countries = resources.getStringArray(R.array.Countries)
        val countryAdapter = CountryAdapter(this, R.layout.layout_custom, getListCountries())
        autoCompleteTextView.setAdapter(countryAdapter)
    }

    private fun getListCountries(): List<Country> {
        val list: MutableList<Country> = ArrayList()
        list.add(Country("Vietnam"))
        list.add(Country("Venezuela"))
        list.add(Country("Vanuatu"))
        list.add(Country("Vatican City"))
        return list
    }
}