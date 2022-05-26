package op.mobile.app.dev.willkj8.travelling

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.core.AllOf
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class LogoutFragmentInstrumentedTest {

    // lateinit allows you to initialise a variable later
    private lateinit var emailAddressToBeTyped: String
    private lateinit var passwordToBeTyped: String

    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun initValidString() {
        // Initialising variables marked with the lateinit keyword
        emailAddressToBeTyped = "kaywil56@gmail.com"
        passwordToBeTyped = "12345678"
    }

    @Test
    fun logout() {
        // Delay for splash screen
        Thread.sleep(5000)
        // withId(R.id.et_email_address) is a ViewMatcher
        Espresso.onView(ViewMatchers.withId(R.id.et_email_address))
            // typeText() is a ViewAction
            .perform(ViewActions.typeText(emailAddressToBeTyped), ViewActions.closeSoftKeyboard())
        Espresso.onView(ViewMatchers.withId(R.id.et_password))
            .perform(ViewActions.typeText(passwordToBeTyped), ViewActions.closeSoftKeyboard())
        // click() is a ViewAction
        Espresso.onView(ViewMatchers.withId(R.id.btn_login)).perform(ViewActions.click())
        // Give time for login delay
        Thread.sleep(5000)

        Espresso.onView(ViewMatchers.withId(R.id.navigation_settings)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.btn_logout)).perform(ViewActions.click())

        Espresso.onView(ViewMatchers.withId(R.id.tv_header)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}