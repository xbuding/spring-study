package com.runbarry.spring.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnClass(StudyService.class)
@EnableConfigurationProperties(StudyProperties.class)
@Configuration
public class StudyAutoConfiguration {
    @Autowired
    private StudyProperties studyProperties;

    @Bean
    @ConditionalOnMissingBean(StudyService.class)
    public StudyService studyService() {
        return new StudyService(studyProperties);
    }


}
