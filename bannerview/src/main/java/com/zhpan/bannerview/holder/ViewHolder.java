package com.zhpan.bannerview.holder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zhpan on 2017/10/30.
 * Description:
 */

public interface ViewHolder<T> {
    View createView(ViewGroup viewGroup,Context context, int position);

    /**
     * @param context context
     * @param data 实体类对象
     * @param position 当前位置
     * @param size 页面个数
     */
    void onBind(Context context,T data,int position,int size);
}
