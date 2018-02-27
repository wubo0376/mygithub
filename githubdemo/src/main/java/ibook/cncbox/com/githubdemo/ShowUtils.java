package ibook.cncbox.com.githubdemo;

import android.content.Context;
import android.widget.Toast;

/**
 * @Class ShowUtils
 * @Author wb
 * @DATE 2018/2/27 11:15
 * @Explanatory
 * @Version V1.0
 */
public class ShowUtils {

    public void show(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

}
