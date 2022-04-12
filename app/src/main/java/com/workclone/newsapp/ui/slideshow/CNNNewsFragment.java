package com.workclone.newsapp.ui.slideshow;

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
import com.workclone.newsapp.databinding.FragmentSlideshowBinding;

public class CNNNewsFragment extends Fragment {

    private CNNViewModel CNNViewModel;
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CNNViewModel =
                new ViewModelProvider(this).get(CNNViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        WebView webView = root.findViewById(R.id.webviewcnn);
        webView.loadUrl("https://us.cnn.com/?iref=intlglobal/index.html");
        webView.setWebViewClient(new WebViewControllerClass());
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}