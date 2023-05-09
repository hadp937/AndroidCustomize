package dophanha.aprotrain.customfoldingcell

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ramotion.foldingcell.FoldingCell
import dophanha.aprotrain.customfoldingcell.R
import dophanha.aprotrain.customfoldingcell.ItemAdapter.ItemViewFolder

class ItemAdapter : RecyclerView.Adapter<ItemViewFolder>() {

    private var mListItems: List<ItemObject>? = null

    fun setData(list: List<ItemObject>) {
        mListItems = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewFolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)
        return ItemViewFolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewFolder, position: Int) {
        val itemObject = mListItems?.get(position)
        if (itemObject == null) {
            return
        }
        holder.tvOpen.text = itemObject.open
        holder.tvContent.text = itemObject.content

        holder.foldingCell.setOnClickListener {
            holder.foldingCell.toggle(false)
        }
        holder.tvOpen.setOnClickListener {
            Toast.makeText(it.context, itemObject.open, Toast.LENGTH_SHORT).show()
        }
        holder.tvContent.setOnClickListener {
            Toast.makeText(it.context, itemObject.content, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return mListItems?.size ?: 0
    }

    inner class ItemViewFolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var foldingCell: FoldingCell = itemView.findViewById(R.id.folding_cell)
        var tvOpen: TextView = itemView.findViewById(R.id.tv_open)
        var tvContent: TextView = itemView.findViewById(R.id.tv_content)
    }
}
