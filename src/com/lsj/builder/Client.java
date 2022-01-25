package com.lsj.builder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {

//        TourPlanBuilder builder = new DefaultTourBuilder();
//        TourPlan tourPlan = builder.title("칸쿤 여행")
//                .nightsAndDays(2,3)
//                .startDate(LocalDate.of(2022,1,1))
//                .whereToStay("Hotel")
//                .addPlan(0, "check in")
//                .addPlan(0, "dinner")
//                .build();

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan canCunTour = director.getCanCunTrip();

        System.out.println(canCunTour);
    }
}
