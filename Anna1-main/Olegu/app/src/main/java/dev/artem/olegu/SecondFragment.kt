package dev.artem.olegu

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recycleView)
        button = view.findViewById(R.id.button)
        val list = mutableListOf<ModelRV>() //список куда будут класться элементы для RecycleView
        list.add(
            ModelRV(
                path = "https://ya.ru/",
                name = "ссылка 1"
            )
        )
        list.add(
            ModelRV(
                path = "https://yandex.ru/pogoda/moscow?utm_medium=" +
                        "web&utm_content=main_informer&utm_campaign" +
                        "=informer&utm_source=home&lat=55.755863&lon=37.6177",
                name = "ссылка 2"
            )
        )
        recyclerView.layoutManager = LinearLayoutManager(context)
        //присваем адаптер к  recyclerview
        recyclerView.adapter = Adapter(context = requireContext(), list, this)
        //при нажатии на кнопку накладываем на второй фрагмент ThirdFragment
        button.setOnClickListener(View.OnClickListener { view2 ->
            val transaction = parentFragmentManager.beginTransaction()
            transaction.addToBackStack("")
            transaction.add(R.id.container, ThirdFragment())
            transaction.commit()
        })
    }

}