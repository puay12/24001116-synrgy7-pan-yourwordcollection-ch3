package com.example.yourwordcollection.navigationcomponent.fragment.wordlist

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.example.yourwordcollection.databinding.FragmentWordlistNavigationBinding
import com.example.yourwordcollection.extension.SpacesItemDecoration
import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.adapter.WordlistAdapter
import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.adapter.WordlistAdapterListener
import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.logic.WordlistNavigationLogic
import com.example.yourwordcollection.viewmodel.wordlist.WordlistNavigationViewModel

class WordlistNavigationFragment : Fragment(), WordlistAdapterListener {
    private val wordlistAdapter = WordlistAdapter(this)
    private val viewModel : WordlistNavigationViewModel by viewModels<WordlistNavigationViewModel>()
    private val wordlistLogic = WordlistNavigationLogic()
    private lateinit var binding: FragmentWordlistNavigationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentWordlistNavigationBinding.inflate(inflater, container, false).also {
            binding = it
        }.root
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData(view.context)
        refresh()
        binding.swipeRefresh.setOnRefreshListener { refresh() }
    }

    override fun onClickWord(data: String) {
        navigateToGoogle(data)
    }

    private fun setData(context: Context) {
        binding.wordList.layoutManager = GridLayoutManager(
            context,
            2,
        )
        binding.wordList.adapter = wordlistAdapter
        binding.wordList.itemAnimator = DefaultItemAnimator()
        binding.wordList.addItemDecoration(SpacesItemDecoration(2,20,false))
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun refresh() {
        viewModel.getWordList(arguments!!)?.observe(this) { wordListData ->
            wordlistAdapter.submitList(wordListData)
        }
        binding.swipeRefresh.isRefreshing = false
    }

    private fun navigateToGoogle(keyword: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(wordlistLogic.getGoogleUrl(keyword))
        startActivity(intent)
    }
}