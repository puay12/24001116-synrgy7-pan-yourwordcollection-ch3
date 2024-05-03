package com.example.yourwordcollection.presentation.navigationcomponent.fragment.favorites

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.example.yourwordcollection.data.model.Word
import com.example.yourwordcollection.databinding.FragmentFavoritesNavigationBinding
import com.example.yourwordcollection.extension.SpacesItemDecoration
import com.example.yourwordcollection.presentation.navigationcomponent.fragment.favorites.adapter.FavoritesAdapter
import com.example.yourwordcollection.presentation.navigationcomponent.fragment.favorites.adapter.FavoritesAdapterListener
import com.example.yourwordcollection.presentation.viewmodel.favorites.FavoritesNavigationViewModel
import com.google.android.material.snackbar.Snackbar

class FavoritesNavigationFragment : Fragment(), FavoritesAdapterListener {
    private val viewModel : FavoritesNavigationViewModel by viewModels<FavoritesNavigationViewModel>() {
        FavoritesNavigationViewModel.provideFactory(this, requireActivity().applicationContext)
    }
    private val favoritesAdapter = FavoritesAdapter(this)
    private lateinit var binding: FragmentFavoritesNavigationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentFavoritesNavigationBinding.inflate(inflater, container, false).also {
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

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onClickRemove(data: Word) {
        viewModel.getFavoriteByName(data.name).observe(this) { word ->
            viewModel.deleteFromFavorite(word)
            Snackbar.make(
                binding.root,
                "Berhasil menghapus kata dari daftar favorite",
                Snackbar.LENGTH_SHORT
            ).show()
        }
    }

    private fun setData(context: Context) {
        binding.favWordList.layoutManager = GridLayoutManager(
            context,
            2,
        )
        binding.favWordList.adapter = favoritesAdapter
        binding.favWordList.itemAnimator = DefaultItemAnimator()
        binding.favWordList.addItemDecoration(SpacesItemDecoration(2,15,false))
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun refresh() {
        viewModel.getFavoriteList()?.observe(this) { favoriteList ->
            favoritesAdapter.submitList(favoriteList)
        }
        binding.swipeRefresh.isRefreshing = false
    }

    private fun navigateToGoogle(keyword: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.google.com/search?q=${keyword} adalah")
        startActivity(intent)
    }
}