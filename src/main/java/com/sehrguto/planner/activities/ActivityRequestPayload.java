package com.sehrguto.planner.activities;

import java.time.LocalDateTime;

public record ActivityRequestPayload(String title, String occurs_at) {
}