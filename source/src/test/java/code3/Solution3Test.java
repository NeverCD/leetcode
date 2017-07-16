package test.java.code3;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

/**
 * Created by duxf on 2017/7/16.
 */
@RunWith(Arquillian.class)
public class Solution3Test {
    @org.junit.Test
    public void lengthOfLongestSubstring() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(main.java.code3.Solution3.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
