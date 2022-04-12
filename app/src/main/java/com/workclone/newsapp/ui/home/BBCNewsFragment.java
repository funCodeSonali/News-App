package com.workclone.newsapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.workclone.newsapp.R;
import com.workclone.newsapp.WebViewControllerClass;
import com.workclone.newsapp.databinding.FragmentHomeBinding;

public class BBCNewsFragment extends Fragment {

    private BBCViewModel BBCViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BBCViewModel =
                new ViewModelProvider(this).get(BBCViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        WebView webView = root.findViewById(R.id.webviewbbc);
        webView.loadUrl("https://www.bbc.com/news");
        webView.setWebViewClient(new WebViewControllerClass());
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}