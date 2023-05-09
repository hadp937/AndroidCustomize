package dophanha.aprotrain.autocompletetextview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Filter
import android.widget.TextView
import java.util.*
import kotlin.collections.ArrayList

class CountryAdapter(context: Context, resource: Int, objects: List<Country>) :
    ArrayAdapter<Country>(context, resource, objects) {

    private val mListCountries: List<Country> = ArrayList(objects)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        if (view == null) {
            view =
                LayoutInflater.from(parent.context).inflate(R.layout.layout_custom, parent, false)
        }

        val tvCountryName = view?.findViewById<TextView>(R.id.tv_country_name)
        val country = getItem(position)
        if (tvCountryName != null) {
            tvCountryName.text = country?.getName()
        }
        return view!!
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val mListSuggest = ArrayList<Country>()
                if (constraint == null || constraint.isEmpty()) {
                    mListSuggest.addAll(mListCountries)
                } else {
                    val filter = constraint.toString().toLowerCase().trim()
                    for (country in mListCountries) {
                        if (country.getName().toLowerCase(Locale.getDefault())
                                .contains(filter)
                        ) {
                            mListSuggest.add(country)
                        }
                    }
                }
                val filterResults = FilterResults()
                filterResults.values = mListSuggest
                filterResults.count = mListSuggest.size

                return filterResults
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults) {
                clear()
                addAll(results.values as List<Country>)
                notifyDataSetInvalidated()
            }

            override fun convertResultToString(resultValue: Any?): CharSequence {
                return (resultValue as Country).getName()
            }
        }
    }
}
