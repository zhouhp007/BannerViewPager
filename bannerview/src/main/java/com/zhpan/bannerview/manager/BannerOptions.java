/*
Copyright 2017 zhpanvip The BannerViewPager Open Source Project

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package com.zhpan.bannerview.manager;

import android.view.View;

import androidx.viewpager2.widget.ViewPager2;

import com.zhpan.bannerview.constants.PageStyle;
import com.zhpan.bannerview.utils.BannerUtils;
import com.zhpan.indicator.enums.IndicatorOrientation;
import com.zhpan.indicator.option.IndicatorOptions;

import static com.zhpan.bannerview.transform.ScaleInTransformer.DEFAULT_MIN_SCALE;

/**
 * <pre>
 *   Created by zhpan on 2019/11/20.
 *   Description:BannerViewPager的配置参数
 * </pre>
 */
@SuppressWarnings("unused")
public class BannerOptions {

  public BannerOptions() {
    mIndicatorOptions = new IndicatorOptions();
    pageMargin = BannerUtils.dp2px(20);
    rightRevealWidth = DEFAULT_REVEAL_WIDTH;
    leftRevealWidth = DEFAULT_REVEAL_WIDTH;
  }

  public static final int DEFAULT_REVEAL_WIDTH = -1000;

  private int offScreenPageLimit = ViewPager2.OFFSCREEN_PAGE_LIMIT_DEFAULT;

  private int interval;

  private boolean isCanLoop;

  private boolean isAutoPlay = false;

  private int indicatorGravity;

  private int pageMargin;

  private int rightRevealWidth;

  private int leftRevealWidth;

  private int pageStyle = PageStyle.NORMAL;

  private float pageScale = DEFAULT_MIN_SCALE;

  private IndicatorMargin mIndicatorMargin;

  private int mIndicatorVisibility = View.VISIBLE;

  private int scrollDuration;

  private float[] roundRadiusArray;

  private int roundRadius;

  private boolean userInputEnabled = true;

  private int orientation = ViewPager2.ORIENTATION_HORIZONTAL;

  private boolean rtl;

  private boolean disallowParentInterceptDownEvent;

  private boolean stopLoopWhenDetachedFromWindow = true;

  private boolean autoScrollSmoothly = true;

  private final IndicatorOptions mIndicatorOptions;

  public int getInterval() {
    return interval;
  }

  public void setInterval(int interval) {
    this.interval = interval;
  }

  public boolean isCanLoop() {
    return isCanLoop;
  }

  public void setCanLoop(boolean canLoop) {
    isCanLoop = canLoop;
  }

  public boolean isAutoPlay() {
    return isAutoPlay;
  }

  public void setAutoPlay(boolean autoPlay) {
    isAutoPlay = autoPlay;
  }

  public int getIndicatorGravity() {
    return indicatorGravity;
  }

  public void setIndicatorGravity(int indicatorGravity) {
    this.indicatorGravity = indicatorGravity;
  }

  public int getIndicatorNormalColor() {
    return mIndicatorOptions.getNormalSliderColor();
  }

  public int getIndicatorCheckedColor() {
    return mIndicatorOptions.getCheckedSliderColor();
  }

  public int getNormalIndicatorWidth() {
    return (int) mIndicatorOptions.getNormalSliderWidth();
  }

  public void setIndicatorSliderColor(int normalColor, int checkedColor) {
    mIndicatorOptions.setSliderColor(normalColor, checkedColor);
  }

  public void setIndicatorSliderWidth(int normalWidth, int checkedWidth) {
    mIndicatorOptions.setSliderWidth(normalWidth, checkedWidth);
  }

  //public void setInteractiveAnimate(Boolean interactiveAnimate) {
  //  mIndicatorOptions.setInteractiveAnimate(interactiveAnimate);
  //}
  //
  //public boolean getInteractiveAnimate(Boolean interactiveAnimate) {
  //  return mIndicatorOptions.getInteractiveAnimate();
  //}

  public void showIndicatorWhenOneItem(boolean showIndicatorWhenOneItem) {
    mIndicatorOptions.setShowIndicatorOneItem(showIndicatorWhenOneItem);
  }

  public int getCheckedIndicatorWidth() {
    return (int) mIndicatorOptions.getCheckedSliderWidth();
  }

  public IndicatorOptions getIndicatorOptions() {
    return mIndicatorOptions;
  }

  public int getPageMargin() {
    return pageMargin;
  }

  public void setPageMargin(int pageMargin) {
    this.pageMargin = pageMargin;
  }

  public int getRightRevealWidth() {
    return rightRevealWidth;
  }

  public void setRightRevealWidth(int rightRevealWidth) {
    this.rightRevealWidth = rightRevealWidth;
  }

  public int getLeftRevealWidth() {
    return leftRevealWidth;
  }

  public void setLeftRevealWidth(int leftRevealWidth) {
    this.leftRevealWidth = leftRevealWidth;
  }

  public int getIndicatorStyle() {
    return mIndicatorOptions.getIndicatorStyle();
  }

