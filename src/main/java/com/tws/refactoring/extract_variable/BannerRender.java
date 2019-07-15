package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        final boolean doesPlatformContainMAC = platform.toUpperCase().indexOf("MAC") > -1;
        final boolean doesBrowserContainIE = browser.toUpperCase().indexOf("IE") > -1;
        return doesPlatformContainMAC && doesBrowserContainIE ? "IE on Mac?" : "banner";
    }
}
