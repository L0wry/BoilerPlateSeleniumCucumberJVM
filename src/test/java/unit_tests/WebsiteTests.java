package unit_tests;


import org.junit.Test;
import page_objects.Homepage;
import page_objects.Website;

import static org.assertj.core.api.Assertions.*;


public class WebsiteTests {

    @Test
    public void verifyYouGetTheSamePageObject(){
        Homepage homepage = Website.homePage();
        Homepage homepage1 = Website.homePage();
        assertThat(homepage).isEqualTo(homepage1);
    }
}
