package org.genSpark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Samsung implements Phone {
    @Autowired
    @Qualifier("snapDragon")
    MobileProcessor cpu;

    public void config() {
        System.out.println(String.format("SAMSUNG: Processor: %s | RAM: 64 GB | Cam 32 MPX", this.cpu));
    }


}
