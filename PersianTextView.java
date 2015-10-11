

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by arash.khoeini@gmail.com on 10/11/15.
 */
public class PersianTextView extends TextView {
    public PersianTextView(Context context) {
        super(context);
    }

    public PersianTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PersianTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        String newText ="";
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            char newChar ;
            if(ch == '0'){
                newChar = '۰';
            }else if(ch == '1'){
                newChar = '۱';
            }
            else if(ch == '2'){
                newChar = '۲';
            }
            else if(ch == '3'){
                newChar = '۳';
            }
            else if(ch == '4'){
                newChar = '۴';
            }
            else if(ch == '5'){
                newChar = '۵';
            }
            else if(ch == '6'){
                newChar = '۶';
            }
            else if(ch == '7'){
                newChar = '۷';
            }
            else if(ch == '8'){
                newChar = '۸';
            }
            else if(ch == '9'){
                newChar = '۹';
            }else{
                newChar = ch;
            }
            newText += newChar;
        }
        super.setText(newText, type);
    }
}
