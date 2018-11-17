package com.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("/com/soundsystem/app.properties")
public class EnvironmentAutoConfig {

  @Bean
  public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
    return new PropertySourcesPlaceholderConfigurer();
  }
  /*
  属性占位符使用，添加PropertySourcesPlaceholderConfigurer bean及
  @PropertySource属性,@Value用法与@AutoWired相同，@Value("${}")，
  双引号里面是大括号，不是小括号
   */
  @Bean
  public BlankAutoDisc blankDisc(
          /*@Value("${disc.title}") String title,
                             @Value("${disc.artist}") String artist*/
          //或者以下，不过这里没有设置系统属性，所以获取为null
          @Value("#{systemProperties['disc.title']}") String title,
          @Value("#{systemProperties['disc.artist']}") String artist
  ) {
    return new BlankAutoDisc(title,
            artist);
  }
  
}
