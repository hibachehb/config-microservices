package com.commandesservice.commandesservice.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Component
@ConfigurationProperties(prefix = "mes-config-ms")
public class ConfigCommande {

    private int commandesLast = 7; // Valeur par défaut

    public void setCommandesLast(int commandesLast) {
        this.commandesLast = commandesLast;
    }
}