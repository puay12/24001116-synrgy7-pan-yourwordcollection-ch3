package com.example.yourwordcollection.presentation.navigationcomponent.fragment.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yourwordcollection.R
import com.example.yourwordcollection.databinding.FragmentMainNavigationBinding
import com.example.yourwordcollection.presentation.navigationcomponent.fragment.main.adapter.AlphabetAdapter
import com.example.yourwordcollection.presentation.navigationcomponent.fragment.main.adapter.AlphabetAdapterListener
import com.example.yourwordcollection.data.model.Word
import com.example.yourwordcollection.presentation.viewmodel.main.MainNavigationViewModel

class MainNavigationFragment : Fragment(), AlphabetAdapterListener {
    private val alphabetAdapter = AlphabetAdapter(this)
    private val viewModel by viewModels<MainNavigationViewModel> {
        MainNavigationViewModel.provideFactory(this)
    }
    private lateinit var binding:FragmentMainNavigationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentMainNavigationBinding.inflate(inflater, container, false).also {
            binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData(view.context)
        refresh()
        binding.swipeRefresh.setOnRefreshListener { refresh() }
        binding.seeFavBtn.setOnClickListener { navigateToFavorites() }
    }

    override fun onClickAlphabet(data: Array<Word>) {
        navigateToWordList(data)
    }

    private fun setData(context: Context) {
        binding.alphabetList.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL,
            false
        )
        binding.alphabetList.adapter = alphabetAdapter
        binding.alphabetList.itemAnimator = DefaultItemAnimator()
    }

    private fun refresh() {
        viewModel.getAlphabetLists().observe(this) { alphabetData ->
            alphabetAdapter.submitList(alphabetData)
        }
        binding.swipeRefresh.isRefreshing = false
    }

    private fun navigateToWordList(data: Array<Word>) {
        val bundle = Bundle()

        bundle.putParcelableArray("wordList", data)

        findNavController().navigate(
            R.id.action_mainNavigationFragment_to_wordlistNavigationFragment,
            bundle
        )
    }

    private fun navigateToFavorites() {
        findNavController().navigate(
            R.id.action_mainNavigationFragment_to_favoritesNavigationFragment
        )
    }
}