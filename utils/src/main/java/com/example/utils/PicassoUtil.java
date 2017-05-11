package com.example.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import java.io.File;
import java.lang.reflect.Field;

/**
 * ================================================
 * 作    者：Blizzard-liu
 * 版    本：1.0
 * 创建日期：2017/5/11 13:42
 * 描    述：图片显示工具类  compile 'com.squareup.picasso:picasso:2.5.2'
 * 修订历史：
 * ================================================
 */

public class PicassoUtil {
    /**
     * 缩略图最大值
     */
    private int thumMaxSize = 300;
    /**
     * 压缩图片的最大值
     */
    private int maxSize = 960;
    /**
     * 圆形头像
     */
    private int percentX = 90;
    /**
     * 设置正在加载图片的默认图
     */
    private int load_image = R.mipmap.ic_launcher;
    /**
     * 设置加载图片失败的默认图
     */
    private int load_error = R.mipmap.ic_launcher;


    public PicassoUtil() {

    }

    /**
     * 单例
     */
    private static PicassoUtil picassoUtil = null;

    /**
     * 获取操作单例
     *
     * @return 返回操作对象
     */
    public static PicassoUtil getInstantiation() {
        if (picassoUtil == null) {
            synchronized (PicassoUtil.class) {
                if (picassoUtil == null) {
                    picassoUtil = new PicassoUtil();
                }
            }
        }
        return picassoUtil;
    }


    /**
     * 设置缩略图最大边值 默认为300
     * <p/>
     * 最大值是根据图片的方向决定的，横图（标示宽的边长 高自动计算） 竖图（标示高的边长 宽度自动计算）
     * <p/>
     * 根据图片最边长值会计算出另一个边长的比值
     *
     * @param thumMaxSize 最大边值
     * @return picassoUtil 操作实例
     */
    public PicassoUtil setThumMaxSize(int thumMaxSize) {
        if (thumMaxSize > 0) {
            this.thumMaxSize = thumMaxSize;
        }
        return picassoUtil;
    }

    /**
     * 设置压缩图片的最大边值 默认960
     * <p/>
     * 最大值是根据图片的方向决定的，横图（标示宽的边长 高自动计算） 竖图（标示高的边长 宽度自动计算）
     * <p/>
     * 根据图片最边长值会计算出另一个边长的比值
     *
     * @param maxSize 最大边长值
     * @return picassoUtil 操作实例
     */
    public PicassoUtil setMaxSize(int maxSize) {
        if (maxSize > 0) {
            this.maxSize = maxSize;
        }
        return picassoUtil;
    }

    /**
     * 设置头像的直径值
     *
     * @param percentX 直径值
     * @return picassoUtil 操作实例
     */
    public PicassoUtil setPercentX(int percentX) {
        if (percentX > 0) {
            this.percentX = percentX;
        }

        return picassoUtil;
    }

    /**
     * 设置正在加载的默认图片
     * <p/>
     * R.mipmap.ic_launcher;
     * <p/>
     *
     * @param load_image 图片的资源id
     * @return picassoUtil 操作实例
     */
    public PicassoUtil setLoad_image(int load_image) {
        if (load_image > 0) {
            this.load_image = load_image;
        }
        return picassoUtil;
    }

    /**
     * 设置加载失败的图片
     * <p/>
     * R.mipmap.ic_launcher;
     * <p/>
     *
     * @param load_error 图片的资源id
     * @return picassoUtil 操作实例
     */
    public PicassoUtil setLoad_error(int load_error) {
        if (load_error > 0) {
            this.load_error = load_error;
        }

        return picassoUtil;
    }


