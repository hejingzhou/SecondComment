package com.lychee.commentdemo;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Lychee of on 2018/4/18 11:17.
 * <p>
 * Author: HeJingzhou
 * <p>
 * Email: tcowork@163.com
 */
public class AssetsUtils {
    public static String readAssetsTxt(Context context, String fileName) {
        try {
            InputStream is = context.getAssets().open(fileName + ".json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String text = new String(buffer, "utf-8");
            return text;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "读取错误，请检查文件名";
    }
}
