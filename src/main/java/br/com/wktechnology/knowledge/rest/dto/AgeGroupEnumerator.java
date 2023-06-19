package br.com.wktechnology.knowledge.rest.dto;

import lombok.Getter;

@Getter
public enum AgeGroupEnumerator {

    DEZAVINTE(10, 20),
    VINTEATRINTA(20, 30),
    TRINTAAQUARENTA(30, 40),
    QUARENTAACINQUENTA(40, 50),
    CINQUENTAASESSENTA(50, 60),
    SESSENTAASETENTA(60, 70);

    private final int min;
    private final int max;

    AgeGroupEnumerator(int min, int max) {
        this.min = min;
        this.max = max;
    }


}
