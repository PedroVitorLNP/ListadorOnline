package com.infinitycorp.model.identity;

import java.util.Date;

public class Award extends Sweepstakes{
    
    private String nameAward;
    
    public Award(String name, Date dateSweepstake, String description) {
        super(name, dateSweepstake, description);
        
    }
    
    
    
}
