package com.secureops.service;

import com.secureops.model.TelemetryFeed;
import com.secureops.repository.TelemetryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TelemetryServiceTest {

    private TelemetryRepository repository;
    private TelemetryService service;

    @BeforeEach
    void setUp() {
        repository = mock(TelemetryRepository.class);
        service = new TelemetryService(repository);
    }

    @Test
    void testGetAllFeeds_returnsFeedList() {
        TelemetryFeed feed1 = new TelemetryFeed();
        feed1.setDroneId("Drone1");

        TelemetryFeed feed2 = new TelemetryFeed();
        feed2.setDroneId("Drone2");

        when(repository.findAll()).thenReturn(Arrays.asList(feed1, feed2));

        List<TelemetryFeed> result = service.getAllFeeds();

        assertEquals(2, result.size());
        assertEquals("Drone1", result.get(0).getDroneId());
        verify(repository, times(1)).findAll();
    }

    @Test
    void testSave_callsRepositorySave() {
        TelemetryFeed feed = new TelemetryFeed();
        feed.setDroneId("DroneX");

        when(repository.save(feed)).thenReturn(feed);

        TelemetryFeed saved = service.save(feed);

        assertNotNull(saved);
        assertEquals("DroneX", saved.getDroneId());
        verify(repository, times(1)).save(feed);
    }
}