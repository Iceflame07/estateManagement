package com.walkingCompiler.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class estateService {

    private final estateService estateRepository;

    @Autowired
    public estateService(estateService estateRepository) {
        this.estateRepository = estateRepository;
    }

    @Autowired
    public estateService() {
        estateRepository = new estateService();
    }
}
