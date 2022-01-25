package com.lsj.builder;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public void changeBuilder(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    //해당 메소드만 사용하면 구체적인 구현 내용이 알 필요 없이 사용자는 칸쿤 여행 계획을 어디에서든지 만들 수 있다.
    public TourPlan getCanCunTrip() {
        return tourPlanBuilder.title("칸쿤 여행")
                .nightsAndDays(2,3)
                .startDate(LocalDate.of(2022,1,1))
                .whereToStay("Hotel")
                .addPlan(0, "check in")
                .addPlan(0, "dinner")
                .build();
    }

    public TourPlan getShortTrip() {
        return tourPlanBuilder.title("short trip")
                .addPlan(0,"visit concert")
                .addPlan(0, "dinner")
                .build();
    }


}
