package org.example.creationalPatterns.factory;

public class GetPlanFactory {

    public Plan getPlan(String planType){
        if(planType==null){
            return null;
        }
        if(planType.equalsIgnoreCase("Domestic")){
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("Institutional")) {
            return new InstitutionalPlan();
        } else if (planType.equalsIgnoreCase("Commercial")) {
            return new CommercialPlan();
        }
        return null;
    }
}
