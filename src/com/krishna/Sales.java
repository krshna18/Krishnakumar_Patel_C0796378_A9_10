package com.krishna;

import java.util.ArrayList;
import java.util.Map;

public abstract class Sales implements IDisplay{
   Double sales;
   Double rate;
   Double commission;
   Double advance;
   Double Pay;


    public Sales() {
    }

    public Sales(Double sales, Double rate, Double commission, Double advance, Double pay) {
        this.sales = sales;
        this.rate = rate;
        this.commission = commission;
        this.advance = advance;
        Pay = pay;
    }

    public Double getSales() {
        return sales;
    }

    public void setSales(Double sales) {
        this.sales = sales;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Double getAdvance() {
        return advance;
    }

    public void setAdvance(Double advance) {
        this.advance = advance;
    }

    public Double getPay() {
        return Pay;
    }

    public void setPay(Double pay) {
        Pay = pay;
    }

    public double commissionRate(){

        double commissionRate;
        if(this.sales < 10000.00){
            commissionRate = 5;
        }else if(this.sales > 10000.00 && this.sales < 14999.00) {
            commissionRate = 10;
        }else if(this.sales > 15000.00 && this.sales < 17999.00) {
            commissionRate = 12;
        }else if(this.sales > 18000.00 && this.sales < 21999.00) {
            commissionRate = 15;
        }else {
            commissionRate = 16;
        }
        return commissionRate;
    }
}
