package com.example.collectweatherdata.config;

import com.example.collectweatherdata.timeJob.WeatherDataTimeJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置定时器
 * @author CookiesEason
 * 2018/04/20 21:40
 */
@Configuration
public class QuartzConfiguration {

    private static final int TIME = 1800;

    @Bean
    public JobDetail weatherDataSyncJobDetail() {
        return JobBuilder.newJob(WeatherDataTimeJob.class).withIdentity("WeatherDataTimeJob")
                .storeDurably().build();
    }

    @Bean
    public Trigger weatherDataSyncTrigger(){
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(TIME).repeatForever();
        return TriggerBuilder.newTrigger().forJob(weatherDataSyncJobDetail())
                .withIdentity("weatherDataSyncTrigger").withSchedule(scheduleBuilder).build();
    }


}
