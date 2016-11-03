package kr.co.triggers.yolo.layer.login;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import kr.co.triggers.yolo.R;
import kr.co.triggers.yolo.component.activity.YoloView;
import kr.co.triggers.yolo.databinding.LayoutViewLoginBinding;
import kr.co.triggers.yolo.inject.component.ActivityComponent;
import kr.co.triggers.yolo.inject.component.DaggerActivityComponent;
import kr.co.triggers.yolo.inject.module.ActivityModule;

public class LoginView extends YoloView {

    ActivityComponent component;
    LayoutViewLoginBinding binding;

    @Inject
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        component = DaggerActivityComponent.builder().appComponent(getAppComponent()).activityModule(new ActivityModule(this)).build();
        component.inject(this);

        binding = DataBindingUtil.setContentView(this, R.layout.layout_view_login);
        binding.setPresenter(presenter);
    }

    public void showToast(boolean b) {

        Toast.makeText(this, String.valueOf(b), Toast.LENGTH_SHORT).show();
    }
}
