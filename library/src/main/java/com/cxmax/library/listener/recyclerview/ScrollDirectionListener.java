package com.cxmax.library.listener.recyclerview;

/**
 * 用户行为下滑,上滑
 * Created by caixi on 2016/6/4.
 */
public interface ScrollDirectionListener {

    void onScrollDown();

    void onScrollUp();

    /**
     * View反馈的显示和隐藏行为
     */
    public interface ScrollViewListener{
        void hide();
        void show();
    }
}
