package com.cr6588.autotask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class MyElasticJob implements SimpleJob {

    public static String formatDateTime(Date date) {
        if (date == null) {
            return "";
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

    @Override
    public void execute(ShardingContext context) {
        System.out.println(formatDateTime(new Date()) + " " + context.getShardingItem() + " start");
        try {
            switch (context.getShardingItem()) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                default:
                    break;
            }
            Thread.sleep(5000);
            System.out.println(formatDateTime(new Date()) + " " + context.getShardingItem() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
