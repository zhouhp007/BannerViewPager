package com.example.zhpan.circleviewpager.activity;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.zhpan.circleviewpager.R;
import com.example.zhpan.circleviewpager.bean.CustomBean;
import com.example.zhpan.circleviewpager.viewholder.CustomPageViewHolder;
import com.zhpan.bannerview.BannerViewPager;

import java.util.ArrayList;
import java.util.List;

public class CustomerBannerPageActivity extends AppCompatActivity {
    private BannerViewPager<CustomBean, CustomPageViewHolder> mViewPager;
    private int[] imgRes = {R.drawable.guide0, R.drawable.guide1, R.drawable.guide2};
    private String[] des = {"在这里\n你可以听到周围人的心声", "在这里\nTA会在下一秒遇见你", "在这里\n不再错过可以改变你一生的人"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_banner);
        getData();
        setupViewPager();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewPager.stopLoop();
    }

    private void setupViewPager() {
        mViewPager = findViewById(R.id.viewpager);
        mViewPager.setAutoPlay(false)
                .setCanLoop(false)
                .setIndicatorVisibility(View.GONE)
                .setOnPageClickListener(position -> Toast.makeText(CustomerBannerPageActivity.this,
                        "点击页面" + mViewPager.getCurrentItem(), Toast.LENGTH_SHORT).show())
                .setHolderCreator(() -> {
                    CustomPageViewHolder customPageViewHolder = new CustomPageViewHolder();
                    customPageViewHolder.setOnSubViewClickListener((view, position) -> Toast.makeText(CustomerBannerPageActivity.this,
                            "立即体验" + position, Toast.LENGTH_SHORT).show());
                    return customPageViewHolder;
                }).create(getData());
    }

    private List<CustomBean> getData() {
        List<CustomBean> list = new ArrayList<>();
        for (int i = 0; i < imgRes.length; i++) {
            CustomBean customBean = new CustomBean();
            customBean.setImageRes(imgRes[i]);
            customBean.setImageDescription(des[i]);
            list.add(customBean);
        }
        return list;
    }
}
