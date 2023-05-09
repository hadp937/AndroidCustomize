package dophanha.aprotrain.customspinner

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class CategoryAdapter(context: Context, resource: Int, objects: List<Category>) :
    ArrayAdapter<Category>(context, resource, objects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_selected, parent, false)
        }
        val tvSelected: TextView = itemView!!.findViewById(R.id.tv_selected)

        val category: Category? = getItem(position)
        category?.let {
            tvSelected.text = it.name
        }
        return itemView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_category, parent, false)
        }
        val tvCategory: TextView = itemView!!.findViewById(R.id.tv_category)

        val category: Category? = getItem(position)
        category?.let {
            tvCategory.text = it.name
        }
        return itemView
    }
}







