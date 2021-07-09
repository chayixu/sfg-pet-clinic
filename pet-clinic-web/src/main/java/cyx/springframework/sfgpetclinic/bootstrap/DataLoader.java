package cyx.springframework.sfgpetclinic.bootstrap;

import cyx.springframework.sfgpetclinic.services.OwnerService;
import cyx.springframework.sfgpetclinic.services.VetService;
import cyx.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import cyx.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
