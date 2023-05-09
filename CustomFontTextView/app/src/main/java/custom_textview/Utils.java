package custom_textview;

import android.content.Context;
import android.graphics.Typeface;

public class Utils {
    private static Typeface blackjackTypeface;
    private static Typeface greatvibesTypeface;
    private static Typeface robotoBoldTypeface;
    private static Typeface robotoItalicTypeface;
    private static Typeface robotoLightTypeface;

    public static Typeface getBlackjackTypeface(Context context) {
        if (blackjackTypeface == null){
            blackjackTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/blackjack.otf");
        }
        return blackjackTypeface;
    }

    public static Typeface getGreatvibesTypeface(Context context) {
        if (greatvibesTypeface == null){
            greatvibesTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/GreatVibes-Regular.otf");
        }
        return greatvibesTypeface;
    }

    public static Typeface getRobotoBoldTypeface(Context context) {
        if (robotoBoldTypeface == null){
            robotoBoldTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Bold.ttf");
        }
        return robotoBoldTypeface;
    }

    public static Typeface getRobotoItalicTypeface(Context context) {
        if (robotoItalicTypeface == null){
            robotoItalicTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Italic.ttf");
        }
        return robotoItalicTypeface;
    }

    public static Typeface getRobotoLightTypeface(Context context) {
        if (robotoLightTypeface == null){
            robotoLightTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Light.ttf");
        }
        return robotoLightTypeface;
    }
}
