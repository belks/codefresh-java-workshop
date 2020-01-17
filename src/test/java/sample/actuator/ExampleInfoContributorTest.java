package sample.actuator;

import org.junit.Test;
import org.springframework.boot.actuate.info.Info;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ExampleInfoContributorTest {

    @Test
    public void infoMap() {
        Info.Builder builder = mock(Info.Builder.class);

        ExampleInfoContributor exampleInfoContributor = new ExampleInfoContributor();
        exampleInfoContributor.contribute(builder);

        verify(builder).withDetail(any(), any());
    }
}
