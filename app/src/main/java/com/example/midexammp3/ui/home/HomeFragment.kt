package com.example.midexammp3.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.midexammp3.R
import com.example.midexammp3.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var recyclerViewAdapter: ExerciseAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val recyclerView = binding.recyclerView
        val layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager

        recyclerViewAdapter = ExerciseAdapter(createPopularList())
        recyclerView.adapter = recyclerViewAdapter
    }

    private fun createPopularList(): List<Popular> {
        val popularList = mutableListOf<Popular>()
        popularList.add(
            Popular(
                R.drawable.popular1,
                "Full Shot Stretching Arm",
                "Beginner",
                "30 min"
            )
        )
        popularList.add(
            Popular(
                R.drawable.popular2,
                "Athlete Practicing Monochrome",
                "Beginner",
                "50 min"
            )
        )


        return popularList
    }
}
