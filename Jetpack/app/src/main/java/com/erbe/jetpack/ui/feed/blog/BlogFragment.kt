package com.erbe.jetpack.ui.feed.blog

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.erbe.jetpack.R
import com.erbe.jetpack.data.model.api.BlogResponse
import com.erbe.jetpack.databinding.FragmentBlogsBinding

class BlogFragment : Fragment(), BlogViewModel.BlogItemClickHandler {

    val viemModel = BlogViewModel()

    private var adapter: BlogListAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentBlogsBinding>(
            inflater, R.layout.fragment_blogs, container, false
        )
        adapter = BlogListAdapter(this)
        binding.listBlogs.adapter = adapter
        val layoutManager = LinearLayoutManager(this.activity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.listBlogs.layoutManager = layoutManager
        viemModel.repoLiveData?.observe(viewLifecycleOwner, Observer {
            adapter?.submitList(it)
        })
        viemModel.progress?.observe(viewLifecycleOwner, Observer {
            adapter?.setNetworkState(it)
        })
        return binding.root
    }

    override fun onBlogItemClicked(blog: BlogResponse.Blog) {
        blog.blogUrl?.let {
            Intent().let {
                it.action = Intent.ACTION_VIEW
                it.addCategory(Intent.CATEGORY_BROWSABLE)
                it.data = Uri.parse(blog.blogUrl)
                activity?.startActivity(it)

            }
        }
    }
}