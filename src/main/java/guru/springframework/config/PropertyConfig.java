package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;
import guru.springframework.examplebeans.FakeYamlData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jt on 6/7/17.
 */
@Configuration
public class PropertyConfig {

    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Value("${guru.jms.username}")
    String jmsUsername;

    @Value("${guru.jms.password}")
    String jmsPassoword;

    @Value("${guru.jms.url}")
    String jmsUrl;

    @Value("${ignore_new_lines}")
    String ignoreNewLines;

    @Value("${include_new_lines}")
    String includeNewLines;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUsername(jmsUsername);
        jmsBroker.setPassword(jmsPassoword);
        jmsBroker.setUrl(jmsUrl);
        return jmsBroker;
    }

    @Bean
    public FakeYamlData fakeYamlData() {
        FakeYamlData fakeYamlData = new FakeYamlData();
        fakeYamlData.setIgnoreNewLines(ignoreNewLines);
        fakeYamlData.setIncludeNewLines(includeNewLines);
        return fakeYamlData;
    }

}
