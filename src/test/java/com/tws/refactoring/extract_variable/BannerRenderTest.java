package com.tws.refactoring.extract_variable;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BannerRenderTest {

    @Test
    public void should_return_ie_on_mac_when_platform_is_mac_and_browser_is_ie () {
        // given
        BannerRender bannerRender = new BannerRender();
        String platform = "mac";
        String browser = "IE";

        // when
        String result = bannerRender.renderBanner(platform, browser);

        // then
        Assertions.assertEquals("IE on Mac?", result);
    }

    @Test
    public void should_return_banner_when_platform_is_mac_and_browser_is_chrome () {
        // given
        BannerRender bannerRender = new BannerRender();
        String platform = "mac";
        String browser = "chrome";

        // when
        String result = bannerRender.renderBanner(platform, browser);

        // then
        Assertions.assertEquals("banner", result);
    }
}
