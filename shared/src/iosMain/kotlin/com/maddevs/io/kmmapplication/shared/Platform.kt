package com.maddevs.io.kmmapplication.shared


import platform.UIKit.UIDevice

actual class Platform actual constructor() {
    actual val platform: String = UIDevice.currentDevice.systemName() + "Hello world" + UIDevice.currentDevice.systemVersion
}