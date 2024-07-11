CREATE TABLE participants (
    id UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    is_confirmed BOOLEAN NOT NULL,
    trip_id UUID,
    FOREIGN KEY (trip_id) REFERENCES trips(id) ON DELETE CASCADE
)

-- on delete cascade: if the trip is deleted so are all participants related to it, careful changing migrations this is possible
-- cause we are using h2 in memory. other db we need to create a new migration to alter table properties