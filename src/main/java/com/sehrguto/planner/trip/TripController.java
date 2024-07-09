package com.sehrguto.planner.trip;

import com.sehrguto.planner.participant.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trips")
public class TripController {

    //declare service
    @Autowired
    private ParticipantService participantService;

    //declare repository
    @Autowired
    private TripRepository repository;

    // method to create a new trip
    @PostMapping
    public ResponseEntity<String> createTrip(@RequestBody TripRequestPayload payload) {
        Trip newTrip = new Trip(payload);

        this.repository.save(newTrip);
        this.participantService.resgisterParticipantsToEvent(payload.emails_to_invite(), newTrip.getId());
        return ResponseEntity.ok("Sucesso");
    }

    }
