package space.levan.videodemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by WangZhiYao on 16/9/14.
 */
public class MainActivity extends AppCompatActivity
{
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tv_fullscreen)
    TextView mTvFullScreen;
    @OnClick(R.id.tv_fullscreen)
    public void onClick()
    {
        startActivity(new Intent(MainActivity.this, VideoPlayActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mTvFullScreen.setText(R.string.main_btn_play_demo);
        mToolbar.setTitle(getResources().getString(R.string.app_name));
    }
}