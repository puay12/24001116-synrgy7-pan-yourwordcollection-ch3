package com.example.yourwordcollection.navigationcomponent.fragment.main

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yourwordcollection.R
import com.example.yourwordcollection.databinding.FragmentMainNavigationBinding
import com.example.yourwordcollection.navigationcomponent.fragment.main.adapter.AlphabetAdapter
import com.example.yourwordcollection.navigationcomponent.fragment.main.adapter.AlphabetAdapterListener
import com.example.yourwordcollection.navigationcomponent.fragment.main.data.Alphabet
import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.data.Word
import com.example.yourwordcollection.viewmodel.MainNavigationViewModel

class MainNavigationFragment : Fragment(), AlphabetAdapterListener {
    private val alphabetAdapter = AlphabetAdapter(this)
    private val viewModel : MainNavigationViewModel by viewModels<MainNavigationViewModel>()
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
        alphabetAdapter.submitList(viewModel.getAlphabetLists())
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
}