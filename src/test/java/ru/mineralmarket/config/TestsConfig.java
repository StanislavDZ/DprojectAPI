package ru.mineralmarket.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:credentials.properties")
public interface TestsConfig extends Config {
    String selenoidLogin();

    String selenoidPassword();

    @DefaultValue("CHROME")
    String browser();

    @DefaultValue("99.0")
    String version();

    @DefaultValue("https://mineralmarket.ru/")
    String baseUrl();

    @DefaultValue("https://leads.kamnipiter.ru")
    String baseURI();

    @DefaultValue("1920x1080")
    String resolution();

    @DefaultValue("false")
    boolean remote();

}
