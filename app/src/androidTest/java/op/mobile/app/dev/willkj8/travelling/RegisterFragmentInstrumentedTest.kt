package op.mobile.app.dev.willkj8.travelling

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.hamcrest.core.AllOf
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class RegisterFragmentInstrumentedTest {

    // lateinit allows you to initialise a variable later
    private lateinit var emailAddressToBeTyped: String
    private lateinit var passwordToBeTyped: String

    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun initValidString() {
        // Initialising variables marked with the lateinit keyword
        emailAddressToBeTyped = "jdoe@mail.co.nz"
        passwordToBeTyped = "12345678"
    }

    @Test
    fun register() {
        // Delay for splash screen
        Thread.sleep(5000)
        onView(withId(R.id.btn_to_sign_up)).perform(ViewActions.click())

        onView(withId(R.id.et_email_address))
            // typeText() is a ViewAction
            .perform(ViewActions.typeText(emailAddressToBeTyped), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.et_password))
            .perform(ViewActions.typeText(passwordToBeTyped), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.et_confirm_password))
            .perform(ViewActions.typeText(passwordToBeTyped), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.btn_register)).perform(ViewActions.click())
        Thread.sleep(5000)
        onView(
            AllOf.allOf(
                withId(R.id.tv_header), ViewMatchers.withText("Login")
            )
        ).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}