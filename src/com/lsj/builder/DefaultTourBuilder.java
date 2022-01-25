package com.lsj.builder;

import java.time.LocalDate;
import java.util.ArrayList;



public class DefaultTourBuilder implements TourPlanBuilder {
    //    private String title;
//
//    private int nights;
//
//    private int days;
//
//    private LocalDate startDate;
//
//    private String whereToStay;
//
//    private List<DetailPlan> detailPlans;
//
    private TourPlan tourPlan;

    public DefaultTourBuilder() {
        this.reset();
    }


    @Override
    public void reset() {
        tourPlan = new TourPlan();
    }

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
//        this.nights = nights;
//        this.days = days;
        tourPlan.setNights(nights);
        tourPlan.setDays(days);
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        //this.title = title;
        tourPlan.setTitle(title);
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        //this.startDate = localDate;
        tourPlan.setStartDate(localDate);
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        //this.whereToStay = whereToStay;
        tourPlan.setWhereToStay(whereToStay);
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (tourPlan.getDetailPlans() == null) {
           tourPlan.setDetailPlans(new ArrayList<>());
        }
        tourPlan.getDetailPlans().add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan build() {
        return tourPlan;
    }
}
