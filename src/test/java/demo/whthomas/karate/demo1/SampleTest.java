package demo.whthomas.karate.demo1;

import com.intuit.karate.junit5.Karate;

public class SampleTest {

    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }

}