  public void setIndicatorStyle(int indicatorStyle) {
    mIndicatorOptions.setIndicatorStyle(indicatorStyle);
  }

  public int getIndicatorSlideMode() {
    return mIndicatorOptions.getSlideMode();
  }

  public void setIndicatorSlideMode(int indicatorSlideMode) {
    mIndicatorOptions.setSlideMode(indicatorSlideMode);
  }

  public float getIndicatorGap() {
    return mIndicatorOptions.getSliderGap();
  }

  public void setIndicatorGap(float indicatorGap) {
    mIndicatorOptions.setSliderGap(indicatorGap);
  }

  public float getIndicatorHeight() {
    return mIndicatorOptions.getSliderHeight();
  }

  public void setIndicatorHeight(int indicatorHeight) {
    mIndicatorOptions.setSliderHeight(indicatorHeight);
  }

  public int getPageStyle() {
    return pageStyle;
  }

  public void setPageStyle(int pageStyle) {
    this.pageStyle = pageStyle;
  }

  public float getPageScale() {
    return pageScale;
  }

  public void setPageScale(float pageScale) {
    this.pageScale = pageScale;
  }

  public IndicatorMargin getIndicatorMargin() {
    return mIndicatorMargin;
  }

  public void setIndicatorMargin(int left, int top, int right, int bottom) {
    mIndicatorMargin = new IndicatorMargin(left, top, right, bottom);
  }

  public boolean isAutoScrollSmoothly() {
    return autoScrollSmoothly;
  }

  public void setAutoScrollSmoothly(boolean autoScrollSmoothly) {
    this.autoScrollSmoothly = autoScrollSmoothly;
  }

  public float[] getRoundRectRadiusArray() {
    return roundRadiusArray;
  }

  public int getRoundRectRadius() {
    return roundRadius;
  }

  public void setRoundRectRadius(int radius) {
    this.roundRadius = radius;
  }

  public void setRoundRectRadius(int topLeftRadius, int topRightRadius, int bottomLeftRadius,
      int bottomRightRadius) {
    roundRadiusArray = new float[8];
    roundRadiusArray[0] = topLeftRadius;
    roundRadiusArray[1] = topLeftRadius;
    roundRadiusArray[2] = topRightRadius;
    roundRadiusArray[3] = topRightRadius;
    roundRadiusArray[4] = bottomRightRadius;
    roundRadiusArray[5] = bottomRightRadius;
    roundRadiusArray[6] = bottomLeftRadius;
    roundRadiusArray[7] = bottomLeftRadius;
  }

  public int getScrollDuration() {
    return scrollDuration;
  }

  public void setScrollDuration(int scrollDuration) {
    this.scrollDuration = scrollDuration;
  }

  public int getIndicatorVisibility() {
    return mIndicatorVisibility;
  }

  public void setIndicatorVisibility(int indicatorVisibility) {
    mIndicatorVisibility = indicatorVisibility;
  }

  public int getOrientation() {
    return orientation;
  }

  public void setOrientation(int orientation) {
    this.orientation = orientation;
    mIndicatorOptions.setOrientation(orientation);
  }

  public boolean isUserInputEnabled() {
    return userInputEnabled;
  }

  public void setUserInputEnabled(boolean userInputEnabled) {
    this.userInputEnabled = userInputEnabled;
  }

  public void resetIndicatorOptions() {
    mIndicatorOptions.setCurrentPosition(0);
    mIndicatorOptions.setSlideProgress(0);
  }

  public boolean isDisallowParentInterceptDownEvent() {
    return disallowParentInterceptDownEvent;
  }

  public void setDisallowParentInterceptDownEvent(boolean disallowParentInterceptDownEvent) {
    this.disallowParentInterceptDownEvent = disallowParentInterceptDownEvent;
  }

  public int getOffScreenPageLimit() {
    return offScreenPageLimit;
  }

  public void setOffScreenPageLimit(int offScreenPageLimit) {
    this.offScreenPageLimit = offScreenPageLimit;
  }

  public boolean isRtl() {
    return rtl;
  }

  public void setRtl(boolean rtl) {
    this.rtl = rtl;
    mIndicatorOptions.setOrientation(
        rtl ? IndicatorOrientation.INDICATOR_RTL : IndicatorOrientation.INDICATOR_HORIZONTAL);
  }

  public boolean isStopLoopWhenDetachedFromWindow() {
    return stopLoopWhenDetachedFromWindow;
  }

  public void setStopLoopWhenDetachedFromWindow(boolean stopLoopWhenDetachedFromWindow) {
    this.stopLoopWhenDetachedFromWindow = stopLoopWhenDetachedFromWindow;
  }

  public static class IndicatorMargin {

    private final int left, right, top, bottom;

    public IndicatorMargin(int left, int top, int right, int bottom) {
      this.left = left;
      this.right = right;
      this.top = top;
      this.bottom = bottom;
    }

    public int getLeft() {
      return left;
    }

    public int getRight() {
      return right;
    }

    public int getTop() {
      return top;
    }

    public int getBottom() {
      return bottom;
    }
  }
}
