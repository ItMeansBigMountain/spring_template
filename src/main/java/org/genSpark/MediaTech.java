package org.genSpark;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTech implements  MobileProcessor {


    @Override
    public void processor() {
        System.out.println("MediaTech");
    }
}
