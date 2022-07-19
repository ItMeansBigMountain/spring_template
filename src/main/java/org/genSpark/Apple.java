package org.genSpark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Apple implements Phone {

    @Autowired
    @Qualifier("mediaTech")
    MobileProcessor cpu;


    public void config() {
        System.out.printf("APPLE: Processor: %s | RAM: 32 GB | Cam 64 MPX%n", this.cpu);
    }
}
