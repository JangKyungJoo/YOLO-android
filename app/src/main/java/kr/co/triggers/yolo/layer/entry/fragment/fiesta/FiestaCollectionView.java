package kr.co.triggers.yolo.layer.entry.fragment.fiesta;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.co.triggers.yolo.R;
import kr.co.triggers.yolo.component.activity.YoloFragment;
import kr.co.triggers.yolo.databinding.LayoutFragmentFiestaCollectionBinding;

public class FiestaCollectionView extends YoloFragment {

    OnFiestaChangedListener listener;

    LayoutFragmentFiestaCollectionBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.layout_fragment_fiesta_collection, container, false);
        return binding.getRoot();
    }
}
