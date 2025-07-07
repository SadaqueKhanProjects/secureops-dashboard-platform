package com.secureops.service;

import com.secureops.model.TelemetryFeed;
import com.secureops.repository.TelemetryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelemetryService {
    private final TelemetryRepository repository;

    public TelemetryService(TelemetryRepository repository) {
        this.repository = repository;

    }

    public List<TelemetryFeed> getAllFeeds() {
        return repository.findAll();
    }

    public TelemetryFeed save(TelemetryFeed feed) {
        return repository.save(feed);
    }
}
