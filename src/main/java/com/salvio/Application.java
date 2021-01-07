package com.salvio;

import com.salvio.service.GreetingService;
import com.salvio.service.OutputService;
import com.salvio.service.TimeService;

public class Application {

    public static void main(String[] args) throws Exception {
        GreetingService greetingService = new GreetingService("Ciao");
        TimeService timeService = new TimeService(true);
        OutputService outputService = new OutputService(greetingService, timeService);

        for (int i=0;i<5;i++){
            outputService.generateOutput("Pippo");
            Thread.sleep(2000);
        }
    }
}
