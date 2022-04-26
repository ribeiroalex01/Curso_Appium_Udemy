package com.br.ciandt.appium

import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

@RunWith(JUnit4::class)
class FormTest {



    @Test
    fun installAPK() {

        val desiredCapabilities = DesiredCapabilities()
        desiredCapabilities.setCapability("platformName", "Android")
        desiredCapabilities.setCapability("deviceName", "Nexus 5X API 30")
        desiredCapabilities.setCapability("automationName", "uiautomator2")
     //   desiredCapabilities.setCapability("appPackage", "com.android.calculator2")
     //   desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator")
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"/Users/alexbruno/StudioProjects/Curso_Appium_Udemy/app/src/resources/CTAppium_1_2.apk")

        val driver = AndroidDriver<MobileElement>(URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities)

        driver.close()

    }


}


