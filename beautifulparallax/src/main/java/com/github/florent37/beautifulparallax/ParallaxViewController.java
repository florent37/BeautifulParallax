package com.github.florent37.beautifulparallax;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.nineoldandroids.view.ViewHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by florentchampigny on 05/08/15.
 */
public class ParallaxViewController extends RecyclerView.OnScrollListener {

    int PARALLAX_SPEED = 100;

    protected List<ImageView> imageViewList = new ArrayList<>();

    public void registerImageParallax(RecyclerView recyclerView) {
        recyclerView.addOnScrollListener(this);
    }

    public void imageParallax(ImageView imageView) {
        if (!imageViewList.contains(imageView))
            imageViewList.add(imageView);
    }

    @Override
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        super.onScrollStateChanged(recyclerView, newState);
    }

    public static float limit(float min, float value, float max) {
        return Math.max(Math.min(value, max), min);
    }

    View firstVisibleView = null;
    float recyclerviewCenterY = -1;
    Rect rect = new Rect();
    View currentImageView;

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        if (recyclerView.getChildCount() > 0) {
            if (firstVisibleView == null) firstVisibleView = recyclerView.getChildAt(0);
            if (recyclerviewCenterY == -1) recyclerviewCenterY = recyclerView.getMeasuredHeight() / 2 + recyclerView.getTop();

            for (int i = 0, count = imageViewList.size(); i < count; ++i) {
                currentImageView = imageViewList.get(i);
                currentImageView.getGlobalVisibleRect(rect);

                float yOffset = limit(-1, (recyclerviewCenterY - rect.top) / currentImageView.getHeight(), 1);
                ViewHelper.setTranslationY(currentImageView,(-1f + yOffset) * PARALLAX_SPEED);
            }
        }
    }
}
