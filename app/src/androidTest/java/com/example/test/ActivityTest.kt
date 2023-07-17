package com.example.test

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class ActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testDivision() {
        Espresso.onView(withId(R.id.EditA)).perform(ViewActions.typeText("8080"))
        Espresso.onView(withId(R.id.EditA)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.EditB)).perform(ViewActions.typeText("40"))
        Espresso.onView(withId(R.id.EditB)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.buttonCal)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.result))
            .check(ViewAssertions.matches(ViewMatchers.withText("202")))
    }


}