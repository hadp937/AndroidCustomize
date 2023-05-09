package custom_textview;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class BlackJackTextView extends AppCompatTextView {

    public BlackJackTextView(Context context) {
        super(context);
        setFontsTextView();
    }

    public BlackJackTextView( Context context,  AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }

    public BlackJackTextView( Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();
    }

    private void setFontsTextView(){
        Typeface typeface = Utils.getBlackjackTypeface(getContext());
        setTypeface(typeface);
    }
}
