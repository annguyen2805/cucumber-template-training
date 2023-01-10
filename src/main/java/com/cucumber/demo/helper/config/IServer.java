package com.cucumber.demo.helper.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config.properties"})
public interface IServer extends Config {

    @Key("url")
    String url();
}
