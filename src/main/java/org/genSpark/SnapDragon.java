package org.genSpark;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor{

    @Override
    public void processor() {
        System.out.println("SnapDragon");
    }
}
