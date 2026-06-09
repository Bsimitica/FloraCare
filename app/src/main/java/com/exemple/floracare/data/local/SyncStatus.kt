package com.exemple.floracare.data.local

enum class SyncStatus {
    NORMAL,      // Data in sync with server
    ADDED,       // Created locally, waiting for POST
    UPDATED,     // Modified locally, waiting for PUT
    DELETED      // Deleted locally (Soft Delete), waiting for DELETE
}
