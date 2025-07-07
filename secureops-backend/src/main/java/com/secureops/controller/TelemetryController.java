package com.secureops.controller;

import com.secureops.model.TelemetryFeed;
import com.secureops.service.TelemetryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feeds")

public class TelemetryController {

    private final TelemetryService service;

    public TelemetryController(TelemetryService service) {
        this.service = service;
    }

    @GetMapping
    public List<TelemetryFeed> getFeeds() {
        return service.getAllFeeds();
    }

    @PostMapping
    public TelemetryFeed addFeed(@RequestBody TelemetryFeed feed) {
        return service.save(feed);
    }
}
