package com.example.Ankit.Model;


import lombok.Data;

@Data
public class holiday {

    private final String day;
    private final String reason;
    private final String Type;

    public enum Type{
        FESTIVAL, FEDERAL
    }
//
//    public holiday(String day, String reason, holiday.Type Type) {
//        this.day = day;
//        this.reason = reason;
//        this.Type = String.valueOf(Type);
//    }
//
//    public String getDay() {
//        return day;
//    }
//
//    public String getType() {
//        return Type;
//    }
//
//    public String getReason() {
//        return reason;
//    }

}
