package campalans.m8.m08_uf3_a02

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView.OnItemSelectedListener
import androidx.recyclerview.widget.RecyclerView

class SuperheroAdapter(
    var superHeroList: List<SuperheroItemResponse> = emptyList(),
    private val onItemSelected:(String) -> Unit
) :
    RecyclerView.Adapter<SuperheroViewHolder>() {

    fun updateList(list: List<SuperheroItemResponse>){
        superHeroList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        return SuperheroViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_superhero, parent, false)
        )
    }

    override fun onBindViewHolder(viewholder: SuperheroViewHolder, position: Int) {
        viewholder.bind(superHeroList[position],onItemSelected)
    }

    override fun getItemCount() = superHeroList.size

}
