package com.example.singleton;

public class Horario {
    String utc_offset;
    String timezone;
    String day_of_week;
    String day_of_year;
    String datetime;
    String utc_datetime;
    String unixtime;
    String raw_offset;
    String week_number;
    String dst;
    String abbreviation;
    String dst_offset;
    String dst_from;
    String dst_until;
    String client_ip;

    public Horario(String utc_offset, String timezone, String day_of_week, String day_of_year,
                   String datetime, String utc_datetime, String unixtime, String raw_offset,
                   String week_number, String dst, String abbreviation, String dst_offset, String dst_from,
                   String dst_until, String client_ip) {
        this.utc_offset = utc_offset;
        this.timezone = timezone;
        this.day_of_week = day_of_week;
        this.day_of_year = day_of_year;
        this.datetime = datetime;
        this.utc_datetime = utc_datetime;
        this.unixtime = unixtime;
        this.raw_offset = raw_offset;
        this.week_number = week_number;
        this.dst = dst;
        this.abbreviation = abbreviation;
        this.dst_offset = dst_offset;
        this.dst_from = dst_from;
        this.dst_until = dst_until;
        this.client_ip = client_ip;
    }

    public String getUtc_offset() {
        return utc_offset;
    }

    public void setUtc_offset(String utc_offset) {
        this.utc_offset = utc_offset;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(String day_of_week) {
        this.day_of_week = day_of_week;
    }

    public String getDay_of_year() {
        return day_of_year;
    }

    public void setDay_of_year(String day_of_year) {
        this.day_of_year = day_of_year;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getUtc_datetime() {
        return utc_datetime;
    }

    public void setUtc_datetime(String utc_datetime) {
        this.utc_datetime = utc_datetime;
    }

    public String getUnixtime() {
        return unixtime;
    }

    public void setUnixtime(String unixtime) {
        this.unixtime = unixtime;
    }

    public String getRaw_offset() {
        return raw_offset;
    }

    public void setRaw_offset(String raw_offset) {
        this.raw_offset = raw_offset;
    }

    public String getWeek_number() {
        return week_number;
    }

    public void setWeek_number(String week_number) {
        this.week_number = week_number;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getDst_offset() {
        return dst_offset;
    }

    public void setDst_offset(String dst_offset) {
        this.dst_offset = dst_offset;
    }

    public String getDst_from() {
        return dst_from;
    }

    public void setDst_from(String dst_from) {
        this.dst_from = dst_from;
    }

    public String getDst_until() {
        return dst_until;
    }

    public void setDst_until(String dst_until) {
        this.dst_until = dst_until;
    }

    public String getClient_ip() {
        return client_ip;
    }

    public void setClient_ip(String client_ip) {
        this.client_ip = client_ip;
    }
}