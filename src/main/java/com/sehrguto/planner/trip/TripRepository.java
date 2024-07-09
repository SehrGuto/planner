package com.sehrguto.planner.trip;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository <Trip, UUID> {
}
