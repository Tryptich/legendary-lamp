package org.abodah.auth.entities;


import javax.persistence.*;


@Entity
@Table(name = "INFO")
public class Info {

    @Id
    private Long uid;
    Double average30Days;
    Double sum30Days;
    Double average7Days;
    Double sum7Days;
    Double trackedDays;
    Double totalSpend;
    Double average;
    Double dailySum;
    Double dailyAverage;
//    @Convert(converter = InfoConverter.class)
    //List<Double> sumDay = new ArrayList<>();
}
