package com.br.ciandt.appium

import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL


@RunWith(JUnit4::class)
class CalculatorTest {

    @Test
    fun caluclator() {

        val desiredCapabilities = DesiredCapabilities()
        desiredCapabilities.setCapability("platformName", "Android")
        desiredCapabilities.setCapability("deviceName", "Nexus 5X API 30")
        desiredCapabilities.setCapability("automationName", "uiautomator2")
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2")
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator")

        val driver = AndroidDriver<MobileElement>(URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities)

        val el1: MobileElement = driver.findElementById("com.google.android.calculator:id/digit_2")
        el1.click()
        val el2: MobileElement = driver.findElementByAccessibilityId("plus")
        el2.click()
        val el3: MobileElement = driver.findElementById("com.google.android.calculator:id/digit_2")
        el3.click()
        val el4: MobileElement = driver.findElementById("com.google.android.calculator:id/result_preview")
        el4.click()
        println(el4.text)
        Assert.assertEquals("4", el4.text)

        driver.close()

    }


}


