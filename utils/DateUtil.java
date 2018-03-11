package com.myshop.store.utils;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import java.util.*;

public class DateUtil {

    public final static String DATE_FORMAT_DEFAULT = "yyyy-MM-dd";
    public final static String DATE_FORMAT_DEFAULT_TIME = "yyyy-MM-dd HH:mm:ss";

    /**
     * 获取当前日期 yyyy-MM-dd
     *
     * @return String
     */
    public static String getToday() {
        return DateUtil.longToString(new DateTime().getMillis(), DateUtil.DATE_FORMAT_DEFAULT);
    }

    /**
     * 获取当前日期  yyyy-MM-dd HH:mm:ss
     *
     * @return String
     */
    public static String getFullToday() {
        return DateUtil.longToString(new DateTime().getMillis(), DateUtil.DATE_FORMAT_DEFAULT_TIME);
    }

    /**
     * 将毫秒时间转换为yyyy-MM-dd格式的时间
     *
     * @param time 毫秒数
     * @return String
     */
    public static String longToString(long time) {
        return longToString(time, DATE_FORMAT_DEFAULT);
    }

    /**
     * 将毫秒时间转换为指定格式的时间
     *
     * @param time   毫秒数
     * @param format 日期格式
     * @return String
     */
    public static String longToString(long time, String format) {
        if (StringUtils.isBlank(format)) {
            format = DATE_FORMAT_DEFAULT;
        }
        DateTime dTime = new DateTime(time);
        return dTime.toString(format);
    }

    /**
     * 将字符串类型的日期转换为毫秒数
     * @param dateStr 时间字符串
     * @return long
     */
    public static long parseStringToLong(String dateStr) {
        dateStr = dateStr.trim();
        if (dateStr.length() == 19 || dateStr.length() == 23) {
            try {
                Calendar cal = Calendar.getInstance();
                cal.set(Integer.parseInt(dateStr.substring(0, 4)),
                        Integer.parseInt(dateStr.substring(5, 7)) - 1,
                        Integer.parseInt(dateStr.substring(8, 10)),
                        Integer.parseInt(dateStr.substring(11, 13)),
                        Integer.parseInt(dateStr.substring(14, 16)),
                        Integer.parseInt(dateStr.substring(17, 19)));
                cal.set(Calendar.MILLISECOND, 0);
                return (cal.getTime().getTime());
            } catch (Exception e) {
                return 0;
            }

        } else if (dateStr.length() == 16) {
            try {
                Calendar cal = Calendar.getInstance();
                cal.set(Integer.parseInt(dateStr.substring(0, 4)),
                        Integer.parseInt(dateStr.substring(5, 7)) - 1,
                        Integer.parseInt(dateStr.substring(8, 10)),
                        Integer.parseInt(dateStr.substring(11, 13)),
                        Integer.parseInt(dateStr.substring(14, 16)));
                cal.set(Calendar.MILLISECOND, 0);
                return (cal.getTime().getTime());
            } catch (Exception e) {
                return 0;
            }

        } else if (dateStr.length() == 14) {
            try {
                Calendar cal = Calendar.getInstance();
                cal.set(Integer.parseInt(dateStr.substring(0, 4)),
                        Integer.parseInt(dateStr.substring(4, 6)) - 1,
                        Integer.parseInt(dateStr.substring(6, 8)),
                        Integer.parseInt(dateStr.substring(8, 10)),
                        Integer.parseInt(dateStr.substring(10, 12)),
                        Integer.parseInt(dateStr.substring(12, 14)));
                cal.set(Calendar.MILLISECOND, 0);
                return (cal.getTime().getTime());
            } catch (Exception e) {
                return 0;
            }
        } else if (dateStr.length() == 10 || dateStr.length() == 11) {
            try {
                Calendar cal = Calendar.getInstance();
                cal.set(Integer.parseInt(dateStr.substring(0, 4)),
                        Integer.parseInt(dateStr.substring(5, 7)) - 1,
                        Integer.parseInt(dateStr.substring(8, 10)), 0, 0, 0);
                cal.set(Calendar.MILLISECOND, 0);
                return (cal.getTime().getTime());
            } catch (Exception e) {
                return 0;
            }
        } else if (dateStr.length() == 8) {
            try {
                Calendar cal = Calendar.getInstance();
                cal.set(Integer.parseInt(dateStr.substring(0, 4)),
                        Integer.parseInt(dateStr.substring(4, 6)) - 1,
                        Integer.parseInt(dateStr.substring(6, 8)), 0, 0, 0);
                cal.set(Calendar.MILLISECOND, 0);
                return (cal.getTime().getTime());
            } catch (Exception e) {
                return 0;
            }
        } else {
            try {
                return Long.parseLong(dateStr);
            } catch (Exception e) {
                return 0;
            }

        }
    }

    /**
     * 获取指定日期前后num天的日期
     *
     * @param date 时间字符串 yyyy-MM-dd
     * @param num  正数 多少天之后的日期  负数 多少天之后的日期
     * @return String
     */
    public static String getDay(String date, int num) {
        return getDay(date, num, DATE_FORMAT_DEFAULT);
    }

    /**
     * 获取指定日期前后num天的日期
     *
     * @param date   时间字符串 yyyy-MM-dd
     * @param num    正数 多少天之后的日期  负数 多少天之后的日期
     * @param format 日期格式
     * @return String
     */
    public static String getDay(String date, int num, String format) {
        long t = parseStringToLong(date);
        return getDay(t, num, DATE_FORMAT_DEFAULT);
    }

    /**
     * 获取指定日期前后num天的日期
     *
     * @param date 时间字符串 yyyy-MM-dd
     * @param num  正数 多少天之后的日期  负数 多少天之后的日期
     * @return String
     */
    public static String getDay(long date, int num) {
        return getDay(date, num, DATE_FORMAT_DEFAULT);
    }

    /**
     * 获取指定日期前后num天的日期
     *
     * @param date   时间字符串 yyyy-MM-dd
     * @param num    正数 多少天之后的日期  负数 多少天之后的日期
     * @param format 日期格式
     * @return String
     */
    public static String getDay(long date, int num, String format) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + num);
        return longToString(calendar.getTimeInMillis(), format);
    }

}
