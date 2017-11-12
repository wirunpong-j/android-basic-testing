package cc.somkiat.basicunittesting;


import android.os.SystemClock;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNot.not;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void normalNameAndEmail() {
        onView(withId(R.id.userNameInput)).perform(scrollTo() ,replaceText("Bellkung"));
        onView(withId(R.id.emailInput)).perform(scrollTo() ,replaceText("bell-kung@hotmail.com"));
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        onView(withText("Success!!!")).inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
    }

    @Test
    public void fillNameWithoutFillEmail() {
        onView(withId(R.id.userNameInput)).perform(scrollTo() ,replaceText("Bellkung"));
        onView(withId(R.id.emailInput)).perform(scrollTo() ,replaceText(""));
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        onView(withText("Email is not valid.")).inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
    }

    @Test
    public void fillEmailWithoutFillName() {
        onView(withId(R.id.emailInput)).perform(scrollTo() ,replaceText("bell-kung@hotmail.com"));
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        onView(withText("Name is Empty")).inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
    }


}
