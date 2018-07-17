package com.cornor.tools.util;

import android.content.Context;
import android.util.TypedValue;

/**
 * Desc:尺寸大小转换
 * User:cornor
 * Date:2018/7/17
 */
public class DimenUtil {

    /**
     * @param context
     * @param dp
     * @return dp -> px
     */
    public static int dpToPx(Context context,int dp){
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
    }

    /**
     * @param context
     * @param sp
     * @return sp -> px
     */
    public static int spToPx(Context context,int sp){
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP, sp, context.getResources().getDisplayMetrics());
    }

    /**
     * @param context
     * @param dp
     * @return dp -> px
     */
    public static int dp2Px(Context context,int dp){
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f * dp);
    }

    /**
     * @param context
     * @param sp
     * @return sp -> px
     */
    public static int sp2Px(Context context,int sp){
        float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (sp * fontScale + 0.5f);
    }


    /**
     * @param context
     * @param px
     * @return px -> dp
     */
    public static int pxToDp(Context context, int px) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (px / scale + 0.5f * (px >= 0 ? 1 : -1));
    }


    /**
     * @param context
     * @param px
     * @return px -> dp
     */
    public static int pxToSp(Context context, int px) {
        float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (px / fontScale + 0.5f);
    }
}
