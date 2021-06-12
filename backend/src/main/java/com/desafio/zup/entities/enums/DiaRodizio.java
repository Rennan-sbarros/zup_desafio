package com.desafio.zup.entities.enums;

public enum DiaRodizio {

    SEGUNDA(1, "0,1"),
    TERCA(2, "2,3"),
    QUARTA(3, "4,5"),
    QUINTA(4, "6,7"),
    SEXTA(5, "8,9");

    private String range;
    private Integer dayOfWeek;

    private DiaRodizio(Integer dayOfWeek, String range) {
        this.range = range;
        this.dayOfWeek = dayOfWeek;
    }

    public String getRange() {
        return range;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public static DiaRodizio getFromRange(String n){
        for (DiaRodizio d: DiaRodizio.values()) {
            if (d.getRange().contains(n)){
                return d;
            }
        }
        return null;
    }

    public static DiaRodizio getFromDayOfWeek(Integer i){
        for (DiaRodizio d: DiaRodizio.values()) {
            if (d.getDayOfWeek().equals(i)){
                return d;
            }
        }
        return null;
    }

}

