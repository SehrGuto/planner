package com.sehrguto.planner.participant;

import com.sehrguto.planner.trip.Trip;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ParticipantService {

    // method to register participants
    public void resgisterParticipantsToEvent (List<String> participantsToInvite, UUID id){

    }

    // method to send emails to participants
    public void triggerConfirmationEmailToParticipants(UUID tripId){};
}
