package org.d3ifcool.soundforchildrens;

import android.content.Context;

import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("org.d3ifcool.soundforchildrens", appContext.getPackageName());
    }

    @Test
    public void ui_suara(){
        onView(ViewMatchers.withId(R.id.suara)).perform(click() );

    }

    @Test
    public void ui_permainan(){
        onView(ViewMatchers.withId(R.id.permainan)).perform(click() );

    }

    @Test
    public void ui_suara_hewan(){
        onView(ViewMatchers.withId(R.id.suara)).perform(click() );
        onView(ViewMatchers.withId(R.id.suaraHewan)).perform(click() );

    }

    @Test
    public void ui_suara_alatMusik(){
        onView(ViewMatchers.withId(R.id.suara)).perform(click() );
        onView(ViewMatchers.withId(R.id.suaraalatmusik)).perform(click() );

    }

    @Test
    public void ui_suara_hewan_sample(){
        onView(ViewMatchers.withId(R.id.suara)).perform(click() );
        onView(ViewMatchers.withId(R.id.suaraHewan)).perform(click() );
        onView(ViewMatchers.withId(R.id.anjing)).perform(click() );

    }

    @Test
    public void ui_permainan_sample(){
        onView(ViewMatchers.withId(R.id.permainan)).perform(click() );
        onView(ViewMatchers.withId(R.id.answerBtn1)).perform(click() );

    }

}
