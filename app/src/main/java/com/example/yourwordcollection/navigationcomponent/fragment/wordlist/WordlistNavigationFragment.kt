package com.example.yourwordcollection.navigationcomponent.fragment.wordlist

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.example.yourwordcollection.databinding.FragmentWordlistNavigationBinding
import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.adapter.WordlistAdapter
import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.adapter.WordlistAdapterListener
import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.data.Word

class WordlistNavigationFragment : Fragment(), WordlistAdapterListener {
    private val wordlistAdapter = WordlistAdapter(this)
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onClickWord(data: String) {
        navigateToGoogle(data)
    }

//    private fun getWordlist(context: Context) {
//        binding.wordList.layoutManager = GridLayoutManager(
//            context,
//            2,
//        )
//        binding.wordList.adapter = wordlistAdapter
//        binding.wordList.itemAnimator = DefaultItemAnimator()
//    }

//    private fun refresh() {
//        wordlistAdapter.submitList(getWordlist())
//        binding.swipeRefresh.isRefreshing = false
//    }

    private fun navigateToGoogle(keyword: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        val word = "$keyword dalam bahasa indonesia"
        intent.setData(Uri.parse("https://www.google.com/search?q=$keyword"))
        startActivity(intent)
    }
}