    /**
     * 固定大小的缩略图 设置显示缩略图 没有带标记 使用于显示单张图片
     *
     * @param path      图片路径
     * @param imageView 显示图片的控件
     */
    public void onThumbnail(Context context, String path, ImageView imageView) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(path).transform(new Thumformation()).config(Bitmap.Config.RGB_565).placeholder(load_image).error(load_error).into(imageView);
        }
    }

    /**
     * 固定大小的缩略图 加载本地图片 没有标记，适用于单张图片显示或详情
     *
     * @param path      图片路径
     * @param imageView 显示控件
     */
    public void onLocadThumbnail(Context context, String path, ImageView imageView) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(new File(path)).transform(new Thumformation()).config(Bitmap.Config.RGB_565).placeholder(load_image).error(load_error).into(imageView);
        }
    }

    /**
     * 固定大小的缩略图 加载本地图片 有标记，适用于列表显示
     *
     * @param path
     * @param imageView
     * @param tag
     */
    public void onLocadThumbnail(Context context, String path, ImageView imageView, Object tag) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(new File(path)).tag(tag).transform(new Thumformation()).config(Config.RGB_565).placeholder(load_image).error(load_error).into(imageView);
        }
    }

    /**
     * 固定大小的缩略图 设置显示缩略图 没有带标记 使用于显示列表图片
     *
     * @param path      图片的下载路径
     * @param imageView 实现图片的控件
     * @param tag       标记
     */
    public void onThumbnail(Context context, String path, ImageView imageView, Object tag) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(path).tag(tag).transform(new Thumformation()).config(Config.RGB_565).placeholder(load_image).error(load_error).into(imageView);
        }
    }

    /**
     * 不压缩 显示原图的图片，用于预览大图效果
     *
     * @param path      图片路径
     * @param imageView 显示图片控件
     */
    public void onBigNetImage(Context context, String path, ImageView imageView) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(path).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).config(Config.RGB_565).placeholder(load_image).error(load_error).into(imageView);
        }
    }

    /**
     * 不压缩 显示本地原图的图片，用于预览大图效果
     *
     * @param path      图片路径
     * @param imageView 显示图片控件
     */
    public void onLocadBigNetImage(Context context, String path, ImageView imageView) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(new File(path)).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).config(Config.RGB_565).placeholder(load_image).error(load_error)
                    .into(imageView);
        }
    }

    /**
     * 显示压缩的原图 ，用于预览大图效果
     *
     * @param path      图片路径
     * @param imageView 显示图片控件
     */
    public void onCompressBigImage(Context context, String path, ImageView imageView) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(path).transform(new Bigformation()).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).config(Config.RGB_565).placeholder(load_image)
                    .error(load_error).into(imageView);
        }
    }

    /**
     * 显示本地压缩的原图 ，用于预览大图效果
     *
     * @param path      图片路径
     * @param imageView 显示图片控件
     */
    public void onLocadCompressBigImage(Context context, String path, ImageView imageView) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(new File(path)).transform(new Bigformation()).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).config(Config.RGB_565)
                    .placeholder(load_image).error(load_error).into(imageView);
        }
    }

    /**
     * 设置圆形头像 使用于单个头像
     *
     * @param path      路径
     * @param imageView 显示控件
     */
    public void onRoundnessImage(Context context, String path, ImageView imageView) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(path).transform(new RoundnessFormation()).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).config(Config.RGB_565).placeholder(load_image)
                    .error(load_error).into(imageView);
        }
    }

    /**
     * 设置本地图片圆形头像 使用于单个头像
     *
     * @param path      路径
     * @param imageView 显示控件
     */
    public void onLocadRoundnessImage(Context context, String path, ImageView imageView) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(new File(path)).transform(new RoundnessFormation()).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).config(Config.RGB_565)
                    .placeholder(load_image).error(load_error).into(imageView);
        }
    }

    /**
     * 设置圆形头像 使用列表
     *
     * @param path      图片路径
     * @param imageView 显示控件
     * @param tag       标记
     */
    public void onRoundnessImage(Context context, String path, ImageView imageView, Object tag) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(path).tag(tag).transform(new RoundnessFormation()).config(Config.RGB_565).placeholder(load_image).error(load_error).into(imageView);
        }
    }

    /**
     * 设置圆形头像 使用列表
     *
     * @param path      图片路径
     * @param imageView 显示控件
     * @param tag       标记
     */
    public void onLocadRoundnessImage(Context context, String path, ImageView imageView, Object tag) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(new File(path)).tag(tag).transform(new RoundnessFormation()).config(Config.RGB_565).placeholder(load_image).error(load_error).into(imageView);
        }
    }

    /**
     * 根据显示控件压缩图片 适用于单张图片或详情
     *
     * @param path      图片路径
     * @param imageView 显示控件
     */
    public void onWidgetImage(Context context, String path, ImageView imageView) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(path).transform(new Widgetformation(imageView)).config(Config.RGB_565).placeholder(load_image).error(load_error).into(imageView);
        }
    }

    /**
     * 加载本地图片
     * <p/>
     * 根据显示控件压缩图片 适用于单张图片或详情
     *
     * @param path      图片路径
     * @param imageView 显示控件
     */
    public void onLocadWidgetImage(Context context, String path, ImageView imageView) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(new File(path)).transform(new Widgetformation(imageView)).config(Config.RGB_565).placeholder(load_image).error(load_error).into(imageView);
        }
    }

    /**
     * 根据图片控件大小压缩图片， 适用于列表显示
     *
     * @param path      图片路径
     * @param imageView 显示控件
     * @param tag       标记
     */
    public void onWidgetImage(Context context, String path, ImageView imageView, Object tag) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(path).tag(tag).transform(new Widgetformation(imageView)).config(Config.RGB_565).placeholder(load_image).error(load_error).into(imageView);
        }
    }

    /**
     * 加载本地图片
     * <p/>
     * 根据图片控件大小压缩图片， 适用于列表显示
     *
     * @param path      图片路径
     * @param imageView 显示控件
     * @param tag       标记
     */
    public void onLocadWidgetImage(Context context, String path, ImageView imageView, Object tag) {
        if (!TextUtils.isEmpty(path) && null != imageView) {
            Picasso.with(context).load(new File(path)).tag(tag).transform(new Widgetformation(imageView)).config(Config.RGB_565).placeholder(load_image).error(load_error).into(imageView);
        }
    }

    /**
     * @Description 自定裁剪圆形图片
     * @date 2015年11月20日
     * Inc. All rights reserved.
     */
    public class RoundnessFormation implements Transformation {

        @Override
        public String key() {
            return "square()";
        }

        @Override
        public Bitmap transform(Bitmap source) {
            Bitmap squaredBitmap = Bitmap.createScaledBitmap(source, percentX, percentX, true);
            if (squaredBitmap != source) {
                source.recycle();
            }
            Bitmap bitmap = Bitmap.createBitmap(percentX, percentX, Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            Paint paint = new Paint();
            BitmapShader shader = new BitmapShader(squaredBitmap, BitmapShader.TileMode.CLAMP, BitmapShader.TileMode.CLAMP);
            paint.setShader(shader);
            paint.setAntiAlias(true);
            float r = percentX / 2f;
            canvas.drawCircle(r, r, r, paint);
            squaredBitmap.recycle();
            return bitmap;
        }
    }

    /**
     * @Description 自定义压缩图片的方式
     * @date 2015年11月20日
     * Inc. All rights reserved.
     */
    public class Bigformation implements Transformation {
        @Override
        public Bitmap transform(Bitmap source) {
            // 压缩图片的尺寸属性对象
            Size newSize = getNewSize(source.getWidth(), source.getHeight());
            // 创建一个新的位图，如果原图的大小小于指定的大小，则就返回原图，如果原图的大小比指定的大小大就用指定的大小生成新的位图
            Bitmap result = Bitmap.createScaledBitmap(source, newSize.width, newSize.height, true);
            if (result != source) {
                source.recycle();
            }
            return result;
        }

        @Override
        public String key() {
            return "square()";
        }
    }

    /**
     * @Description 根据显示控件压缩图片大小
     * @date 2015年11月20日
     * Inc. All rights reserved.
     */
    public class Widgetformation implements Transformation {
        private ImageView imageview;

        public Widgetformation(ImageView imageview) {
            this.imageview = imageview;
        }

        @Override
        public Bitmap transform(Bitmap source) {
            // 压缩图片的尺寸属性对象
            Size newSize = getImageViewSize(imageview);
            // 创建一个新的位图，如果原图的大小小于指定的大小，则就返回原图，如果原图的大小比指定的大小大就用指定的大小生成新的位图
            Bitmap result = Bitmap.createScaledBitmap(source, newSize.width, newSize.height, true);
            if (result != source) {
                source.recycle();
            }
            return result;
        }

        @Override
        public String key() {
            return "square()";
        }
    }

    /**
     * @Description 自定义压缩缩略图的方式
     * @date 2015年11月20日
     * Inc. All rights reserved.
     */
    public class Thumformation implements Transformation {
        @Override
        public Bitmap transform(Bitmap source) {
            // 缩略图的尺寸属性对象
            Bitmap result = Bitmap.createScaledBitmap(source, thumMaxSize, thumMaxSize, true);
            if (result != source) {
                source.recycle();
            }
            return result;
        }

        @Override
        public String key() {
            return "square()";
        }
    }

    /**
     * 获取显示控件的大小
     *
     * @param imageView 显示控件
     * @return

     */
    private Size getImageViewSize(ImageView imageView) {

        Size imageSize = new Size();

        DisplayMetrics displayMetrics = imageView.getContext().getResources().getDisplayMetrics();

        ViewGroup.LayoutParams lp = imageView.getLayoutParams();

        int width = imageView.getWidth();// 获取imageview的实际宽度
        if (width <= 0) {
            width = lp.width;// 获取imageview在layout中声明的宽度
        }
        if (width <= 0) {
            // width = imageView.getMaxWidth();// 检查最大值
            width = getImageViewFieldValue(imageView, "mMaxWidth");
        }
        if (width <= 0) {
            width = displayMetrics.widthPixels;
        }

        int height = imageView.getHeight();// 获取imageview的实际高度
        if (height <= 0) {
            height = lp.height;// 获取imageview在layout中声明的宽度
        }
        if (height <= 0) {
            height = getImageViewFieldValue(imageView, "mMaxHeight");// 检查最大值
        }
        if (height <= 0) {
            height = displayMetrics.heightPixels;
        }
        imageSize.width = width;
        imageSize.height = height;

        return imageSize;
    }

    /**
     * 通过反射技术获取显示控件的对象
     *
     * @param object    对象
     * @param fieldName 方法名称
     * @return
     */
    private static int getImageViewFieldValue(Object object, String fieldName) {
        int value = 0;
        try {
            Field field = ImageView.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            int fieldValue = field.getInt(object);
            if (fieldValue > 0 && fieldValue < Integer.MAX_VALUE) {
                value = fieldValue;
            }
        } catch (Exception e) {
        }
        return value;
    }

    /**
     * 计算要压缩图片的大小
     *
     * @param srcWidth  宽度
     * @param srcHeight 高度
     * @return
     */
    private Size getNewSize(int srcWidth, int srcHeight) {
        Size newSize = new Size();
        // 判断图片形状
        if (srcWidth >= srcHeight) {
            if (srcWidth >= maxSize) {
                newSize.width = maxSize;
            } else {
                newSize.width = srcWidth;
            }
            newSize.height = newSize.width * srcHeight / srcWidth;
        } else {
            if (srcHeight >= maxSize) {
                newSize.height = maxSize;
            } else {
                newSize.height = srcWidth;
            }
            newSize.width = newSize.height * srcWidth / srcHeight;
        }
        return newSize;
    }

    /**
     * 获取缩略图的尺寸大小属性
     *
     * @param srcWidth  宽度
     * @param srcHeight 高度
     * @return
     */
    private Size getThumSize(int srcWidth, int srcHeight) {
        Size thumSize = new Size();
        // 判断图片形状
        if (srcWidth >= srcHeight) {
            if (srcWidth >= thumMaxSize) {
                thumSize.width = thumMaxSize;
            } else {
                thumSize.width = srcWidth;
            }
            thumSize.height = thumSize.width * srcHeight / srcWidth;
        } else {
            if (srcHeight >= thumMaxSize) {
                thumSize.height = thumMaxSize;
            } else {
                thumSize.height = srcWidth;
            }
            thumSize.width = thumSize.height * srcWidth / srcHeight;
        }
        return thumSize;
    }

    /**
     * @Description 记录计算的宽，高值
     * @date 2015年11月20日
     * @Copyright: Copyright (c) 2015 Shenzhen JJShome Technology Co., Ltd.
     * Inc. All rights reserved.
     */
    private class Size {
        /**
         * 宽度
         */
        private int width;
        /**
         * 高度
         */
        private int height;

        @Override
        public String toString() {
            return "Size [width=" + width + ", height=" + height + "]";
        }
    }
}
